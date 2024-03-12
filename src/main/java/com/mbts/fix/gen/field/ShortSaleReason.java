package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ShortSaleReason extends LongRef {

  public static final long SELLING_CUSTOMER_SOLD_SHORT_EXEMPT = 3;
  public static final long SELLING_CUSTOMER_SOLD_SHORT = 2;
  public static final long DEALER_SOLD_SHORT = 0;
  public static final long QUALIFED_SERVICE_REPRESENTATIVE = 4;
  public static final long DEALER_SOLD_SHORT_EXEMPT = 1;
  public static final long QSR_OR_AGU_CONTRA_SIDE_SOLD_SHORT_EXEMPT = 5;

  public ShortSaleReason(Message message) {
    super(message, FixTag.shortSaleReason);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> DEALER_SOLD_SHORT;
      case '1' -> DEALER_SOLD_SHORT_EXEMPT;
      case '2' -> SELLING_CUSTOMER_SOLD_SHORT;
      case '3' -> SELLING_CUSTOMER_SOLD_SHORT_EXEMPT;
      case '4' -> QUALIFED_SERVICE_REPRESENTATIVE;
      case '5' -> QSR_OR_AGU_CONTRA_SIDE_SOLD_SHORT_EXEMPT;
      default -> throw new RuntimeException("value");
    };
  }
}