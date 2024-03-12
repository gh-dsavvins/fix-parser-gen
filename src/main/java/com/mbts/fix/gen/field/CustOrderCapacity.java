package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class CustOrderCapacity extends LongRef {

  public static final long ALL_OTHER = 4;
  public static final long MEMBER_TRADING_FOR_THEIR_OWN_ACCOUNT = 1;
  public static final long MEMBER_TRADING_FOR_ANOTHER_MEMBER = 3;
  public static final long CLEARING_FIRM_TRADING_FOR_ITS_PROPRIETARY_ACCOUNT = 2;

  public CustOrderCapacity(Message message) {
    super(message, FixTag.custOrderCapacity);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> MEMBER_TRADING_FOR_THEIR_OWN_ACCOUNT;
      case '2' -> CLEARING_FIRM_TRADING_FOR_ITS_PROPRIETARY_ACCOUNT;
      case '3' -> MEMBER_TRADING_FOR_ANOTHER_MEMBER;
      case '4' -> ALL_OTHER;
      default -> throw new RuntimeException("value");
    };
  }
}