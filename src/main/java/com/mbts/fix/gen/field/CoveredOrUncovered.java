package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CoveredOrUncovered extends LongRef {

  public static final long COVERED = 0;
  public static final long UNCOVERED = 1;

  public CoveredOrUncovered(Message message) {
    super(message, FixTag.coveredOrUncovered);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> COVERED;
      case '1' -> UNCOVERED;
      default -> throw new RuntimeException("value");
    };
  }
}