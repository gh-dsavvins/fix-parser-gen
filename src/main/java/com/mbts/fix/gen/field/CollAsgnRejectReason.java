package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CollAsgnRejectReason extends LongRef {

  public static final long INVALID_TYPE_OF_COLLATERAL = 4;
  public static final long INSUFFICIENT_COLLATERAL = 3;
  public static final long EXCESSIVE_SUBSTITUTION = 5;
  public static final long UNAUTHORIZED_TRANSACTION = 2;
  public static final long OTHER = 99;
  public static final long UNKNOWN_DEAL = 0;
  public static final long UNKNOWN_OR_INVALID_INSTRUMENT = 1;

  public CollAsgnRejectReason(Message message) {
    super(message, FixTag.collAsgnRejectReason);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> UNKNOWN_DEAL;
      case '1' -> UNKNOWN_OR_INVALID_INSTRUMENT;
      case '2' -> UNAUTHORIZED_TRANSACTION;
      case '3' -> INSUFFICIENT_COLLATERAL;
      case '4' -> INVALID_TYPE_OF_COLLATERAL;
      case '5' -> EXCESSIVE_SUBSTITUTION;
      case '9' -> OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}