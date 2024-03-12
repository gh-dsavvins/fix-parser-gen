package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SecurityListRequestType extends LongRef {

  public static final long TRADINGSESSIONID = 3;
  public static final long SECURITYTYPE_AND_OR_CFICODE = 1;
  public static final long PRODUCT = 2;
  public static final long ALL_SECURITIES = 4;
  public static final long SYMBOL = 0;

  public SecurityListRequestType(Message message) {
    super(message, FixTag.securityListRequestType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> SYMBOL;
      case '1' -> SECURITYTYPE_AND_OR_CFICODE;
      case '2' -> PRODUCT;
      case '3' -> TRADINGSESSIONID;
      case '4' -> ALL_SECURITIES;
      default -> throw new RuntimeException("value");
    };
  }
}