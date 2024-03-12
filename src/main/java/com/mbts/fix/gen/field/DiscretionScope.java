package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class DiscretionScope extends LongRef {

  public static final long NATIONAL_EXCLUDING_LOCAL = 4;
  public static final long LOCAL = 1;
  public static final long NATIONAL = 2;
  public static final long GLOBAL = 3;

  public DiscretionScope(Message message) {
    super(message, FixTag.discretionScope);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> LOCAL;
      case '2' -> NATIONAL;
      case '3' -> GLOBAL;
      case '4' -> NATIONAL_EXCLUDING_LOCAL;
      default -> throw new RuntimeException("value");
    };
  }
}