package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MassStatusReqType extends LongRef {

  public static final long STATUS_FOR_ORDERS_FOR_A_CFICODE = 4;
  public static final long STATUS_FOR_ORDERS_FOR_A_SECURITYTYPE = 5;
  public static final long STATUS_FOR_ORDERS_FOR_A_PRODUCT = 3;
  public static final long STATUS_FOR_ORDERS_FOR_A_PARTYID = 8;
  public static final long STATUS_FOR_ORDERS_FOR_A_SECURITY = 1;
  public static final long STATUS_FOR_ALL_ORDERS = 7;
  public static final long STATUS_FOR_ORDERS_FOR_AN_UNDERLYING_SECURITY = 2;
  public static final long STATUS_FOR_ORDERS_FOR_A_TRADING_SESSION = 6;

  public MassStatusReqType(Message message) {
    super(message, FixTag.massStatusReqType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> STATUS_FOR_ORDERS_FOR_A_SECURITY;
      case '2' -> STATUS_FOR_ORDERS_FOR_AN_UNDERLYING_SECURITY;
      case '3' -> STATUS_FOR_ORDERS_FOR_A_PRODUCT;
      case '4' -> STATUS_FOR_ORDERS_FOR_A_CFICODE;
      case '5' -> STATUS_FOR_ORDERS_FOR_A_SECURITYTYPE;
      case '6' -> STATUS_FOR_ORDERS_FOR_A_TRADING_SESSION;
      case '7' -> STATUS_FOR_ALL_ORDERS;
      case '8' -> STATUS_FOR_ORDERS_FOR_A_PARTYID;
      default -> throw new RuntimeException("value");
    };
  }
}