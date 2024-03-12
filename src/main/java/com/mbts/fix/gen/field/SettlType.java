package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SettlType extends StringRef {

  public static final String FUTURE = "6";
  public static final String WHEN_AND_IF_ISSUED = "7";
  public static final String T_PLUS_2 = "3";
  public static final String CASH = "1";
  public static final String T_PLUS_4 = "5";
  public static final String SELLERS_OPTION = "8";
  public static final String REGULAR = "0";
  public static final String T_PLUS_3 = "4";
  public static final String T_PLUS_5 = "9";
  public static final String NEXT_DAY = "2";

  public SettlType(Message message) {
    super(message, FixTag.settlType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> REGULAR;
      case '1' -> CASH;
      case '2' -> NEXT_DAY;
      case '3' -> T_PLUS_2;
      case '4' -> T_PLUS_3;
      case '5' -> T_PLUS_4;
      case '6' -> FUTURE;
      case '7' -> WHEN_AND_IF_ISSUED;
      case '8' -> SELLERS_OPTION;
      case '9' -> T_PLUS_5;
      default -> throw new RuntimeException("value");
    };
  }
}