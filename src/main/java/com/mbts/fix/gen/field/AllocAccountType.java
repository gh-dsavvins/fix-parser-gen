package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AllocAccountType extends LongRef {

  public static final long HOUSE_TRADER = 3;
  public static final long JOINT_BACKOFFICE_ACCOUNT = 8;
  public static final long FLOOR_TRADER = 4;
  public static final long ACCOUNT_IS_HOUSE_TRADER_AND_IS_CROSS_MARGINED = 7;
  public static final long ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS = 2;
  public static final long ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS_AND_IS_CROSS_MARGINED = 6;
  public static final long ACCOUNT_IS_CARRIED_ON_CUSTOMER_SIDE_OF_BOOKS = 1;

  public AllocAccountType(Message message) {
    super(message, FixTag.allocAccountType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> ACCOUNT_IS_CARRIED_ON_CUSTOMER_SIDE_OF_BOOKS;
      case '2' -> ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS;
      case '3' -> HOUSE_TRADER;
      case '4' -> FLOOR_TRADER;
      case '6' -> ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS_AND_IS_CROSS_MARGINED;
      case '7' -> ACCOUNT_IS_HOUSE_TRADER_AND_IS_CROSS_MARGINED;
      case '8' -> JOINT_BACKOFFICE_ACCOUNT;
      default -> throw new RuntimeException("value");
    };
  }
}