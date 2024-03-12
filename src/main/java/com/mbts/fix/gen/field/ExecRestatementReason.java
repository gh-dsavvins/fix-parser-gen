package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ExecRestatementReason extends LongRef {

  public static final long PARTIAL_DECLINE_OF_ORDERQTY = 5;
  public static final long GT_CORPORATE_ACTION = 0;
  public static final long BROKER_OPTION = 4;
  public static final long CANCEL_ON_SYSTEM_FAILURE = 7;
  public static final long GT_RENEWAL = 1;
  public static final long REPRICING_OF_ORDER = 3;
  public static final long OTHER = 99;
  public static final long VERBAL_CHANGE = 2;
  public static final long MARKET = 8;
  public static final long WAREHOUSE_RECAP = 10;
  public static final long CANCEL_ON_TRADING_HALT = 6;
  public static final long CANCELED_NOT_BEST = 9;

  public ExecRestatementReason(Message message) {
    super(message, FixTag.execRestatementReason);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> GT_CORPORATE_ACTION;
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> GT_RENEWAL;
        case '0' -> WAREHOUSE_RECAP;
        default -> throw new RuntimeException("value");
      };
      case '2' -> VERBAL_CHANGE;
      case '3' -> REPRICING_OF_ORDER;
      case '4' -> BROKER_OPTION;
      case '5' -> PARTIAL_DECLINE_OF_ORDERQTY;
      case '6' -> CANCEL_ON_TRADING_HALT;
      case '7' -> CANCEL_ON_SYSTEM_FAILURE;
      case '8' -> MARKET;
      case '9' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> CANCELED_NOT_BEST;
        case '9' -> OTHER;
        default -> throw new RuntimeException("value");
      };
      default -> throw new RuntimeException("value");
    };
  }
}