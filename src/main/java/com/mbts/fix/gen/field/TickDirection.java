package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TickDirection extends StringRef {

  public static final String PLUS_TICK = "0";
  public static final String MINUS_TICK = "2";
  public static final String ZERO_PLUS_TICK = "1";
  public static final String ZERO_MINUS_TICK = "3";

  public TickDirection(Message message) {
    super(message, FixTag.tickDirection);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> PLUS_TICK;
      case '1' -> ZERO_PLUS_TICK;
      case '2' -> MINUS_TICK;
      case '3' -> ZERO_MINUS_TICK;
      default -> throw new RuntimeException("value");
    };
  }
}