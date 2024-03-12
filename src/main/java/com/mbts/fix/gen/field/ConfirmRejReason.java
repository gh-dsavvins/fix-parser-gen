package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ConfirmRejReason extends LongRef {

  public static final long MISMATCHED_ACCOUNT = 1;
  public static final long MISSING_SETTLEMENT_INSTRUCTIONS = 2;
  public static final long OTHER = 99;

  public ConfirmRejReason(Message message) {
    super(message, FixTag.confirmRejReason);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> MISMATCHED_ACCOUNT;
      case '2' -> MISSING_SETTLEMENT_INSTRUCTIONS;
      case '9' -> OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}