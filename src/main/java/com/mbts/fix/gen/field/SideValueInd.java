package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SideValueInd extends LongRef {

  public static final long SIDEVALUE1 = 1;
  public static final long SIDEVALUE_2 = 2;

  public SideValueInd(Message message) {
    super(message, FixTag.sideValueInd);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> SIDEVALUE1;
      case '2' -> SIDEVALUE_2;
      default -> throw new RuntimeException("value");
    };
  }
}