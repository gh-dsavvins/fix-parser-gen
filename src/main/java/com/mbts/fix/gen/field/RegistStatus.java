package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class RegistStatus extends StringRef {

  public static final String HELD = "H";
  public static final String ACCEPTED = "A";
  public static final String REJECTED = "R";
  public static final String REMINDER_IE_REGISTRATION_INSTRUCTIONS_ARE_STILL_OUTSTANDING = "N";

  public RegistStatus(Message message) {
    super(message, FixTag.registStatus);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'A' -> ACCEPTED;
      case 'H' -> HELD;
      case 'N' -> REMINDER_IE_REGISTRATION_INSTRUCTIONS_ARE_STILL_OUTSTANDING;
      case 'R' -> REJECTED;
      default -> throw new RuntimeException("value");
    };
  }
}