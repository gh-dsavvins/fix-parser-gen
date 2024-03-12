package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class BidType extends LongRef {

  public static final long NON_DISCLOSED_STYLE = 1;
  public static final long DISCLOSED_STYLE = 2;
  public static final long NO_BIDDING_PROCESS = 3;

  public BidType(Message message) {
    super(message, FixTag.bidType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> NON_DISCLOSED_STYLE;
      case '2' -> DISCLOSED_STYLE;
      case '3' -> NO_BIDDING_PROCESS;
      default -> throw new RuntimeException("value");
    };
  }
}