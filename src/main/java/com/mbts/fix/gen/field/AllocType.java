package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AllocType extends LongRef {

  public static final long WAREHOUSE_INSTRUCTION = 7;
  public static final long PRELIMINARY = 2;
  public static final long REQUEST_TO_INTERMEDIARY = 8;
  public static final long READY_TO_BOOK = 5;
  public static final long CALCULATED = 1;

  public AllocType(Message message) {
    super(message, FixTag.allocType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> CALCULATED;
      case '2' -> PRELIMINARY;
      case '5' -> READY_TO_BOOK;
      case '7' -> WAREHOUSE_INSTRUCTION;
      case '8' -> REQUEST_TO_INTERMEDIARY;
      default -> throw new RuntimeException("value");
    };
  }
}