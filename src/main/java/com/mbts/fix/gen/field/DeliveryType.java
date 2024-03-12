package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class DeliveryType extends LongRef {

  public static final long VERSUS_PAYMENT_DELIVER = 0;
  public static final long TRI_PARTY = 2;
  public static final long FREE_DELIVER = 1;
  public static final long HOLD_IN_CUSTODY = 3;

  public DeliveryType(Message message) {
    super(message, FixTag.deliveryType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> VERSUS_PAYMENT_DELIVER;
      case '1' -> FREE_DELIVER;
      case '2' -> TRI_PARTY;
      case '3' -> HOLD_IN_CUSTODY;
      default -> throw new RuntimeException("value");
    };
  }
}