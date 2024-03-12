package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ClearingInstruction extends LongRef {

  public static final long EX_CLEARING = 3;
  public static final long QUALIFIED_SERVICE_REPRESENTATIVE = 11;
  public static final long MANUAL_MODE = 8;
  public static final long MULTILATERAL_NETTING = 5;
  public static final long CUSTOMER_TRADE = 12;
  public static final long SELF_CLEARING = 13;
  public static final long CLEAR_AGAINST_CENTRAL_COUNTERPARTY = 6;
  public static final long AUTOMATIC_GIVE_UP_MODE = 10;
  public static final long PROCESS_NORMALLY = 0;
  public static final long EXCLUDE_FROM_CENTRAL_COUNTERPARTY = 7;
  public static final long BILATERAL_NETTING_ONLY = 2;
  public static final long EXCLUDE_FROM_ALL_NETTING = 1;
  public static final long AUTOMATIC_POSTING_MODE = 9;
  public static final long SPECIAL_TRADE = 4;

  public ClearingInstruction(Message message) {
    super(message, FixTag.clearingInstruction);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> PROCESS_NORMALLY;
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> EXCLUDE_FROM_ALL_NETTING;
        case '0' -> AUTOMATIC_GIVE_UP_MODE;
        case '1' -> QUALIFIED_SERVICE_REPRESENTATIVE;
        case '2' -> CUSTOMER_TRADE;
        case '3' -> SELF_CLEARING;
        default -> throw new RuntimeException("value");
      };
      case '2' -> BILATERAL_NETTING_ONLY;
      case '3' -> EX_CLEARING;
      case '4' -> SPECIAL_TRADE;
      case '5' -> MULTILATERAL_NETTING;
      case '6' -> CLEAR_AGAINST_CENTRAL_COUNTERPARTY;
      case '7' -> EXCLUDE_FROM_CENTRAL_COUNTERPARTY;
      case '8' -> MANUAL_MODE;
      case '9' -> AUTOMATIC_POSTING_MODE;
      default -> throw new RuntimeException("value");
    };
  }
}