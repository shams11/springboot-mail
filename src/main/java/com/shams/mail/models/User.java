package com.shams.mail.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class User {

  String fName;

  String lName;

  String email;
}
