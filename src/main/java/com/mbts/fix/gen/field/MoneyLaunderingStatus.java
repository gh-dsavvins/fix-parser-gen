package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MoneyLaunderingStatus extends StringRef {

  public static final String PASSED = "Y";
  public static final String EXEMPT_BELOW_THE_LIMIT = "1";
  public static final String EXEMPT_AUTHORISED_CREDIT_OR_FINANCIAL_INSTITUTION = "3";
  public static final String NOT_CHECKED = "N";
  public static final String EXEMPT_CLIENT_MONEY_TYPE_EXEMPTION = "2";

  public MoneyLaunderingStatus(Message message) {
    super(message, FixTag.moneyLaunderingStatus);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> EXEMPT_BELOW_THE_LIMIT;
      case '2' -> EXEMPT_CLIENT_MONEY_TYPE_EXEMPTION;
      case '3' -> EXEMPT_AUTHORISED_CREDIT_OR_FINANCIAL_INSTITUTION;
      case 'N' -> NOT_CHECKED;
      case 'Y' -> PASSED;
      default -> throw new RuntimeException("value");
    };
  }
}