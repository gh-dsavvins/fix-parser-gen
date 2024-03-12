package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AdjustmentType extends LongRef {

  public static final long FINAL = 3;
  public static final long PROCESS_REQUEST_AS_MARGIN_DISPOSITION = 0;
  public static final long DELTA_MINUS = 2;
  public static final long DELTA_PLUS = 1;

  public AdjustmentType(Message message) {
    super(message, FixTag.adjustmentType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> PROCESS_REQUEST_AS_MARGIN_DISPOSITION;
      case '1' -> DELTA_PLUS;
      case '2' -> DELTA_MINUS;
      case '3' -> FINAL;
      default -> throw new RuntimeException("value");
    };
  }
}