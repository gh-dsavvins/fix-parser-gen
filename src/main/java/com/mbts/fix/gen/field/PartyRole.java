package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PartyRole extends LongRef {

  public static final long GIVEUP_CLEARING_FIRM = 14;
  public static final long CUSTOMER_ACCOUNT = 24;
  public static final long INVESTOR_ID = 5;
  public static final long ENTERING_FIRM = 7;
  public static final long ORDER_ORIGINATION_FIRM = 13;
  public static final long CLIENT_ID = 3;
  public static final long INTERMEDIARY = 29;
  public static final long CONTRA_TRADER = 37;
  public static final long INTERESTED_PARTY = 33;
  public static final long BROKER_OF_CREDIT = 2;
  public static final long CORRESPONDANT_CLEARING_FIRM = 15;
  public static final long CORRESPONDENT_CLEARING_ORGANIZATION = 25;
  public static final long AGENT = 30;
  public static final long INTRODUCING_FIRM = 6;
  public static final long EXECUTING_SYSTEM = 16;
  public static final long CONTRA_CLEARING_FIRM = 18;
  public static final long EXCHANGE = 22;
  public static final long CUSTODIAN = 28;
  public static final long LIQUIDITY_PROVIDER = 35;
  public static final long BUYER_SELLER = 27;
  public static final long POSITION_ACCOUNT = 38;
  public static final long ORDER_ORIGINATION_TRADER = 11;
  public static final long FUND_MANAGER_CLIENT_ID = 9;
  public static final long REGULATORY_BODY = 34;
  public static final long CORRESPONDENT_BROKER = 26;
  public static final long UNDERLYING_CONTRA_FIRM = 20;
  public static final long EXECUTING_TRADER = 12;
  public static final long CLEARING_ORGANIZATION = 21;
  public static final long SUB_CUSTODIAN = 31;
  public static final long LOCATE_LENDING_FIRM = 8;
  public static final long SETTLEMENT_LOCATION = 10;
  public static final long CONTRA_FIRM = 17;
  public static final long SPONSORING_FIRM = 19;
  public static final long BENEFICIARY = 32;
  public static final long ENTERING_TRADER = 36;
  public static final long CLEARING_FIRM = 4;
  public static final long EXECUTING_FIRM = 1;

  public PartyRole(Message message) {
    super(message, FixTag.partyRole);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> EXECUTING_FIRM;
        case '0' -> SETTLEMENT_LOCATION;
        case '1' -> ORDER_ORIGINATION_TRADER;
        case '2' -> EXECUTING_TRADER;
        case '3' -> ORDER_ORIGINATION_FIRM;
        case '4' -> GIVEUP_CLEARING_FIRM;
        case '5' -> CORRESPONDANT_CLEARING_FIRM;
        case '6' -> EXECUTING_SYSTEM;
        case '7' -> CONTRA_FIRM;
        case '8' -> CONTRA_CLEARING_FIRM;
        case '9' -> SPONSORING_FIRM;
        default -> throw new RuntimeException("value");
      };
      case '2' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> BROKER_OF_CREDIT;
        case '0' -> UNDERLYING_CONTRA_FIRM;
        case '1' -> CLEARING_ORGANIZATION;
        case '2' -> EXCHANGE;
        case '4' -> CUSTOMER_ACCOUNT;
        case '5' -> CORRESPONDENT_CLEARING_ORGANIZATION;
        case '6' -> CORRESPONDENT_BROKER;
        case '7' -> BUYER_SELLER;
        case '8' -> CUSTODIAN;
        case '9' -> INTERMEDIARY;
        default -> throw new RuntimeException("value");
      };
      case '3' -> 
      switch(bytes[valBeg + 1]) {
        case '' -> CLIENT_ID;
        case '0' -> AGENT;
        case '1' -> SUB_CUSTODIAN;
        case '2' -> BENEFICIARY;
        case '3' -> INTERESTED_PARTY;
        case '4' -> REGULATORY_BODY;
        case '5' -> LIQUIDITY_PROVIDER;
        case '6' -> ENTERING_TRADER;
        case '7' -> CONTRA_TRADER;
        case '8' -> POSITION_ACCOUNT;
        default -> throw new RuntimeException("value");
      };
      case '4' -> CLEARING_FIRM;
      case '5' -> INVESTOR_ID;
      case '6' -> INTRODUCING_FIRM;
      case '7' -> ENTERING_FIRM;
      case '8' -> LOCATE_LENDING_FIRM;
      case '9' -> FUND_MANAGER_CLIENT_ID;
      default -> throw new RuntimeException("value");
    };
  }
}