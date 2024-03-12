package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class Urgency extends StringRef {

  public static final String NORMAL = "0";
  public static final String FLASH = "1";
  public static final String BACKGROUND = "2";

  public Urgency(Message message) {
    super(message, FixTag.urgency);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> NORMAL;
      case '1' -> FLASH;
      case '2' -> BACKGROUND;
      default -> throw new RuntimeException("value");
    };
  }
}