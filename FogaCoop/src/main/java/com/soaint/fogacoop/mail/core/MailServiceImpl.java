package com.soaint.fogacoop.mail.core;

import com.soaint.fogacoop.commons.domains.request.MailTemplate;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
public class MailServiceImpl implements MailService {

    private FreeMarkerConfig freeMarkerConfig;
    private JavaMailSender emailSender;

    @Autowired
    public MailServiceImpl(FreeMarkerConfig freeMarkerConfig, JavaMailSender emailSender) {
        this.freeMarkerConfig = freeMarkerConfig;
        this.emailSender = emailSender;
    }

    @Override
    public void sendMessageWithAttachment(MailTemplate mailSend) throws MessagingException {

        MimeMessage message = emailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setTo(mailSend.getTo());
        helper.setSubject(mailSend.getSubject());

        FileSystemResource file = new FileSystemResource(new File(""));
        helper.addAttachment("Invoice", file);

        emailSender.send(message);
    }

    @Override
    public void sendMessageWithTemplate(MailTemplate mail, String templateName) throws MessagingException, TemplateException, IOException {
        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,
                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                StandardCharsets.UTF_8.name());

        helper.addAttachment("logo.png", new ClassPathResource("memorynotfound-logo.png"));

        Template t = freeMarkerConfig.getConfiguration().getTemplate(templateName);
        String html = FreeMarkerTemplateUtils.processTemplateIntoString(t, mail.getModel());

        helper.setTo(mail.getTo());
        helper.setText(html, true);
        helper.setSubject(mail.getSubject());
        helper.setFrom(mail.getFrom());

        emailSender.send(message);
    }
}
