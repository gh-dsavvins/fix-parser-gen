package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class OrderRestrictions extends StringRef {

  public static final String PROGRAM_TRADE = "1";
  public static final String EXTERNAL_INTER_CONNECTED_MARKET_LINKAGE = "9";
  public static final String NON_INDEX_ARBITRAGE = "3";
  public static final String INDEX_ARBITRAGE = "2";
  public static final String ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_THE_UNDERLYING_SECURITY_OF_A_DERIVATIVE_SECURITY = "6";
  public static final String ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_THE_SECURITY = "5";
  public static final String EXTERNAL_MARKET_PARTICIPANT = "8";
  public static final String COMPETING_MARKET_MAKER = "4";
  public static final String FOREIGN_ENTITY = "7";
  public static final String RISKLESS_ARBITRAGE = "A";

  public OrderRestrictions(Message message) {
    super(message, FixTag.orderRestrictions);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> PROGRAM_TRADE;
      case '2' -> INDEX_ARBITRAGE;
      case '3' -> NON_INDEX_ARBITRAGE;
      case '4' -> COMPETING_MARKET_MAKER;
      case '5' -> ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_THE_SECURITY;
      case '6' -> ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_THE_UNDERLYING_SECURITY_OF_A_DERIVATIVE_SECURITY;
      case '7' -> FOREIGN_ENTITY;
      case '8' -> EXTERNAL_MARKET_PARTICIPANT;
      case '9' -> EXTERNAL_INTER_CONNECTED_MARKET_LINKAGE;
      case 'A' -> RISKLESS_ARBITRAGE;
      default -> throw new RuntimeException("value");
    };
  }
}