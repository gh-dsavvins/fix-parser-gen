package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AllocReportType extends LongRef {

  public static final long SELLSIDE_CALCULATED_WITHOUT_PRELIMINARY = 4;
  public static final long REQUEST_TO_INTERMEDIARY = 8;
  public static final long SELLSIDE_CALCULATED_USING_PRELIMINARY = 3;
  public static final long WAREHOUSE_RECAP = 5;

  public AllocReportType(Message message) {
    super(message, FixTag.allocReportType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '3' -> SELLSIDE_CALCULATED_USING_PRELIMINARY;
      case '4' -> SELLSIDE_CALCULATED_WITHOUT_PRELIMINARY;
      case '5' -> WAREHOUSE_RECAP;
      case '8' -> REQUEST_TO_INTERMEDIARY;
      default -> throw new RuntimeException("value");
    };
  }
}