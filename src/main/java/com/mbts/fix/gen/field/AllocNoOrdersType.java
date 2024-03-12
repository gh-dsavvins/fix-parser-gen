package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AllocNoOrdersType extends LongRef {

  public static final long NOT_SPECIFIED = 0;
  public static final long EXPLICIT_LIST_PROVIDED = 1;

  public AllocNoOrdersType(Message message) {
    super(message, FixTag.allocNoOrdersType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> NOT_SPECIFIED;
      case '1' -> EXPLICIT_LIST_PROVIDED;
      default -> throw new RuntimeException("value");
    };
  }
}