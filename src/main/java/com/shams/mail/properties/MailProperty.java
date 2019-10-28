package com.shams.mail.properties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailProperty {
  private String username;
  private String fromAddress;
  private String createUserSubject;
}
