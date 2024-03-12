package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class OrdType extends StringRef {

  public static final String STOP = "3";
  public static final String LIMIT_OR_BETTER = "7";
  public static final String STOP_LIMIT = "4";
  public static final String PEGGED = "P";
  public static final String LIMIT_WITH_OR_WITHOUT = "8";
  public static final String PREVIOUSLY_QUOTED = "D";
  public static final String LIMIT = "2";
  public static final String ON_BASIS = "9";
  public static final String PREVIOUSLY_INDICATED = "E";
  public static final String FUNARI = "I";
  public static final String NEXT_FUND_VALUATION_POINT = "M";
  public static final String WITH_OR_WITHOUT = "6";
  public static final String FOREX = "G";
  public static final String MARKET_IF_TOUCHED = "J";
  public static final String MARKET_WITH_LEFTOVER_AS_LIMIT = "K";
  public static final String MARKET = "1";
  public static final String PREVIOUS_FUND_VALUATION_POINT = "L";

  public OrdType(Message message) {
    super(message, FixTag.ordType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> MARKET;
      case '2' -> LIMIT;
      case '3' -> STOP;
      case '4' -> STOP_LIMIT;
      case '6' -> WITH_OR_WITHOUT;
      case '7' -> LIMIT_OR_BETTER;
      case '8' -> LIMIT_WITH_OR_WITHOUT;
      case '9' -> ON_BASIS;
      case 'D' -> PREVIOUSLY_QUOTED;
      case 'E' -> PREVIOUSLY_INDICATED;
      case 'G' -> FOREX;
      case 'I' -> FUNARI;
      case 'J' -> MARKET_IF_TOUCHED;
      case 'K' -> MARKET_WITH_LEFTOVER_AS_LIMIT;
      case 'L' -> PREVIOUS_FUND_VALUATION_POINT;
      case 'M' -> NEXT_FUND_VALUATION_POINT;
      case 'P' -> PEGGED;
      default -> throw new RuntimeException("value");
    };
  }
}