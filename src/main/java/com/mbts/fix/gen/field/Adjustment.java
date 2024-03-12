package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class Adjustment extends LongRef {

  public static final long ERROR = 2;
  public static final long CANCEL = 1;
  public static final long CORRECTION = 3;

  public Adjustment(Message message) {
    super(message, FixTag.adjustment);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> CANCEL;
      case '2' -> ERROR;
      case '3' -> CORRECTION;
      default -> throw new RuntimeException("value");
    };
  }
}