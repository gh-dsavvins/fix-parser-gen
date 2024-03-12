package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PosReqStatus extends LongRef {

  public static final long COMPLETED_WITH_WARNINGS = 1;
  public static final long COMPLETED = 0;
  public static final long REJECTED = 2;

  public PosReqStatus(Message message) {
    super(message, FixTag.posReqStatus);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> COMPLETED;
      case '1' -> COMPLETED_WITH_WARNINGS;
      case '2' -> REJECTED;
      default -> throw new RuntimeException("value");
    };
  }
}