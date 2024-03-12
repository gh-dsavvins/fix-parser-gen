package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TradeRequestStatus extends LongRef {

  public static final long COMPLETED = 1;
  public static final long ACCEPTED = 0;
  public static final long REJECTED = 2;

  public TradeRequestStatus(Message message) {
    super(message, FixTag.tradeRequestStatus);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> ACCEPTED;
      case '1' -> COMPLETED;
      case '2' -> REJECTED;
      default -> throw new RuntimeException("value");
    };
  }
}