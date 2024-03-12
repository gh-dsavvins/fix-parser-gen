package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class EmailType extends StringRef {

  public static final String NEW = "0";
  public static final String REPLY = "1";
  public static final String ADMIN_REPLY = "2";

  public EmailType(Message message) {
    super(message, FixTag.emailType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> NEW;
      case '1' -> REPLY;
      case '2' -> ADMIN_REPLY;
      default -> throw new RuntimeException("value");
    };
  }
}