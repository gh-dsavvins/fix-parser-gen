package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PosAmtType extends StringRef {

  public static final String TRADE_VARIATION_AMOUNT = "TVAR";
  public static final String CASH_AMOUNT = "CASH";
  public static final String FINAL_MARK_TO_MARKET_AMOUNT = "FMTM";
  public static final String INCREMENTAL_MARK_TO_MARKET_AMOUNT = "IMTM";
  public static final String CASH_RESIDUAL_AMOUNT = "CRES";
  public static final String PREMIUM_AMOUNT = "PREM";
  public static final String VALUE_ADJUSTED_AMOUNT = "VADJ";
  public static final String START_OF_DAY_MARK_TO_MARKET_AMOUNT = "SMTM";

  public PosAmtType(Message message) {
    super(message, FixTag.posAmtType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'C' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> CASH_AMOUNT;
        case 'R' -> CASH_RESIDUAL_AMOUNT;
        default -> throw new RuntimeException("value");
      };
      case 'F' -> FINAL_MARK_TO_MARKET_AMOUNT;
      case 'I' -> INCREMENTAL_MARK_TO_MARKET_AMOUNT;
      case 'P' -> PREMIUM_AMOUNT;
      case 'S' -> START_OF_DAY_MARK_TO_MARKET_AMOUNT;
      case 'T' -> TRADE_VARIATION_AMOUNT;
      case 'V' -> VALUE_ADJUSTED_AMOUNT;
      default -> throw new RuntimeException("value");
    };
  }
}