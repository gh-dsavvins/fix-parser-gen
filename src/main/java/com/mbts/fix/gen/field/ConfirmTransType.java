package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ConfirmTransType extends LongRef {

  public static final long REPLACE = 1;
  public static final long NEW = 0;
  public static final long CANCEL = 2;

  public ConfirmTransType(Message message) {
    super(message, FixTag.confirmTransType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> NEW;
      case '1' -> REPLACE;
      case '2' -> CANCEL;
      default -> throw new RuntimeException("value");
    };
  }
}