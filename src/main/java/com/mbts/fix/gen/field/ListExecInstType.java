package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ListExecInstType extends StringRef {

  public static final String EXCHANGE_SWITCH_CIV_ORDER_BUY_DRIVEN_CASH_TOP_UP = "4";
  public static final String EXCHANGE_SWITCH_CIV_ORDER_BUY_DRIVEN_CASH_WITHDRAW = "5";
  public static final String WAIT_FOR_EXECUTE_INSTRUCTION = "2";
  public static final String IMMEDIATE = "1";
  public static final String EXCHANGE_SWITCH_CIV_ORDER_SELL_DRIVEN = "3";

  public ListExecInstType(Message message) {
    super(message, FixTag.listExecInstType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> IMMEDIATE;
      case '2' -> WAIT_FOR_EXECUTE_INSTRUCTION;
      case '3' -> EXCHANGE_SWITCH_CIV_ORDER_SELL_DRIVEN;
      case '4' -> EXCHANGE_SWITCH_CIV_ORDER_BUY_DRIVEN_CASH_TOP_UP;
      case '5' -> EXCHANGE_SWITCH_CIV_ORDER_BUY_DRIVEN_CASH_WITHDRAW;
      default -> throw new RuntimeException("value");
    };
  }
}