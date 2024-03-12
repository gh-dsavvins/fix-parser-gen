package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class QuoteType extends LongRef {

  public static final long TRADEABLE = 1;
  public static final long COUNTER = 3;
  public static final long RESTRICTED_TRADEABLE = 2;
  public static final long INDICATIVE = 0;

  public QuoteType(Message message) {
    super(message, FixTag.quoteType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> INDICATIVE;
      case '1' -> TRADEABLE;
      case '2' -> RESTRICTED_TRADEABLE;
      case '3' -> COUNTER;
      default -> throw new RuntimeException("value");
    };
  }
}