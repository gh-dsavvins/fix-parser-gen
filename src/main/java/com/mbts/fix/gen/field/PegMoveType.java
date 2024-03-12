package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PegMoveType extends LongRef {

  public static final long FIXED = 1;
  public static final long FLOATING = 0;

  public PegMoveType(Message message) {
    super(message, FixTag.pegMoveType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> FLOATING;
      case '1' -> FIXED;
      default -> throw new RuntimeException("value");
    };
  }
}