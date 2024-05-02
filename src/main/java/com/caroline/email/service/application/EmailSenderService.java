package com.caroline.email.service.application;

import com.caroline.email.service.adapters.EmailSenderGateway;
import com.caroline.email.service.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailsenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway){
        this.emailsenderGateway = emailGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailsenderGateway.sendEmail(to, subject,body);
    }
}
