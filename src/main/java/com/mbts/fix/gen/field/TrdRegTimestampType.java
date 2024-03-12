package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TrdRegTimestampType extends LongRef {

  public static final long TIME_IN = 2;
  public static final long BROKER_EXECUTION = 5;
  public static final long TIME_OUT = 3;
  public static final long EXECUTION_TIME = 1;
  public static final long BROKER_RECEIPT = 4;

  public TrdRegTimestampType(Message message) {
    super(message, FixTag.trdRegTimestampType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> EXECUTION_TIME;
      case '2' -> TIME_IN;
      case '3' -> TIME_OUT;
      case '4' -> BROKER_RECEIPT;
      case '5' -> BROKER_EXECUTION;
      default -> throw new RuntimeException("value");
    };
  }
}