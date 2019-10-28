package com.shams.mail.controllers;

import com.shams.mail.models.User;
import com.shams.mail.services.MailService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

  private final MailService mailService;

  public RegistrationController(MailService mailService) {
    this.mailService = mailService;
  }

  @RequestMapping("/signup")
  public String signUp() {
    return "Please sign up for our service";
  }

  @RequestMapping("/signup-success")
  public String signUpSuccess() {
    User user = User.builder()
        .fName("Shams")
        .lName("Tabrez")
        .email("shams.tabrez11@gmail.com")
        .build();
    mailService.sendMail(user);
    return "Thank you for registering with us";
  }
}
