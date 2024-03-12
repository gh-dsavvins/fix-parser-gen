package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class OwnerType extends LongRef {

  public static final long PUBLIC_COMPANY = 2;
  public static final long CUSTODIAN_UNDER_GIFTS_TO_MINORS_ACT = 7;
  public static final long NETWORKING_SUB_ACCOUNT = 10;
  public static final long INDIVIDUAL_INVESTOR = 1;
  public static final long NOMINEE = 13;
  public static final long PENSION_PLAN = 6;
  public static final long NON_PROFIT_ORGANIZATION = 11;
  public static final long TRUSTS = 8;
  public static final long FIDUCIARIES = 9;
  public static final long COMPANY_TRUSTEE = 5;
  public static final long CORPORATE_BODY = 12;
  public static final long PRIVATE_COMPANY = 3;
  public static final long INDIVIDUAL_TRUSTEE = 4;

  public OwnerType(Message message) {
    super(message, FixTag.ownerType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> INDIVIDUAL_INVESTOR;
        case '0' -> NETWORKING_SUB_ACCOUNT;
        case '1' -> NON_PROFIT_ORGANIZATION;
        case '2' -> CORPORATE_BODY;
        case '3' -> NOMINEE;
        default -> throw new RuntimeException("value");
      };
      case '2' -> PUBLIC_COMPANY;
      case '3' -> PRIVATE_COMPANY;
      case '4' -> INDIVIDUAL_TRUSTEE;
      case '5' -> COMPANY_TRUSTEE;
      case '6' -> PENSION_PLAN;
      case '7' -> CUSTODIAN_UNDER_GIFTS_TO_MINORS_ACT;
      case '8' -> TRUSTS;
      case '9' -> FIDUCIARIES;
      default -> throw new RuntimeException("value");
    };
  }
}