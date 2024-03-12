package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SecurityType extends StringRef {

  public static final String FEDERAL_AGENCY_COUPON = "FAC";
  public static final String CORPORATE_BOND = "CORP";
  public static final String RETIRED = "RETIRED";
  public static final String SWING_LINE_FACILITY = "SWING";
  public static final String MORTGAGE_BACKED_SECURITIES = "MBS";
  public static final String REVOLVER_LOAN = "RVLV";
  public static final String INTEREST_STRIP_FROM_ANY_BOND_OR_NOTE = "TINT";
  public static final String US_TREASURY_BILL_USTB = "USTB";
  public static final String MORTGAGE_INTEREST_ONLY = "MIO";
  public static final String CONVERTIBLE_BOND = "CB";
  public static final String LIQUIDITY_NOTE = "LQN";
  public static final String TAX_EXEMPT_COMMERCIAL_PAPER = "TECP";
  public static final String NO_SECURITY_TYPE = "NONE";
  public static final String PREFERRED_STOCK = "PS";
  public static final String MANDATORY_TENDER = "MT";
  public static final String USD_SUPRANATIONAL_COUPONS = "SUPRA";
  public static final String US_TREASURY_NOTE_UST = "UST";
  public static final String WITHDRAWN = "WITHDRN";
  public static final String US_TREASURY_NOTE_TNOTE = "TNOTE";
  public static final String AMENDED_RESTATED = "AMENDED";
  public static final String TERM_LOAN = "TERM";
  public static final String CERTIFICATE_OF_OBLIGATION = "COFO";
  public static final String BRADY_BOND = "BRADY";
  public static final String YANKEE_CORPORATE_BOND = "YANK";
  public static final String DEFAULTED = "DEFLTED";
  public static final String VARIABLE_RATE_DEMAND_NOTE = "VRDN";
  public static final String ASSET_BACKED_SECURITIES = "ABS";
  public static final String OTHER_ANTICIPATION_NOTES_BAN_GAN_ETC = "AN";
  public static final String LETTER_OF_CREDIT = "LOFC";
  public static final String EURO_COMMERCIAL_PAPER = "EUCP";
  public static final String FUTURE = "FUT";
  public static final String INDEXED_LINKED = "XLINKD";
  public static final String BILL_OF_EXCHANGES = "BOX";
  public static final String MORTGAGE_PRINCIPAL_ONLY = "MPO";
  public static final String CORPORATE_PRIVATE_PLACEMENT = "CPP";
  public static final String REVENUE_BONDS = "REV";
  public static final String OPTION = "OPT";
  public static final String COMMON_STOCK = "CS";
  public static final String MISCELLANEOUS_PASS_THROUGH = "MPT";
  public static final String MUTUAL_FUND = "MF";
  public static final String MORTGAGE_PRIVATE_PLACEMENT = "MPP";
  public static final String PROMISSORY_NOTE = "PN";
  public static final String EURO_CORPORATE_BOND = "EUCORP";
  public static final String PFANDBRIEFE = "PFAND";
  public static final String EURO_SOVEREIGNS = "EUSOV";
  public static final String BRIDGE_LOAN = "BRIDGE";
  public static final String REVOLVER_TERM_LOAN = "RVLVTRM";
  public static final String GENERAL_OBLIGATION_BONDS = "GO";
  public static final String SECURITIES_LOAN = "SECLOAN";
  public static final String BANK_NOTES = "BN";
  public static final String MEDIUM_TERM_NOTES = "MTN";
  public static final String OVERNIGHT = "ONITE";
  public static final String COLLATERALIZED_MORTGAGE_OBLIGATION = "CMO";
  public static final String TREASURY_INFLATION_PROTECTED_SECURITIES = "TIPS";
  public static final String CORP_MORTGAGE_BACKED_SECURITIES = "CMBS";
  public static final String REVENUE_ANTICIPATION_NOTE = "RAN";
  public static final String SPECIAL_ASSESSMENT = "SPCLA";
  public static final String FOREIGN_EXCHANGE_CONTRACT = "FOR";
  public static final String DEBTOR_IN_POSSESSION = "DINP";
  public static final String SPECIAL_OBLIGATION = "SPCLO";
  public static final String PRINCIPAL_STRIP_OF_A_CALLABLE_BOND_OR_NOTE = "TCAL";
  public static final String BANKERS_ACCEPTANCE = "BA";
  public static final String TIME_DEPOSIT = "TD";
  public static final String REPURCHASE = "REPO";
  public static final String US_TREASURY_BILL_TBILL = "TBILL";
  public static final String DUAL_CURRENCY = "DUAL";
  public static final String MULTI_LEG_INSTRUMENT = "MLEG";
  public static final String FORWARD = "FORWARD";
  public static final String YANKEE_CERTIFICATE_OF_DEPOSIT = "YCD";
  public static final String BUY_SELLBACK = "BUYSELL";
  public static final String EURO_CERTIFICATE_OF_DEPOSIT = "EUCD";
  public static final String PLAZOS_FIJOS = "PZFJ";
  public static final String TO_BE_ANNOUNCED = "TBA";
  public static final String COMMERCIAL_PAPER = "CP";
  public static final String SPECIAL_TAX = "SPCLT";
  public static final String TAX_ANTICIPATION_NOTE = "TAN";
  public static final String TAX_ALLOCATION = "TAXA";
  public static final String MATURED = "MATURED";
  public static final String SHORT_TERM_LOAN_NOTE = "STN";
  public static final String FEDERAL_AGENCY_DISCOUNT_NOTE = "FADN";
  public static final String EURO_SUPRANATIONAL_COUPONS = "EUSUPRA";
  public static final String CERTIFICATE_OF_DEPOSIT = "CD";
  public static final String IOETTE_MORTGAGE = "IET";
  public static final String TAX_REVENUE_ANTICIPATION_NOTE = "TRAN";
  public static final String CALL_LOANS = "CL";
  public static final String REPLACED = "REPLACD";
  public static final String SECURITIES_PLEDGE = "SECPLEDGE";
  public static final String CERTIFICATE_OF_PARTICIPATION = "COFP";
  public static final String PRINCIPAL_STRIP_FROM_A_NON_CALLABLE_BOND_OR_NOTE = "TPRN";
  public static final String STRUCTURED_NOTES = "STRUCT";
  public static final String DEPOSIT_NOTES = "DN";
  public static final String WARRANT = "WAR";
  public static final String PRIVATE_EXPORT_FUNDING = "PEF";
  public static final String US_TREASURY_BOND = "TBOND";
  public static final String EXTENDED_COMM_NOTE = "XCN";

  public SecurityType(Message message) {
    super(message, FixTag.securityType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'A' -> 
      switch(bytes[valBeg + 1]) {
        case 'B' -> ASSET_BACKED_SECURITIES;
        case 'M' -> AMENDED_RESTATED;
        case 'N' -> OTHER_ANTICIPATION_NOTES_BAN_GAN_ETC;
        default -> throw new RuntimeException("value");
      };
      case 'B' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> BANKERS_ACCEPTANCE;
        case 'N' -> BANK_NOTES;
        case 'O' -> BILL_OF_EXCHANGES;
        case 'R' -> 
        switch(bytes[valBeg + 2]) {
          case 'A' -> BRADY_BOND;
          case 'I' -> BRIDGE_LOAN;
          default -> throw new RuntimeException("value");
        };
        case 'U' -> BUY_SELLBACK;
        default -> throw new RuntimeException("value");
      };
      case 'C' -> 
      switch(bytes[valBeg + 1]) {
        case 'B' -> CONVERTIBLE_BOND;
        case 'D' -> CERTIFICATE_OF_DEPOSIT;
        case 'L' -> CALL_LOANS;
        case 'M' -> 
        switch(bytes[valBeg + 2]) {
          case 'B' -> CORP_MORTGAGE_BACKED_SECURITIES;
          case 'O' -> COLLATERALIZED_MORTGAGE_OBLIGATION;
          default -> throw new RuntimeException("value");
        };
        case 'O' -> 
        switch(bytes[valBeg + 2]) {
          case 'F' -> 
          switch(bytes[valBeg + 3]) {
            case 'O' -> CERTIFICATE_OF_OBLIGATION;
            case 'P' -> CERTIFICATE_OF_PARTICIPATION;
            default -> throw new RuntimeException("value");
          };
          case 'R' -> CORPORATE_BOND;
          default -> throw new RuntimeException("value");
        };
        case 'P' -> 
        switch(bytes[valBeg + 2]) {
          case '' -> COMMERCIAL_PAPER;
          case 'P' -> CORPORATE_PRIVATE_PLACEMENT;
          default -> throw new RuntimeException("value");
        };
        case 'S' -> COMMON_STOCK;
        default -> throw new RuntimeException("value");
      };
      case 'D' -> 
      switch(bytes[valBeg + 1]) {
        case 'E' -> DEFAULTED;
        case 'I' -> DEBTOR_IN_POSSESSION;
        case 'N' -> DEPOSIT_NOTES;
        case 'U' -> DUAL_CURRENCY;
        default -> throw new RuntimeException("value");
      };
      case 'E' -> 
      switch(bytes[valBeg + 1]) {
        case 'U' -> 
        switch(bytes[valBeg + 2]) {
          case 'C' -> 
          switch(bytes[valBeg + 3]) {
            case 'D' -> EURO_CERTIFICATE_OF_DEPOSIT;
            case 'O' -> EURO_CORPORATE_BOND;
            case 'P' -> EURO_COMMERCIAL_PAPER;
            default -> throw new RuntimeException("value");
          };
          case 'S' -> 
          switch(bytes[valBeg + 3]) {
            case 'O' -> EURO_SOVEREIGNS;
            case 'U' -> EURO_SUPRANATIONAL_COUPONS;
            default -> throw new RuntimeException("value");
          };
          default -> throw new RuntimeException("value");
        };
        default -> throw new RuntimeException("value");
      };
      case 'F' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> 
        switch(bytes[valBeg + 2]) {
          case 'C' -> FEDERAL_AGENCY_COUPON;
          case 'D' -> FEDERAL_AGENCY_DISCOUNT_NOTE;
          default -> throw new RuntimeException("value");
        };
        case 'O' -> 
        switch(bytes[valBeg + 2]) {
          case 'R' -> 
          switch(bytes[valBeg + 3]) {
            case '' -> FOREIGN_EXCHANGE_CONTRACT;
            case 'W' -> FORWARD;
            default -> throw new RuntimeException("value");
          };
          default -> throw new RuntimeException("value");
        };
        case 'U' -> FUTURE;
        default -> throw new RuntimeException("value");
      };
      case 'G' -> GENERAL_OBLIGATION_BONDS;
      case 'I' -> IOETTE_MORTGAGE;
      case 'L' -> 
      switch(bytes[valBeg + 1]) {
        case 'O' -> LETTER_OF_CREDIT;
        case 'Q' -> LIQUIDITY_NOTE;
        default -> throw new RuntimeException("value");
      };
      case 'M' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> MATURED;
        case 'B' -> MORTGAGE_BACKED_SECURITIES;
        case 'F' -> MUTUAL_FUND;
        case 'I' -> MORTGAGE_INTEREST_ONLY;
        case 'L' -> MULTI_LEG_INSTRUMENT;
        case 'P' -> 
        switch(bytes[valBeg + 2]) {
          case 'O' -> MORTGAGE_PRINCIPAL_ONLY;
          case 'P' -> MORTGAGE_PRIVATE_PLACEMENT;
          case 'T' -> MISCELLANEOUS_PASS_THROUGH;
          default -> throw new RuntimeException("value");
        };
        case 'T' -> 
        switch(bytes[valBeg + 2]) {
          case '' -> MANDATORY_TENDER;
          case 'N' -> MEDIUM_TERM_NOTES;
          default -> throw new RuntimeException("value");
        };
        default -> throw new RuntimeException("value");
      };
      case 'N' -> NO_SECURITY_TYPE;
      case 'O' -> 
      switch(bytes[valBeg + 1]) {
        case 'N' -> OVERNIGHT;
        case 'P' -> OPTION;
        default -> throw new RuntimeException("value");
      };
      case 'P' -> 
      switch(bytes[valBeg + 1]) {
        case 'E' -> PRIVATE_EXPORT_FUNDING;
        case 'F' -> PFANDBRIEFE;
        case 'N' -> PROMISSORY_NOTE;
        case 'S' -> PREFERRED_STOCK;
        case 'Z' -> PLAZOS_FIJOS;
        default -> throw new RuntimeException("value");
      };
      case 'R' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> REVENUE_ANTICIPATION_NOTE;
        case 'E' -> 
        switch(bytes[valBeg + 2]) {
          case 'P' -> 
          switch(bytes[valBeg + 3]) {
            case 'L' -> REPLACED;
            case 'O' -> REPURCHASE;
            default -> throw new RuntimeException("value");
          };
          case 'T' -> RETIRED;
          case 'V' -> REVENUE_BONDS;
          default -> throw new RuntimeException("value");
        };
        case 'V' -> 
        switch(bytes[valBeg + 2]) {
          case 'L' -> 
          switch(bytes[valBeg + 3]) {
            case 'V' -> 
            switch(bytes[valBeg + 4]) {
              case '' -> REVOLVER_LOAN;
              case 'T' -> REVOLVER_TERM_LOAN;
              default -> throw new RuntimeException("value");
            };
            default -> throw new RuntimeException("value");
          };
          default -> throw new RuntimeException("value");
        };
        default -> throw new RuntimeException("value");
      };
      case 'S' -> 
      switch(bytes[valBeg + 1]) {
        case 'E' -> 
        switch(bytes[valBeg + 2]) {
          case 'C' -> 
          switch(bytes[valBeg + 3]) {
            case 'L' -> SECURITIES_LOAN;
            case 'P' -> SECURITIES_PLEDGE;
            default -> throw new RuntimeException("value");
          };
          default -> throw new RuntimeException("value");
        };
        case 'P' -> 
        switch(bytes[valBeg + 2]) {
          case 'C' -> 
          switch(bytes[valBeg + 3]) {
            case 'L' -> 
            switch(bytes[valBeg + 4]) {
              case 'A' -> SPECIAL_ASSESSMENT;
              case 'O' -> SPECIAL_OBLIGATION;
              case 'T' -> SPECIAL_TAX;
              default -> throw new RuntimeException("value");
            };
            default -> throw new RuntimeException("value");
          };
          default -> throw new RuntimeException("value");
        };
        case 'T' -> 
        switch(bytes[valBeg + 2]) {
          case 'N' -> SHORT_TERM_LOAN_NOTE;
          case 'R' -> STRUCTURED_NOTES;
          default -> throw new RuntimeException("value");
        };
        case 'U' -> USD_SUPRANATIONAL_COUPONS;
        case 'W' -> SWING_LINE_FACILITY;
        default -> throw new RuntimeException("value");
      };
      case 'T' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> 
        switch(bytes[valBeg + 2]) {
          case 'N' -> TAX_ANTICIPATION_NOTE;
          case 'X' -> TAX_ALLOCATION;
          default -> throw new RuntimeException("value");
        };
        case 'B' -> 
        switch(bytes[valBeg + 2]) {
          case 'A' -> TO_BE_ANNOUNCED;
          case 'I' -> US_TREASURY_BILL_TBILL;
          case 'O' -> US_TREASURY_BOND;
          default -> throw new RuntimeException("value");
        };
        case 'C' -> PRINCIPAL_STRIP_OF_A_CALLABLE_BOND_OR_NOTE;
        case 'D' -> TIME_DEPOSIT;
        case 'E' -> 
        switch(bytes[valBeg + 2]) {
          case 'C' -> TAX_EXEMPT_COMMERCIAL_PAPER;
          case 'R' -> TERM_LOAN;
          default -> throw new RuntimeException("value");
        };
        case 'I' -> 
        switch(bytes[valBeg + 2]) {
          case 'N' -> INTEREST_STRIP_FROM_ANY_BOND_OR_NOTE;
          case 'P' -> TREASURY_INFLATION_PROTECTED_SECURITIES;
          default -> throw new RuntimeException("value");
        };
        case 'N' -> US_TREASURY_NOTE_TNOTE;
        case 'P' -> PRINCIPAL_STRIP_FROM_A_NON_CALLABLE_BOND_OR_NOTE;
        case 'R' -> TAX_REVENUE_ANTICIPATION_NOTE;
        default -> throw new RuntimeException("value");
      };
      case 'U' -> 
      switch(bytes[valBeg + 1]) {
        case 'S' -> 
        switch(bytes[valBeg + 2]) {
          case 'T' -> 
          switch(bytes[valBeg + 3]) {
            case '' -> US_TREASURY_NOTE_UST;
            case 'B' -> US_TREASURY_BILL_USTB;
            default -> throw new RuntimeException("value");
          };
          default -> throw new RuntimeException("value");
        };
        default -> throw new RuntimeException("value");
      };
      case 'V' -> VARIABLE_RATE_DEMAND_NOTE;
      case 'W' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> WARRANT;
        case 'I' -> WITHDRAWN;
        default -> throw new RuntimeException("value");
      };
      case 'X' -> 
      switch(bytes[valBeg + 1]) {
        case 'C' -> EXTENDED_COMM_NOTE;
        case 'L' -> INDEXED_LINKED;
        default -> throw new RuntimeException("value");
      };
      case 'Y' -> 
      switch(bytes[valBeg + 1]) {
        case 'A' -> YANKEE_CORPORATE_BOND;
        case 'C' -> YANKEE_CERTIFICATE_OF_DEPOSIT;
        default -> throw new RuntimeException("value");
      };
      default -> throw new RuntimeException("value");
    };
  }
}