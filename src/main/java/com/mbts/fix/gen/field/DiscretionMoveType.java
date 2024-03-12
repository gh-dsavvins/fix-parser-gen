package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class DiscretionMoveType extends LongRef {

  public static final long FIXED = 1;
  public static final long FLOATING = 0;

  public DiscretionMoveType(Message message) {
    super(message, FixTag.discretionMoveType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> FLOATING;
      case '1' -> FIXED;
      default -> throw new RuntimeException("value");
    };
  }
}