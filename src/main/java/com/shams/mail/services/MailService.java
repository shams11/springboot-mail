package com.shams.mail.services;

import com.shams.mail.models.User;
import org.springframework.stereotype.Service;

@Service
public interface MailService {
   void sendMail(User user) ;
}
