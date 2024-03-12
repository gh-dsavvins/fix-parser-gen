package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TradSesStatus extends LongRef {

  public static final long PRE_CLOSE = 5;
  public static final long REQUEST_REJECTED = 6;
  public static final long UNKNOWN = 0;
  public static final long HALTED = 1;
  public static final long OPEN = 2;
  public static final long CLOSED = 3;
  public static final long PRE_OPEN = 4;

  public TradSesStatus(Message message) {
    super(message, FixTag.tradSesStatus);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> UNKNOWN;
      case '1' -> HALTED;
      case '2' -> OPEN;
      case '3' -> CLOSED;
      case '4' -> PRE_OPEN;
      case '5' -> PRE_CLOSE;
      case '6' -> REQUEST_REJECTED;
      default -> throw new RuntimeException("value");
    };
  }
}