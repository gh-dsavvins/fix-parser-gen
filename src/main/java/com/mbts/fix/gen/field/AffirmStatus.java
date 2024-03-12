package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AffirmStatus extends LongRef {

  public static final long AFFIRMED = 3;
  public static final long CONFIRM_REJECTED_IE_NOT_AFFIRMED = 2;
  public static final long RECEIVED = 1;

  public AffirmStatus(Message message) {
    super(message, FixTag.affirmStatus);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> RECEIVED;
      case '2' -> CONFIRM_REJECTED_IE_NOT_AFFIRMED;
      case '3' -> AFFIRMED;
      default -> throw new RuntimeException("value");
    };
  }
}