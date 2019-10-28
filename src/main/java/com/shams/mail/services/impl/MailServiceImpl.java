package com.shams.mail.services.impl;

import com.shams.mail.models.User;
import com.shams.mail.properties.AppProperty;
import com.shams.mail.services.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

  private final JavaMailSender javaMailSender;
  private final AppProperty appProperty;

  @Autowired
  public MailServiceImpl(JavaMailSender javaMailSender, AppProperty appProperty) {
    this.javaMailSender = javaMailSender;
    this.appProperty = appProperty;
  }

  public void sendMail(User user) {

    SimpleMailMessage mail = new SimpleMailMessage();
    mail.setTo(user.getEmail());
    mail.setFrom(appProperty.getMail().getFromAddress());
    mail.setSubject(appProperty.getMail().getCreateUserSubject());
    mail.setText(" Test email from shams");
    javaMailSender.send(mail);
  }
}
