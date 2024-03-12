package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PriorityIndicator extends LongRef {

  public static final long PRIORITY_UNCHANGED = 0;
  public static final long LOST_PRIORITY_AS_RESULT_OF_ORDER_CHANGE = 1;

  public PriorityIndicator(Message message) {
    super(message, FixTag.priorityIndicator);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> PRIORITY_UNCHANGED;
      case '1' -> LOST_PRIORITY_AS_RESULT_OF_ORDER_CHANGE;
      default -> throw new RuntimeException("value");
    };
  }
}