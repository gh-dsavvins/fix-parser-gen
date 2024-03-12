package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class BasisPxType extends StringRef {

  public static final String CLOSING_PRICE_AT_MORNING_SESSION = "2";
  public static final String VWAP_THROUGH_A_MORNING_SESSION = "7";
  public static final String VWAP_THROUGH_A_MORNING_SESSION_EXCEPT_YORI = "A";
  public static final String VWAP_THROUGH_AN_AFTERNOON_SESSION = "8";
  public static final String OPEN = "D";
  public static final String VWAP_THROUGH_AN_AFTERNOON_SESSION_EXCEPT_YORI = "B";
  public static final String CLOSING_PRICE = "3";
  public static final String CURRENT_PRICE = "4";
  public static final String SQ = "5";
  public static final String VWAP_THROUGH_A_DAY_EXCEPT_YORI = "9";
  public static final String VWAP_THROUGH_A_DAY = "6";
  public static final String STRIKE = "C";
  public static final String OTHERS = "Z";

  public BasisPxType(Message message) {
    super(message, FixTag.basisPxType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '2' -> CLOSING_PRICE_AT_MORNING_SESSION;
      case '3' -> CLOSING_PRICE;
      case '4' -> CURRENT_PRICE;
      case '5' -> SQ;
      case '6' -> VWAP_THROUGH_A_DAY;
      case '7' -> VWAP_THROUGH_A_MORNING_SESSION;
      case '8' -> VWAP_THROUGH_AN_AFTERNOON_SESSION;
      case '9' -> VWAP_THROUGH_A_DAY_EXCEPT_YORI;
      case 'A' -> VWAP_THROUGH_A_MORNING_SESSION_EXCEPT_YORI;
      case 'B' -> VWAP_THROUGH_AN_AFTERNOON_SESSION_EXCEPT_YORI;
      case 'C' -> STRIKE;
      case 'D' -> OPEN;
      case 'Z' -> OTHERS;
      default -> throw new RuntimeException("value");
    };
  }
}