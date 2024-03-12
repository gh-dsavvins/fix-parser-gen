package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class DistribPaymentMethod extends LongRef {

  public static final long CHEQUE = 5;
  public static final long NSCC = 2;
  public static final long BPAY = 10;
  public static final long CREST = 1;
  public static final long EUROCLEAR = 3;
  public static final long HIGH_VALUE_CLEARING_SYSTEM = 11;
  public static final long TELEGRAPHIC_TRANSFER = 6;
  public static final long FEDWIRE = 7;
  public static final long CLEARSTREAM = 4;
  public static final long REINVEST_IN_FUND = 12;
  public static final long DIRECT_CREDIT = 8;
  public static final long ACH_CREDIT = 9;

  public DistribPaymentMethod(Message message) {
    super(message, FixTag.distribPaymentMethod);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> CREST;
        case '0' -> BPAY;
        case '1' -> HIGH_VALUE_CLEARING_SYSTEM;
        case '2' -> REINVEST_IN_FUND;
        default -> throw new RuntimeException("value");
      };
      case '2' -> NSCC;
      case '3' -> EUROCLEAR;
      case '4' -> CLEARSTREAM;
      case '5' -> CHEQUE;
      case '6' -> TELEGRAPHIC_TRANSFER;
      case '7' -> FEDWIRE;
      case '8' -> DIRECT_CREDIT;
      case '9' -> ACH_CREDIT;
      default -> throw new RuntimeException("value");
    };
  }
}