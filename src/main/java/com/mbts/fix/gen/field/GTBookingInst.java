package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class GTBookingInst extends LongRef {

  public static final long BOOK_OUT_ALL_TRADES_ON_DAY_OF_EXECUTION = 0;
  public static final long ACCUMULATE_UNTIL_VERBALLY_NOTIFIED_OTHERWISE = 2;
  public static final long ACCUMULATE_EXECUTIONS_UNTIL_ORDER_IS_FILLED_OR_EXPIRES = 1;

  public GTBookingInst(Message message) {
    super(message, FixTag.gTBookingInst);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> BOOK_OUT_ALL_TRADES_ON_DAY_OF_EXECUTION;
      case '1' -> ACCUMULATE_EXECUTIONS_UNTIL_ORDER_IS_FILLED_OR_EXPIRES;
      case '2' -> ACCUMULATE_UNTIL_VERBALLY_NOTIFIED_OTHERWISE;
      default -> throw new RuntimeException("value");
    };
  }
}