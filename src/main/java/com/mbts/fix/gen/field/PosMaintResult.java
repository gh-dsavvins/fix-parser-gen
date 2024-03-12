package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PosMaintResult extends LongRef {

  public static final long REJECTED = 1;
  public static final long OTHER = 99;
  public static final long SUCCESSFUL_COMPLETION = 0;

  public PosMaintResult(Message message) {
    super(message, FixTag.posMaintResult);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> SUCCESSFUL_COMPLETION;
      case '1' -> REJECTED;
      case '9' -> OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}