package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AllocLinkType extends LongRef {

  public static final long F_X_NETTING = 0;
  public static final long F_X_SWAP = 1;

  public AllocLinkType(Message message) {
    super(message, FixTag.allocLinkType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> F_X_NETTING;
      case '1' -> F_X_SWAP;
      default -> throw new RuntimeException("value");
    };
  }
}