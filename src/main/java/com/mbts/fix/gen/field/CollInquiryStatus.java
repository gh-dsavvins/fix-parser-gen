package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CollInquiryStatus extends LongRef {

  public static final long COMPLETED_WITH_WARNINGS = 3;
  public static final long ACCEPTED_WITH_WARNINGS = 1;
  public static final long REJECTED = 4;
  public static final long COMPLETED = 2;
  public static final long ACCEPTED = 0;

  public CollInquiryStatus(Message message) {
    super(message, FixTag.collInquiryStatus);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> ACCEPTED;
      case '1' -> ACCEPTED_WITH_WARNINGS;
      case '2' -> COMPLETED;
      case '3' -> COMPLETED_WITH_WARNINGS;
      case '4' -> REJECTED;
      default -> throw new RuntimeException("value");
    };
  }
}