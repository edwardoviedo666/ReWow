package com.soaint.fogacoop.mail.core;

import com.soaint.fogacoop.commons.domains.request.MailTemplate;
import freemarker.template.TemplateException;
import javax.mail.MessagingException;
import java.io.IOException;

public interface MailService {

    void sendMessageWithAttachment(final MailTemplate mailSend) throws MessagingException;

    void sendMessageWithTemplate(final MailTemplate mail, String templateName ) throws MessagingException, TemplateException, IOException;


}
