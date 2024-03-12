package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AllocIntermedReqType extends LongRef {

  public static final long ACCEPT = 4;
  public static final long ACCOUNT_LEVEL_REJECT = 6;
  public static final long PENDING_REVERSAL = 3;
  public static final long PENDING_ACCEPT = 1;
  public static final long PENDING_RELEASE = 2;
  public static final long BLOCK_LEVEL_REJECT = 5;

  public AllocIntermedReqType(Message message) {
    super(message, FixTag.allocIntermedReqType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> PENDING_ACCEPT;
      case '2' -> PENDING_RELEASE;
      case '3' -> PENDING_REVERSAL;
      case '4' -> ACCEPT;
      case '5' -> BLOCK_LEVEL_REJECT;
      case '6' -> ACCOUNT_LEVEL_REJECT;
      default -> throw new RuntimeException("value");
    };
  }
}