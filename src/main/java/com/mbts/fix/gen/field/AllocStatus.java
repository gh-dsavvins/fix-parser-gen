package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AllocStatus extends LongRef {

  public static final long ACCOUNT_LEVEL_REJECT = 2;
  public static final long RECEIVED = 3;
  public static final long BLOCK_LEVEL_REJECT = 1;
  public static final long INCOMPLETE = 4;
  public static final long REJECTED_BY_INTERMEDIARY = 5;
  public static final long ACCEPTED = 0;

  public AllocStatus(Message message) {
    super(message, FixTag.allocStatus);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> ACCEPTED;
      case '1' -> BLOCK_LEVEL_REJECT;
      case '2' -> ACCOUNT_LEVEL_REJECT;
      case '3' -> RECEIVED;
      case '4' -> INCOMPLETE;
      case '5' -> REJECTED_BY_INTERMEDIARY;
      default -> throw new RuntimeException("value");
    };
  }
}