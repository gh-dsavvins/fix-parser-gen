package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TrdRptStatus extends LongRef {

  public static final long REJECTED = 1;
  public static final long ACCEPTED = 0;

  public TrdRptStatus(Message message) {
    super(message, FixTag.trdRptStatus);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> ACCEPTED;
      case '1' -> REJECTED;
      default -> throw new RuntimeException("value");
    };
  }
}