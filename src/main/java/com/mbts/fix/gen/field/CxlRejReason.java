package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CxlRejReason extends LongRef {

  public static final long ORIGORDMODTIME = 5;
  public static final long UNKNOWN_ORDER = 1;
  public static final long BROKER = 2;
  public static final long TOO_LATE_TO_CANCEL = 0;
  public static final long UNABLE_TO_PROCESS_ORDER_MASS_CANCEL_REQUEST = 4;
  public static final long ORDER_ALREADY_IN_PENDING_CANCEL_OR_PENDING_REPLACE_STATUS = 3;
  public static final long OTHER = 99;
  public static final long DUPLICATE_CLORDID = 6;

  public CxlRejReason(Message message) {
    super(message, FixTag.cxlRejReason);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> TOO_LATE_TO_CANCEL;
      case '1' -> UNKNOWN_ORDER;
      case '2' -> BROKER;
      case '3' -> ORDER_ALREADY_IN_PENDING_CANCEL_OR_PENDING_REPLACE_STATUS;
      case '4' -> UNABLE_TO_PROCESS_ORDER_MASS_CANCEL_REQUEST;
      case '5' -> ORIGORDMODTIME;
      case '6' -> DUPLICATE_CLORDID;
      case '9' -> OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}