package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PosTransType extends LongRef {

  public static final long PLEDGE = 5;
  public static final long POSITION_CHANGE_SUBMISSION_MARGIN_DISPOSITION = 4;
  public static final long DO_NOT_EXERCISE = 2;
  public static final long EXERCISE = 1;
  public static final long POSITION_ADJUSTMENT = 3;

  public PosTransType(Message message) {
    super(message, FixTag.posTransType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> EXERCISE;
      case '2' -> DO_NOT_EXERCISE;
      case '3' -> POSITION_ADJUSTMENT;
      case '4' -> POSITION_CHANGE_SUBMISSION_MARGIN_DISPOSITION;
      case '5' -> PLEDGE;
      default -> throw new RuntimeException("value");
    };
  }
}