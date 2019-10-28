package com.shams.mail.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "spring")
public class AppProperty {

  MailProperty mail;
}
