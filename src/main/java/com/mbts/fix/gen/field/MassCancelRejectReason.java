package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MassCancelRejectReason extends StringRef {

  public static final String INVALID_OR_UNKNOWN_UNDERLYING = "2";
  public static final String INVALID_OR_UNKNOWN_PRODUCT = "3";
  public static final String MASS_CANCEL_NOT_SUPPORTED = "0";
  public static final String INVALID_OR_UNKNOWN_TRADING_SESSION = "6";
  public static final String INVALID_OR_UNKNOWN_CFICODE = "4";
  public static final String OTHER = "99";
  public static final String INVALID_OR_UNKNOWN_SECURITY = "1";
  public static final String INVALID_OR_UNKNOWN_SECURITY_TYPE = "5";

  public MassCancelRejectReason(Message message) {
    super(message, FixTag.massCancelRejectReason);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> MASS_CANCEL_NOT_SUPPORTED;
      case '1' -> INVALID_OR_UNKNOWN_SECURITY;
      case '2' -> INVALID_OR_UNKNOWN_UNDERLYING;
      case '3' -> INVALID_OR_UNKNOWN_PRODUCT;
      case '4' -> INVALID_OR_UNKNOWN_CFICODE;
      case '5' -> INVALID_OR_UNKNOWN_SECURITY_TYPE;
      case '6' -> INVALID_OR_UNKNOWN_TRADING_SESSION;
      case '9' -> OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}