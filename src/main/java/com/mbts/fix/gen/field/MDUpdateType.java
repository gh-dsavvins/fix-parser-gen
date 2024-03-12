package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MDUpdateType extends LongRef {

  public static final long FULL_REFRESH = 0;
  public static final long INCREMENTAL_REFRESH = 1;

  public MDUpdateType(Message message) {
    super(message, FixTag.mDUpdateType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> FULL_REFRESH;
      case '1' -> INCREMENTAL_REFRESH;
      default -> throw new RuntimeException("value");
    };
  }
}