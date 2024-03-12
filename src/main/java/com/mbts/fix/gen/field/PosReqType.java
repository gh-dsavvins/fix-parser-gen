package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PosReqType extends LongRef {

  public static final long EXERCISES = 2;
  public static final long POSITIONS = 0;
  public static final long TRADES = 1;
  public static final long ASSIGNMENTS = 3;

  public PosReqType(Message message) {
    super(message, FixTag.posReqType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> POSITIONS;
      case '1' -> TRADES;
      case '2' -> EXERCISES;
      case '3' -> ASSIGNMENTS;
      default -> throw new RuntimeException("value");
    };
  }
}