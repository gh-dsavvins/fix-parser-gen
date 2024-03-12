package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class RoundingDirection extends StringRef {

  public static final String ROUND_TO_NEAREST = "0";
  public static final String ROUND_DOWN = "1";
  public static final String ROUND_UP = "2";

  public RoundingDirection(Message message) {
    super(message, FixTag.roundingDirection);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> ROUND_TO_NEAREST;
      case '1' -> ROUND_DOWN;
      case '2' -> ROUND_UP;
      default -> throw new RuntimeException("value");
    };
  }
}