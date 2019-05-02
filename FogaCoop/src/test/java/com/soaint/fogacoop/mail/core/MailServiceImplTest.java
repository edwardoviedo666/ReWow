package com.soaint.fogacoop.mail.core;

import com.soaint.fogacoop.commons.domains.request.MailTemplate;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.mail.MessagingException;
import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@EnableJpaRepositories
@ComponentScan
@EnableAutoConfiguration
public class MailServiceImplTest {

    @Autowired
    private MailService mailService;

    @Test
    public void sendMessageWithTemplate() {

        try {

            mailService.sendMessageWithTemplate(MailTemplate.builder().from("")
                    .to("").subject("").build(), "");
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}