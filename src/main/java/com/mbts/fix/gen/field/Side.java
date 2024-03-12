package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class Side extends StringRef {

  public static final String AS_DEFINED = "B";
  public static final String UNDISCLOSED = "7";
  public static final String BUY = "1";
  public static final String SELL = "2";
  public static final String SELL_PLUS = "4";
  public static final String REDEEM = "E";
  public static final String BORROW = "G";
  public static final String CROSS_SHORT = "9";
  public static final String LEND = "F";
  public static final String CROSS = "8";
  public static final String SUBSCRIBE = "D";
  public static final String CROSS_SHORT_EXEMPT = "A";
  public static final String BUY_MINUS = "3";
  public static final String OPPOSITE = "C";
  public static final String SELL_SHORT_EXEMPT = "6";
  public static final String SELL_SHORT = "5";

  public Side(Message message) {
    super(message, FixTag.side);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> BUY;
      case '2' -> SELL;
      case '3' -> BUY_MINUS;
      case '4' -> SELL_PLUS;
      case '5' -> SELL_SHORT;
      case '6' -> SELL_SHORT_EXEMPT;
      case '7' -> UNDISCLOSED;
      case '8' -> CROSS;
      case '9' -> CROSS_SHORT;
      case 'A' -> CROSS_SHORT_EXEMPT;
      case 'B' -> AS_DEFINED;
      case 'C' -> OPPOSITE;
      case 'D' -> SUBSCRIBE;
      case 'E' -> REDEEM;
      case 'F' -> LEND;
      case 'G' -> BORROW;
      default -> throw new RuntimeException("value");
    };
  }
}