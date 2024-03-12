package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TrdType extends LongRef {

  public static final long WEIGHTED_AVERAGE_PRICE_TRADE = 6;
  public static final long AFTER_HOURS_TRADE = 10;
  public static final long BLOCK_TRADE = 1;
  public static final long BUNCHED_TRADE = 7;
  public static final long T_TRADE = 5;
  public static final long PRIOR_REFERENCE_PRICE_TRADE = 9;
  public static final long EFP = 2;
  public static final long LATE_TRADE = 4;
  public static final long LATE_BUNCHED_TRADE = 8;
  public static final long TRANSFER = 3;
  public static final long REGULAR_TRADE = 0;

  public TrdType(Message message) {
    super(message, FixTag.trdType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> REGULAR_TRADE;
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> BLOCK_TRADE;
        case '0' -> AFTER_HOURS_TRADE;
        default -> throw new RuntimeException("value");
      };
      case '2' -> EFP;
      case '3' -> TRANSFER;
      case '4' -> LATE_TRADE;
      case '5' -> T_TRADE;
      case '6' -> WEIGHTED_AVERAGE_PRICE_TRADE;
      case '7' -> BUNCHED_TRADE;
      case '8' -> LATE_BUNCHED_TRADE;
      case '9' -> PRIOR_REFERENCE_PRICE_TRADE;
      default -> throw new RuntimeException("value");
    };
  }
}