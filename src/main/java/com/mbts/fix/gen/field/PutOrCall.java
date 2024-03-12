package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PutOrCall extends LongRef {

  public static final long PUT = 0;
  public static final long CALL = 1;

  public PutOrCall(Message message) {
    super(message, FixTag.putOrCall);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> PUT;
      case '1' -> CALL;
      default -> throw new RuntimeException("value");
    };
  }
}