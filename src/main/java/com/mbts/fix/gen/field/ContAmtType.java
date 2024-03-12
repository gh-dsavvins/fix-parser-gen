package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ContAmtType extends LongRef {

  public static final long DISCOUNT_AMOUNT = 5;
  public static final long DILUTION_LEVY_AMOUNT = 7;
  public static final long COMMISSION_AMOUNT = 1;
  public static final long INITIAL_CHARGE_AMOUNT = 3;
  public static final long DISCOUNT = 6;
  public static final long FUND_BASED_RENEWAL_COMMISSION = 11;
  public static final long INITIAL_CHARGE = 4;
  public static final long EXIT_CHARGE = 10;
  public static final long DILUTION_LEVY = 8;
  public static final long EXIT_CHARGE_AMOUNT = 9;
  public static final long PROJECTED_FUND_VALUE = 12;
  public static final long FUND_BASED_RENEWAL_COMMISSION_AMOUNT_14 = 14;
  public static final long NET_SETTLEMENT_AMOUNT = 15;
  public static final long FUND_BASED_RENEWAL_COMMISSION_AMOUNT_13 = 13;
  public static final long COMMISSION = 2;

  public ContAmtType(Message message) {
    super(message, FixTag.contAmtType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> COMMISSION_AMOUNT;
        case '0' -> EXIT_CHARGE;
        case '1' -> FUND_BASED_RENEWAL_COMMISSION;
        case '2' -> PROJECTED_FUND_VALUE;
        case '3' -> FUND_BASED_RENEWAL_COMMISSION_AMOUNT_13;
        case '4' -> FUND_BASED_RENEWAL_COMMISSION_AMOUNT_14;
        case '5' -> NET_SETTLEMENT_AMOUNT;
        default -> throw new RuntimeException("value");
      };
      case '2' -> COMMISSION;
      case '3' -> INITIAL_CHARGE_AMOUNT;
      case '4' -> INITIAL_CHARGE;
      case '5' -> DISCOUNT_AMOUNT;
      case '6' -> DISCOUNT;
      case '7' -> DILUTION_LEVY_AMOUNT;
      case '8' -> DILUTION_LEVY;
      case '9' -> EXIT_CHARGE_AMOUNT;
      default -> throw new RuntimeException("value");
    };
  }
}