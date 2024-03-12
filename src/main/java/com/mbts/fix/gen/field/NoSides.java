package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class NoSides extends LongRef {

  public static final long BOTH_SIDES = 2;
  public static final long ONE_SIDE = 1;

  public NoSides(Message message) {
    super(message, FixTag.noSides);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> ONE_SIDE;
      case '2' -> BOTH_SIDES;
      default -> throw new RuntimeException("value");
    };
  }
}