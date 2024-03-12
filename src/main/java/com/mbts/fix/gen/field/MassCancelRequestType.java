package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MassCancelRequestType extends StringRef {

  public static final String CANCEL_ORDERS_FOR_A_SECURITYTYPE = "5";
  public static final String CANCEL_ORDERS_FOR_A_TRADING_SESSION = "6";
  public static final String CANCEL_ORDERS_FOR_AN_UNDERLYING_SECURITY = "2";
  public static final String CANCEL_ORDERS_FOR_A_PRODUCT = "3";
  public static final String CANCEL_ORDERS_FOR_A_SECURITY = "1";
  public static final String CANCEL_ALL_ORDERS = "7";
  public static final String CANCEL_ORDERS_FOR_A_CFICODE = "4";

  public MassCancelRequestType(Message message) {
    super(message, FixTag.massCancelRequestType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> CANCEL_ORDERS_FOR_A_SECURITY;
      case '2' -> CANCEL_ORDERS_FOR_AN_UNDERLYING_SECURITY;
      case '3' -> CANCEL_ORDERS_FOR_A_PRODUCT;
      case '4' -> CANCEL_ORDERS_FOR_A_CFICODE;
      case '5' -> CANCEL_ORDERS_FOR_A_SECURITYTYPE;
      case '6' -> CANCEL_ORDERS_FOR_A_TRADING_SESSION;
      case '7' -> CANCEL_ALL_ORDERS;
      default -> throw new RuntimeException("value");
    };
  }
}