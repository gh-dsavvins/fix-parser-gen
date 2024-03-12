package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AllocCancReplaceReason extends LongRef {

  public static final long ORIGINAL_DETAILS_INCOMPLETE_INCORRECT = 1;
  public static final long CHANGE_IN_UNDERLYING_ORDER_DETAILS = 2;
  public static final long OTHER = 99;

  public AllocCancReplaceReason(Message message) {
    super(message, FixTag.allocCancReplaceReason);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> ORIGINAL_DETAILS_INCOMPLETE_INCORRECT;
      case '2' -> CHANGE_IN_UNDERLYING_ORDER_DETAILS;
      case '9' -> OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}