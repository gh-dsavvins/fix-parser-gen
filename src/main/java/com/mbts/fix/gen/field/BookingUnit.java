package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class BookingUnit extends StringRef {

  public static final String AGGREGATE_PARTIAL_EXECUTIONS_ON_THIS_ORDER_AND_BOOK_ONE_TRADE_PER_ORDER = "1";
  public static final String EACH_PARTIAL_EXECUTION_IS_A_BOOKABLE_UNIT = "0";
  public static final String AGGREGATE_EXECUTIONS_FOR_THIS_SYMBOL_SIDE_AND_SETTLEMENT_DATE = "2";

  public BookingUnit(Message message) {
    super(message, FixTag.bookingUnit);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> EACH_PARTIAL_EXECUTION_IS_A_BOOKABLE_UNIT;
      case '1' -> AGGREGATE_PARTIAL_EXECUTIONS_ON_THIS_ORDER_AND_BOOK_ONE_TRADE_PER_ORDER;
      case '2' -> AGGREGATE_EXECUTIONS_FOR_THIS_SYMBOL_SIDE_AND_SETTLEMENT_DATE;
      default -> throw new RuntimeException("value");
    };
  }
}