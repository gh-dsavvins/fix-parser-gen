package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PaymentMethod extends LongRef {

  public static final long CHEQUE = 5;
  public static final long ACH_CREDIT = 13;
  public static final long TELEGRAPHIC_TRANSFER = 6;
  public static final long FEDWIRE = 7;
  public static final long DIRECT_DEBIT = 9;
  public static final long BPAY = 14;
  public static final long NSCC = 2;
  public static final long CREST = 1;
  public static final long EUROCLEAR = 3;
  public static final long HIGH_VALUE_CLEARING_SYSTEM = 15;
  public static final long CREDIT_CARD = 11;
  public static final long CLEARSTREAM = 4;
  public static final long ACH_DEBIT = 12;
  public static final long DEBIT_CARD = 8;
  public static final long DIRECT_CREDIT = 10;

  public PaymentMethod(Message message) {
    super(message, FixTag.paymentMethod);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> CREST;
        case '0' -> DIRECT_CREDIT;
        case '1' -> CREDIT_CARD;
        case '2' -> ACH_DEBIT;
        case '3' -> ACH_CREDIT;
        case '4' -> BPAY;
        case '5' -> HIGH_VALUE_CLEARING_SYSTEM;
        default -> throw new RuntimeException("value");
      };
      case '2' -> NSCC;
      case '3' -> EUROCLEAR;
      case '4' -> CLEARSTREAM;
      case '5' -> CHEQUE;
      case '6' -> TELEGRAPHIC_TRANSFER;
      case '7' -> FEDWIRE;
      case '8' -> DEBIT_CARD;
      case '9' -> DIRECT_DEBIT;
      default -> throw new RuntimeException("value");
    };
  }
}