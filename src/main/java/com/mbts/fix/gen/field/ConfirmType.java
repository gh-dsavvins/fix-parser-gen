package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ConfirmType extends LongRef {

  public static final long STATUS = 1;
  public static final long CONFIRMATION = 2;
  public static final long CONFIRMATION_REQUEST_REJECTED = 3;

  public ConfirmType(Message message) {
    super(message, FixTag.confirmType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> STATUS;
      case '2' -> CONFIRMATION;
      case '3' -> CONFIRMATION_REQUEST_REJECTED;
      default -> throw new RuntimeException("value");
    };
  }
}