package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class RoutingType extends LongRef {

  public static final long BLOCK_FIRM = 3;
  public static final long BLOCK_LIST = 4;
  public static final long TARGET_FIRM = 1;
  public static final long TARGET_LIST = 2;

  public RoutingType(Message message) {
    super(message, FixTag.routingType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> TARGET_FIRM;
      case '2' -> TARGET_LIST;
      case '3' -> BLOCK_FIRM;
      case '4' -> BLOCK_LIST;
      default -> throw new RuntimeException("value");
    };
  }
}