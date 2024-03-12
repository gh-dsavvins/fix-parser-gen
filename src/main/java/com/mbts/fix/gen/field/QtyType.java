package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class QtyType extends LongRef {

  public static final long CONTRACTS = 1;
  public static final long UNITS = 0;

  public QtyType(Message message) {
    super(message, FixTag.qtyType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> UNITS;
      case '1' -> CONTRACTS;
      default -> throw new RuntimeException("value");
    };
  }
}