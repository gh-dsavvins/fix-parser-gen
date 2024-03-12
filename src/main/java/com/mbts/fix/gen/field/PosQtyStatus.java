package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PosQtyStatus extends LongRef {

  public static final long ACCEPTED = 1;
  public static final long SUBMITTED = 0;
  public static final long REJECTED = 2;

  public PosQtyStatus(Message message) {
    super(message, FixTag.posQtyStatus);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> SUBMITTED;
      case '1' -> ACCEPTED;
      case '2' -> REJECTED;
      default -> throw new RuntimeException("value");
    };
  }
}