package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PartySubIDType extends LongRef {

  public static final long LOCATION = 25;
  public static final long POSTAL_ADDRESS = 6;
  public static final long REGISTERED_ADDRESS_18 = 18;
  public static final long SECURITIES_ACCOUNT_NAME = 22;
  public static final long REGISTRATION_NUMBER = 11;
  public static final long FUND_ACCOUNT_NAME = 19;
  public static final long REGULATORY_STATUS = 13;
  public static final long DEPARTMENT = 24;
  public static final long CASH_ACCOUNT_NAME = 23;
  public static final long EMAIL_ADDRESS = 8;
  public static final long CSD_PARTICIPANT_MEMBER_CODE = 17;
  public static final long CONTACT_NAME = 9;
  public static final long POSITION_ACCOUNT_TYPE = 26;
  public static final long BIC = 16;
  public static final long PHONE_NUMBER = 7;
  public static final long REGISTERED_ADDRESS_12 = 12;
  public static final long REGISTRATION_NAME = 14;
  public static final long FULL_LEGAL_NAME_OF_FIRM = 5;
  public static final long PERSON = 2;
  public static final long TELEX_NUMBER = 20;
  public static final long SYSTEM = 3;
  public static final long APPLICATION = 4;
  public static final long CASH_ACCOUNT_NUMBER = 15;
  public static final long SECURITIES_ACCOUNT_NUMBER = 10;
  public static final long FAX_NUMBER = 21;
  public static final long FIRM = 1;

  public PartySubIDType(Message message) {
    super(message, FixTag.partySubIDType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> FIRM;
        case '0' -> SECURITIES_ACCOUNT_NUMBER;
        case '1' -> REGISTRATION_NUMBER;
        case '2' -> REGISTERED_ADDRESS_12;
        case '3' -> REGULATORY_STATUS;
        case '4' -> REGISTRATION_NAME;
        case '5' -> CASH_ACCOUNT_NUMBER;
        case '6' -> BIC;
        case '7' -> CSD_PARTICIPANT_MEMBER_CODE;
        case '8' -> REGISTERED_ADDRESS_18;
        case '9' -> FUND_ACCOUNT_NAME;
        default -> throw new RuntimeException("value");
      };
      case '2' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> PERSON;
        case '0' -> TELEX_NUMBER;
        case '1' -> FAX_NUMBER;
        case '2' -> SECURITIES_ACCOUNT_NAME;
        case '3' -> CASH_ACCOUNT_NAME;
        case '4' -> DEPARTMENT;
        case '5' -> LOCATION;
        case '6' -> POSITION_ACCOUNT_TYPE;
        default -> throw new RuntimeException("value");
      };
      case '3' -> SYSTEM;
      case '4' -> APPLICATION;
      case '5' -> FULL_LEGAL_NAME_OF_FIRM;
      case '6' -> POSTAL_ADDRESS;
      case '7' -> PHONE_NUMBER;
      case '8' -> EMAIL_ADDRESS;
      case '9' -> CONTACT_NAME;
      default -> throw new RuntimeException("value");
    };
  }
}