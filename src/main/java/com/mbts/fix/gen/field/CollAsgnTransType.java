package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CollAsgnTransType extends LongRef {

  public static final long REPLACE = 1;
  public static final long NEW = 0;
  public static final long CANCEL = 2;
  public static final long REVERSE = 4;
  public static final long RELEASE = 3;

  public CollAsgnTransType(Message message) {
    super(message, FixTag.collAsgnTransType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> NEW;
      case '1' -> REPLACE;
      case '2' -> CANCEL;
      case '3' -> RELEASE;
      case '4' -> REVERSE;
      default -> throw new RuntimeException("value");
    };
  }
}