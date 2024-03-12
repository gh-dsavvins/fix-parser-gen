package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SettlInstReqRejCode extends LongRef {

  public static final long NO_MATCHING_SETTLEMENT_INSTRUCTIONS_FOUND = 2;
  public static final long OTHER = 99;
  public static final long UNKNOWN_ACCOUNT = 1;
  public static final long UNABLE_TO_PROCESS_REQUEST = 0;

  public SettlInstReqRejCode(Message message) {
    super(message, FixTag.settlInstReqRejCode);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> UNABLE_TO_PROCESS_REQUEST;
      case '1' -> UNKNOWN_ACCOUNT;
      case '2' -> NO_MATCHING_SETTLEMENT_INSTRUCTIONS_FOUND;
      case '9' -> OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}