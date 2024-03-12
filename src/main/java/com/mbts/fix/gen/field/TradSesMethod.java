package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TradSesMethod extends LongRef {

  public static final long OPEN_OUTCRY = 2;
  public static final long ELECTRONIC = 1;
  public static final long TWO_PARTY = 3;

  public TradSesMethod(Message message) {
    super(message, FixTag.tradSesMethod);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> ELECTRONIC;
      case '2' -> OPEN_OUTCRY;
      case '3' -> TWO_PARTY;
      default -> throw new RuntimeException("value");
    };
  }
}