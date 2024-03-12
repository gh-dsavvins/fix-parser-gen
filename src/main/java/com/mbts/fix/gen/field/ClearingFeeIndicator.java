package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ClearingFeeIndicator extends StringRef {

  public static final String _106H_AND_106J_FIRMS = "H";
  public static final String _2ND_YEAR_DELEGATE_TRADING_FOR_HIS_OWN_ACCOUNT = "2";
  public static final String _4TH_YEAR_DELEGATE_TRADING_FOR_HIS_OWN_ACCOUNT = "4";
  public static final String ALL_OTHER_OWNERSHIP_TYPES = "M";
  public static final String FULL_AND_ASSOCIATE_MEMBER_TRADING_FOR_OWN_ACCOUNT_AND_AS_FLOOR_BROKERS = "F";
  public static final String CBOE_MEMBER = "B";
  public static final String NON_MEMBER_AND_CUSTOMER = "C";
  public static final String GIM_IDEM_AND_COM_MEMBERSHIP_INTEREST_HOLDERS = "I";
  public static final String LESSEE_AND_106F_EMPLOYEES = "L";
  public static final String EQUITY_MEMBER_AND_CLEARING_MEMBER = "E";
  public static final String _1ST_YEAR_DELEGATE_TRADING_FOR_HIS_OWN_ACCOUNT = "1";
  public static final String _3RD_YEAR_DELEGATE_TRADING_FOR_HIS_OWN_ACCOUNT = "3";
  public static final String _6TH_YEAR_AND_BEYOND_DELEGATE_TRADING_FOR_HIS_OWN_ACCOUNT = "9";
  public static final String _5TH_YEAR_DELEGATE_TRADING_FOR_HIS_OWN_ACCOUNT = "5";

  public ClearingFeeIndicator(Message message) {
    super(message, FixTag.clearingFeeIndicator);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> _1ST_YEAR_DELEGATE_TRADING_FOR_HIS_OWN_ACCOUNT;
      case '2' -> _2ND_YEAR_DELEGATE_TRADING_FOR_HIS_OWN_ACCOUNT;
      case '3' -> _3RD_YEAR_DELEGATE_TRADING_FOR_HIS_OWN_ACCOUNT;
      case '4' -> _4TH_YEAR_DELEGATE_TRADING_FOR_HIS_OWN_ACCOUNT;
      case '5' -> _5TH_YEAR_DELEGATE_TRADING_FOR_HIS_OWN_ACCOUNT;
      case '9' -> _6TH_YEAR_AND_BEYOND_DELEGATE_TRADING_FOR_HIS_OWN_ACCOUNT;
      case 'B' -> CBOE_MEMBER;
      case 'C' -> NON_MEMBER_AND_CUSTOMER;
      case 'E' -> EQUITY_MEMBER_AND_CLEARING_MEMBER;
      case 'F' -> FULL_AND_ASSOCIATE_MEMBER_TRADING_FOR_OWN_ACCOUNT_AND_AS_FLOOR_BROKERS;
      case 'H' -> _106H_AND_106J_FIRMS;
      case 'I' -> GIM_IDEM_AND_COM_MEMBERSHIP_INTEREST_HOLDERS;
      case 'L' -> LESSEE_AND_106F_EMPLOYEES;
      case 'M' -> ALL_OTHER_OWNERSHIP_TYPES;
      default -> throw new RuntimeException("value");
    };
  }
}