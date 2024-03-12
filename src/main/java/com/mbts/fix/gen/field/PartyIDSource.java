package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PartyIDSource extends StringRef {

  public static final String US_EMPLOYER_IDENTIFICATION_NUMBER = "8";
  public static final String MIC = "G";
  public static final String TAIWANESE_TRADING_ACCOUNT = "3";
  public static final String BIC = "B";
  public static final String CHINESE_B_SHARE = "5";
  public static final String AUSTRALIAN_TAX_FILE_NUMBER = "A";
  public static final String ISO_COUNTRY_CODE = "E";
  public static final String CSD_PARTICIPANT_MEMBER_CODE = "H";
  public static final String DIRECTED_BROKER_THREE_CHARACTER_ACRONYM_AS_DEFINED_IN_ISITC_ETC_BEST_PRACTICE_GUIDELINES_DOCUMENT = "I";
  public static final String SETTLEMENT_ENTITY_LOCATION = "F";
  public static final String KOREAN_INVESTOR_ID = "1";
  public static final String MALAYSIAN_CENTRAL_DEPOSITORY = "4";
  public static final String AUSTRALIAN_BUSINESS_NUMBER = "9";
  public static final String TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID_QFII = "2";
  public static final String PROPRIETARY_CUSTOM_CODE = "D";
  public static final String US_SOCIAL_SECURITY_NUMBER = "7";
  public static final String UK_NATIONAL_INSURANCE_OR_PENSION_NUMBER = "6";
  public static final String GENERALLY_ACCEPTED_MARKET_PARTICIPANT_IDENTIFIER = "C";

  public PartyIDSource(Message message) {
    super(message, FixTag.partyIDSource);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '1' -> KOREAN_INVESTOR_ID;
      case '2' -> TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID_QFII;
      case '3' -> TAIWANESE_TRADING_ACCOUNT;
      case '4' -> MALAYSIAN_CENTRAL_DEPOSITORY;
      case '5' -> CHINESE_B_SHARE;
      case '6' -> UK_NATIONAL_INSURANCE_OR_PENSION_NUMBER;
      case '7' -> US_SOCIAL_SECURITY_NUMBER;
      case '8' -> US_EMPLOYER_IDENTIFICATION_NUMBER;
      case '9' -> AUSTRALIAN_BUSINESS_NUMBER;
      case 'A' -> AUSTRALIAN_TAX_FILE_NUMBER;
      case 'B' -> BIC;
      case 'C' -> GENERALLY_ACCEPTED_MARKET_PARTICIPANT_IDENTIFIER;
      case 'D' -> PROPRIETARY_CUSTOM_CODE;
      case 'E' -> ISO_COUNTRY_CODE;
      case 'F' -> SETTLEMENT_ENTITY_LOCATION;
      case 'G' -> MIC;
      case 'H' -> CSD_PARTICIPANT_MEMBER_CODE;
      case 'I' -> DIRECTED_BROKER_THREE_CHARACTER_ACRONYM_AS_DEFINED_IN_ISITC_ETC_BEST_PRACTICE_GUIDELINES_DOCUMENT;
      default -> throw new RuntimeException("value");
    };
  }
}