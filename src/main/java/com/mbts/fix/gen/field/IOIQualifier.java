package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class IOIQualifier extends StringRef {

  public static final String IN_TOUCH_WITH = "I";
  public static final String PORTFOLIO_SHOWN = "S";
  public static final String TAKING_A_POSITION = "P";
  public static final String THROUGH_THE_DAY = "T";
  public static final String ALL_OR_NONE = "A";
  public static final String MORE_BEHIND = "M";
  public static final String PRE_OPEN = "Z";
  public static final String LIMIT = "L";
  public static final String VERSUS = "V";
  public static final String VWAP = "D";
  public static final String READY_TO_TRADE = "R";
  public static final String CROSSING_OPPORTUNITY = "X";
  public static final String AT_THE_OPEN = "O";
  public static final String AT_THE_MARKET = "Q";
  public static final String AT_THE_CLOSE = "C";
  public static final String INDICATION = "W";
  public static final String MARKET_ON_CLOSE = "B";
  public static final String AT_THE_MIDPOINT = "Y";

  public IOIQualifier(Message message) {
    super(message, FixTag.iOIQualifier);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'A' -> ALL_OR_NONE;
      case 'B' -> MARKET_ON_CLOSE;
      case 'C' -> AT_THE_CLOSE;
      case 'D' -> VWAP;
      case 'I' -> IN_TOUCH_WITH;
      case 'L' -> LIMIT;
      case 'M' -> MORE_BEHIND;
      case 'O' -> AT_THE_OPEN;
      case 'P' -> TAKING_A_POSITION;
      case 'Q' -> AT_THE_MARKET;
      case 'R' -> READY_TO_TRADE;
      case 'S' -> PORTFOLIO_SHOWN;
      case 'T' -> THROUGH_THE_DAY;
      case 'V' -> VERSUS;
      case 'W' -> INDICATION;
      case 'X' -> CROSSING_OPPORTUNITY;
      case 'Y' -> AT_THE_MIDPOINT;
      case 'Z' -> PRE_OPEN;
      default -> throw new RuntimeException("value");
    };
  }
}