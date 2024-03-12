package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MiscFeeBasis extends LongRef {

  public static final long PER_UNIT = 1;
  public static final long ABSOLUTE = 0;
  public static final long PERCENTAGE = 2;

  public MiscFeeBasis(Message message) {
    super(message, FixTag.miscFeeBasis);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> ABSOLUTE;
      case '1' -> PER_UNIT;
      case '2' -> PERCENTAGE;
      default -> throw new RuntimeException("value");
    };
  }
}