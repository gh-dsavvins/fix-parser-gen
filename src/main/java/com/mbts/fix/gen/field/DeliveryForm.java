package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class DeliveryForm extends LongRef {

  public static final long BOOKENTRY = 1;
  public static final long BEARER = 2;

  public DeliveryForm(Message message) {
    super(message, FixTag.deliveryForm);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> BOOKENTRY;
      case '2' -> BEARER;
      default -> throw new RuntimeException("value");
    };
  }
}