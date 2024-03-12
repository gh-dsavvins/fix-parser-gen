package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TaxAdvantageType extends LongRef {

  public static final long EDUCATION_IRA_29 = 29;
  public static final long ROTH_CONVERSION_IRA_27 = 27;
  public static final long MINI_STOCKS_AND_SHARES_ISA = 4;
  public static final long TESSA = 2;
  public static final long MINI_CASH_ISA = 3;
  public static final long PROFIT_SHARING_PLAN = 19;
  public static final long PRIOR_YEAR_PAYMENT = 7;
  public static final long ROTH_CONVERSION_IRA_26 = 26;
  public static final long CURRENT_YEAR_PAYMENT = 6;
  public static final long EMPLOYER_CURRENT_YEAR = 12;
  public static final long INDIVIDUAL_RETIREMENT_ACCOUNT = 16;
  public static final long NON_FUND_QUALIFIED_PLAN = 14;
  public static final long INDIVIDUAL_RETIREMENT_ACCOUNT_ROLLOVER = 17;
  public static final long EMPLOYEE = 9;
  public static final long ROTH_IRA_25 = 25;
  public static final long MINI_INSURANCE_ISA = 5;
  public static final long EDUCATION_IRA_28 = 28;
  public static final long MAXI_ISA = 1;
  public static final long EMPLOYER = 11;
  public static final long DEFINED_CONTRIBUTION_PLAN = 15;
  public static final long KEOGH = 18;
  public static final long _457 = 23;
  public static final long _403 = 22;
  public static final long ROTH_IRA_24 = 24;
  public static final long EMPLOYEE_CURRENT_YEAR = 10;
  public static final long NONE_NOT_APPLICABLE = 0;
  public static final long SELF_DIRECTED_IRA = 21;
  public static final long ASSET_TRANSFER = 8;
  public static final long _401K = 20;
  public static final long NON_FUND_PROTOTYPE_IRA = 13;

  public TaxAdvantageType(Message message) {
    super(message, FixTag.taxAdvantageType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> NONE_NOT_APPLICABLE;
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> MAXI_ISA;
        case '0' -> EMPLOYEE_CURRENT_YEAR;
        case '1' -> EMPLOYER;
        case '2' -> EMPLOYER_CURRENT_YEAR;
        case '3' -> NON_FUND_PROTOTYPE_IRA;
        case '4' -> NON_FUND_QUALIFIED_PLAN;
        case '5' -> DEFINED_CONTRIBUTION_PLAN;
        case '6' -> INDIVIDUAL_RETIREMENT_ACCOUNT;
        case '7' -> INDIVIDUAL_RETIREMENT_ACCOUNT_ROLLOVER;
        case '8' -> KEOGH;
        case '9' -> PROFIT_SHARING_PLAN;
        default -> throw new RuntimeException("value");
      };
      case '2' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> TESSA;
        case '0' -> _401K;
        case '1' -> SELF_DIRECTED_IRA;
        case '2' -> _403;
        case '3' -> _457;
        case '4' -> ROTH_IRA_24;
        case '5' -> ROTH_IRA_25;
        case '6' -> ROTH_CONVERSION_IRA_26;
        case '7' -> ROTH_CONVERSION_IRA_27;
        case '8' -> EDUCATION_IRA_28;
        case '9' -> EDUCATION_IRA_29;
        default -> throw new RuntimeException("value");
      };
      case '3' -> MINI_CASH_ISA;
      case '4' -> MINI_STOCKS_AND_SHARES_ISA;
      case '5' -> MINI_INSURANCE_ISA;
      case '6' -> CURRENT_YEAR_PAYMENT;
      case '7' -> PRIOR_YEAR_PAYMENT;
      case '8' -> ASSET_TRANSFER;
      case '9' -> EMPLOYEE;
      default -> throw new RuntimeException("value");
    };
  }
}