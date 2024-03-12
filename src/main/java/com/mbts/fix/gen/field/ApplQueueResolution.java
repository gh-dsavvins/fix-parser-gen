package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ApplQueueResolution extends LongRef {

  public static final long QUEUE_FLUSHED = 1;
  public static final long OVERLAY_LAST = 2;
  public static final long NO_ACTION_TAKEN = 0;
  public static final long END_SESSION = 3;

  public ApplQueueResolution(Message message) {
    super(message, FixTag.applQueueResolution);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> NO_ACTION_TAKEN;
      case '1' -> QUEUE_FLUSHED;
      case '2' -> OVERLAY_LAST;
      case '3' -> END_SESSION;
      default -> throw new RuntimeException("value");
    };
  }
}