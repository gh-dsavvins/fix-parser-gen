package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class NetGrossInd extends LongRef {

  public static final long GROSS = 2;
  public static final long NET = 1;

  public NetGrossInd(Message message) {
    super(message, FixTag.netGrossInd);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> NET;
      case '2' -> GROSS;
      default -> throw new RuntimeException("value");
    };
  }
}