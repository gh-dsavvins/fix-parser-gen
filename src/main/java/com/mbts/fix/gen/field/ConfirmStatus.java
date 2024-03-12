package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ConfirmStatus extends LongRef {

  public static final long MISMATCHED_ACCOUNT = 2;
  public static final long RECEIVED = 1;
  public static final long MISSING_SETTLEMENT_INSTRUCTIONS = 3;
  public static final long CONFIRMED = 4;
  public static final long REQUEST_REJECTED = 5;

  public ConfirmStatus(Message message) {
    super(message, FixTag.confirmStatus);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> RECEIVED;
      case '2' -> MISMATCHED_ACCOUNT;
      case '3' -> MISSING_SETTLEMENT_INSTRUCTIONS;
      case '4' -> CONFIRMED;
      case '5' -> REQUEST_REJECTED;
      default -> throw new RuntimeException("value");
    };
  }
}