package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CPProgram extends LongRef {

  public static final long _3 = 1;
  public static final long _4 = 2;
  public static final long OTHER = 99;

  public CPProgram(Message message) {
    super(message, FixTag.cPProgram);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> _3;
      case '2' -> _4;
      case '9' -> OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}