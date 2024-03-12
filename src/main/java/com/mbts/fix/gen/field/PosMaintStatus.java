package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PosMaintStatus extends LongRef {

  public static final long COMPLETED = 3;
  public static final long ACCEPTED_WITH_WARNINGS = 1;
  public static final long COMPLETED_WITH_WARNINGS = 4;
  public static final long ACCEPTED = 0;
  public static final long REJECTED = 2;

  public PosMaintStatus(Message message) {
    super(message, FixTag.posMaintStatus);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> ACCEPTED;
      case '1' -> ACCEPTED_WITH_WARNINGS;
      case '2' -> REJECTED;
      case '3' -> COMPLETED;
      case '4' -> COMPLETED_WITH_WARNINGS;
      default -> throw new RuntimeException("value");
    };
  }
}