package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MiscFeeType extends StringRef {

  public static final String LOCAL_COMMISSION = "3";
  public static final String OTHER = "7";
  public static final String PER_TRANSACTION = "10";
  public static final String EXCHANGE_FEES = "4";
  public static final String REGULATORY = "1";
  public static final String STAMP = "5";
  public static final String CONSUMPTION_TAX = "9";
  public static final String MARKUP = "8";
  public static final String CONVERSION = "11";
  public static final String AGENT = "12";
  public static final String TAX = "2";
  public static final String LEVY = "6";

  public MiscFeeType(Message message) {
    super(message, FixTag.miscFeeType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> REGULATORY;
        case '0' -> PER_TRANSACTION;
        case '1' -> CONVERSION;
        case '2' -> AGENT;
        default -> throw new RuntimeException("value");
      };
      case '2' -> TAX;
      case '3' -> LOCAL_COMMISSION;
      case '4' -> EXCHANGE_FEES;
      case '5' -> STAMP;
      case '6' -> LEVY;
      case '7' -> OTHER;
      case '8' -> MARKUP;
      case '9' -> CONSUMPTION_TAX;
      default -> throw new RuntimeException("value");
    };
  }
}