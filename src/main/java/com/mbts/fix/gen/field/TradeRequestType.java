package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TradeRequestType extends LongRef {

  public static final long ADVISORIES_THAT_MATCH_CRITERIA = 4;
  public static final long ALL_TRADES = 0;
  public static final long MATCHED_TRADES_MATCHING_CRITERIA_PROVIDED_ON_REQUEST = 1;
  public static final long UNREPORTED_TRADES_THAT_MATCH_CRITERIA = 3;
  public static final long UNMATCHED_TRADES_THAT_MATCH_CRITERIA = 2;

  public TradeRequestType(Message message) {
    super(message, FixTag.tradeRequestType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> ALL_TRADES;
      case '1' -> MATCHED_TRADES_MATCHING_CRITERIA_PROVIDED_ON_REQUEST;
      case '2' -> UNMATCHED_TRADES_THAT_MATCH_CRITERIA;
      case '3' -> UNREPORTED_TRADES_THAT_MATCH_CRITERIA;
      case '4' -> ADVISORIES_THAT_MATCH_CRITERIA;
      default -> throw new RuntimeException("value");
    };
  }
}