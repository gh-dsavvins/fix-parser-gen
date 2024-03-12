package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class HandlInst extends StringRef {

  public static final String MANUAL_ORDER_BEST_EXECUTION = "3";
  public static final String AUTOMATED_EXECUTION_ORDER_PRIVATE_NO_BROKER_INTERVENTION = "1";
  public static final String AUTOMATED_EXECUTION_ORDER_PUBLIC_BROKER_INTERVENTION_OK = "2";

  public HandlInst(Message message) {
    super(message, FixTag.handlInst);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> AUTOMATED_EXECUTION_ORDER_PRIVATE_NO_BROKER_INTERVENTION;
      case '2' -> AUTOMATED_EXECUTION_ORDER_PUBLIC_BROKER_INTERVENTION_OK;
      case '3' -> MANUAL_ORDER_BEST_EXECUTION;
      default -> throw new RuntimeException("value");
    };
  }
}