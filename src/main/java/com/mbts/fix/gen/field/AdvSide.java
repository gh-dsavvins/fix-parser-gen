package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AdvSide extends StringRef {

  public static final String CROSS = "X";
  public static final String BUY = "B";
  public static final String SELL = "S";
  public static final String TRADE = "T";

  public AdvSide(Message message) {
    super(message, FixTag.advSide);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'B' -> BUY;
      case 'S' -> SELL;
      case 'T' -> TRADE;
      case 'X' -> CROSS;
      default -> throw new RuntimeException("value");
    };
  }
}