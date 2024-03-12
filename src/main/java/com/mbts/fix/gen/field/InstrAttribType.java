package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class InstrAttribType extends LongRef {

  public static final long UNRATED = 16;
  public static final long COUPON_PERIOD = 8;
  public static final long WHEN_AND_IF_ISSUED = 9;
  public static final long SUBJECT_TO_ALTERNATIVE_MINIMUM_TAX = 19;
  public static final long CALLABLE_WITHOUT_NOTICE_BY_MAIL_TO_HOLDER_UNLESS_REGISTERED = 22;
  public static final long ORIGINAL_ISSUE_DISCOUNT = 10;
  public static final long STEPPED_COUPON = 7;
  public static final long CALLABLE_PUTTABLE = 11;
  public static final long ESCROWED_TO_MATURITY = 12;
  public static final long VARIABLE_RATE = 5;
  public static final long NO_PERIODIC_PAYMENTS = 4;
  public static final long LESS_FEE_FOR_PUT = 6;
  public static final long ESCROWED_TO_REDEMPTION_DATE_CALLABLE_SUPPLY_REDEMPTION_DATE_IN_THE_INSTRATTRIBVALUE = 13;
  public static final long INDEXED = 18;
  public static final long CALLABLE_BELOW_MATURITY_VALUE = 21;
  public static final long ORIGINAL_ISSUE_DISCOUNT_PRICE_SUPPLY_PRICE_IN_THE_INSTRATTRIBVALUE = 20;
  public static final long TEXT_SUPPLY_THE_TEXT_OF_THE_ATTRIBUTE_OR_DISCLAIMER_IN_THE_INSTRATTRIBVALUE = 99;
  public static final long IN_DEFAULT = 15;
  public static final long FLAT = 1;
  public static final long ZERO_COUPON = 2;
  public static final long TAXABLE = 17;
  public static final long PREREFUNDED = 14;
  public static final long INTEREST_BEARING = 3;

  public InstrAttribType(Message message) {
    super(message, FixTag.instrAttribType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> FLAT;
        case '0' -> ORIGINAL_ISSUE_DISCOUNT;
        case '1' -> CALLABLE_PUTTABLE;
        case '2' -> ESCROWED_TO_MATURITY;
        case '3' -> ESCROWED_TO_REDEMPTION_DATE_CALLABLE_SUPPLY_REDEMPTION_DATE_IN_THE_INSTRATTRIBVALUE;
        case '4' -> PREREFUNDED;
        case '5' -> IN_DEFAULT;
        case '6' -> UNRATED;
        case '7' -> TAXABLE;
        case '8' -> INDEXED;
        case '9' -> SUBJECT_TO_ALTERNATIVE_MINIMUM_TAX;
        default -> throw new RuntimeException("value");
      };
      case '2' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> ZERO_COUPON;
        case '0' -> ORIGINAL_ISSUE_DISCOUNT_PRICE_SUPPLY_PRICE_IN_THE_INSTRATTRIBVALUE;
        case '1' -> CALLABLE_BELOW_MATURITY_VALUE;
        case '2' -> CALLABLE_WITHOUT_NOTICE_BY_MAIL_TO_HOLDER_UNLESS_REGISTERED;
        default -> throw new RuntimeException("value");
      };
      case '3' -> INTEREST_BEARING;
      case '4' -> NO_PERIODIC_PAYMENTS;
      case '5' -> VARIABLE_RATE;
      case '6' -> LESS_FEE_FOR_PUT;
      case '7' -> STEPPED_COUPON;
      case '8' -> COUPON_PERIOD;
      case '9' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> WHEN_AND_IF_ISSUED;
        case '9' -> TEXT_SUPPLY_THE_TEXT_OF_THE_ATTRIBUTE_OR_DISCLAIMER_IN_THE_INSTRATTRIBVALUE;
        default -> throw new RuntimeException("value");
      };
      default -> throw new RuntimeException("value");
    };
  }
}