package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CollStatus extends LongRef {

  public static final long UNASSIGNED = 0;
  public static final long ASSIGNMENT_PROPOSED = 2;
  public static final long CHALLENGED = 4;
  public static final long PARTIALLY_ASSIGNED = 1;
  public static final long ASSIGNED = 3;

  public CollStatus(Message message) {
    super(message, FixTag.collStatus);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> UNASSIGNED;
      case '1' -> PARTIALLY_ASSIGNED;
      case '2' -> ASSIGNMENT_PROPOSED;
      case '3' -> ASSIGNED;
      case '4' -> CHALLENGED;
      default -> throw new RuntimeException("value");
    };
  }
}