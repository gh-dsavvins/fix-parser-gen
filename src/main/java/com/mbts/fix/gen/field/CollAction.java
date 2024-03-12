package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CollAction extends LongRef {

  public static final long REMOVE = 2;
  public static final long ADD = 1;
  public static final long RETAIN = 0;

  public CollAction(Message message) {
    super(message, FixTag.collAction);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> RETAIN;
      case '1' -> ADD;
      case '2' -> REMOVE;
      default -> throw new RuntimeException("value");
    };
  }
}