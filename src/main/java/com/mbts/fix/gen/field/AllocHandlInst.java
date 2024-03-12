package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AllocHandlInst extends LongRef {

  public static final long FORWARD_AND_MATCH = 3;
  public static final long FORWARD = 2;
  public static final long MATCH = 1;

  public AllocHandlInst(Message message) {
    super(message, FixTag.allocHandlInst);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> MATCH;
      case '2' -> FORWARD;
      case '3' -> FORWARD_AND_MATCH;
      default -> throw new RuntimeException("value");
    };
  }
}