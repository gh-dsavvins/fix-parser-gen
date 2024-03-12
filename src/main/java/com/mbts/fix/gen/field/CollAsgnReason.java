package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CollAsgnReason extends LongRef {

  public static final long INITIAL = 0;
  public static final long FORWARD_COLLATERAL_DEMAND = 5;
  public static final long EVENT_OF_DEFAULT = 6;
  public static final long ADVERSE_TAX_EVENT = 7;
  public static final long MARGIN_EXCESS = 4;
  public static final long MARGIN_DEFICIENCY = 3;
  public static final long SCHEDULED = 1;
  public static final long TIME_WARNING = 2;

  public CollAsgnReason(Message message) {
    super(message, FixTag.collAsgnReason);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> INITIAL;
      case '1' -> SCHEDULED;
      case '2' -> TIME_WARNING;
      case '3' -> MARGIN_DEFICIENCY;
      case '4' -> MARGIN_EXCESS;
      case '5' -> FORWARD_COLLATERAL_DEMAND;
      case '6' -> EVENT_OF_DEFAULT;
      case '7' -> ADVERSE_TAX_EVENT;
      default -> throw new RuntimeException("value");
    };
  }
}