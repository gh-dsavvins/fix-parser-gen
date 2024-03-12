package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TerminationType extends LongRef {

  public static final long FLEXIBLE = 3;
  public static final long OVERNIGHT = 1;
  public static final long TERM = 2;
  public static final long OPEN = 4;

  public TerminationType(Message message) {
    super(message, FixTag.terminationType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> OVERNIGHT;
      case '2' -> TERM;
      case '3' -> FLEXIBLE;
      case '4' -> OPEN;
      default -> throw new RuntimeException("value");
    };
  }
}