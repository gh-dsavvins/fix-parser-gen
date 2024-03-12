package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class RegistRejReasonCode extends LongRef {

  public static final long INVALID_UNACCEPTABLE_INVESTOR_ID = 9;
  public static final long INVALID_UNACCEPTABLE_MAILING_INST = 8;
  public static final long INVALID_UNACCEPTABLE_REG_SEQ_NO = 5;
  public static final long INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_ACCT_NAME = 16;
  public static final long INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_CODE = 17;
  public static final long INVALID_UNACCEPTABLE_REG_DTLS = 6;
  public static final long INVALID_UNACCEPTABLE_TAX_EXEMPT_TYPE = 2;
  public static final long INVALID_UNACCEPTABLE_DISTRIB_PAYMENT_METHOD = 15;
  public static final long INVALID_UNACCEPTABLE_MAILING_DTLS = 7;
  public static final long INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_ACCT_NUM = 18;
  public static final long INVALID_UNACCEPTABLE_DISTRIB_PERCENTAGE = 14;
  public static final long INVALID_UNACCEPTABLE_INVESTOR_ID_SOURCE = 10;
  public static final long OTHER = 99;
  public static final long INVALID_UNACCEPTABLE_OWNERSHIP_TYPE = 3;
  public static final long INVALID_UNACCEPTABLE_ACCOUNT_TYPE = 1;
  public static final long INVALID_UNACCEPTABLE_INVESTOR_COUNTRY_OF_RESIDENCE = 12;
  public static final long INVALID_UNACCEPTABLE_DATE_OF_BIRTH = 11;
  public static final long INVALID_UNACCEPTABLE_NO_REG_DETLS = 4;
  public static final long INVALID_UNACCEPTABLE_NODISTRIBINSTNS = 13;

  public RegistRejReasonCode(Message message) {
    super(message, FixTag.registRejReasonCode);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> INVALID_UNACCEPTABLE_ACCOUNT_TYPE;
        case '0' -> INVALID_UNACCEPTABLE_INVESTOR_ID_SOURCE;
        case '1' -> INVALID_UNACCEPTABLE_DATE_OF_BIRTH;
        case '2' -> INVALID_UNACCEPTABLE_INVESTOR_COUNTRY_OF_RESIDENCE;
        case '3' -> INVALID_UNACCEPTABLE_NODISTRIBINSTNS;
        case '4' -> INVALID_UNACCEPTABLE_DISTRIB_PERCENTAGE;
        case '5' -> INVALID_UNACCEPTABLE_DISTRIB_PAYMENT_METHOD;
        case '6' -> INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_ACCT_NAME;
        case '7' -> INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_CODE;
        case '8' -> INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_ACCT_NUM;
        default -> throw new RuntimeException("value");
      };
      case '2' -> INVALID_UNACCEPTABLE_TAX_EXEMPT_TYPE;
      case '3' -> INVALID_UNACCEPTABLE_OWNERSHIP_TYPE;
      case '4' -> INVALID_UNACCEPTABLE_NO_REG_DETLS;
      case '5' -> INVALID_UNACCEPTABLE_REG_SEQ_NO;
      case '6' -> INVALID_UNACCEPTABLE_REG_DTLS;
      case '7' -> INVALID_UNACCEPTABLE_MAILING_DTLS;
      case '8' -> INVALID_UNACCEPTABLE_MAILING_INST;
      case '9' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> INVALID_UNACCEPTABLE_INVESTOR_ID;
        case '9' -> OTHER;
        default -> throw new RuntimeException("value");
      };
      default -> throw new RuntimeException("value");
    };
  }
}