package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class QuoteRespType extends LongRef {

  public static final long HIT_LIFT = 1;
  public static final long COVER = 4;
  public static final long COUNTER = 2;
  public static final long PASS = 6;
  public static final long DONE_AWAY = 5;
  public static final long EXPIRED = 3;

  public QuoteRespType(Message message) {
    super(message, FixTag.quoteRespType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> HIT_LIFT;
      case '2' -> COUNTER;
      case '3' -> EXPIRED;
      case '4' -> COVER;
      case '5' -> DONE_AWAY;
      case '6' -> PASS;
      default -> throw new RuntimeException("value");
    };
  }
}