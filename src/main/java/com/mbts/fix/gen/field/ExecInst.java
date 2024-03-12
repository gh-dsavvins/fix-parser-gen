package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ExecInst extends StringRef {

  public static final String SUSPEND = "S";
  public static final String TRY_TO_STOP = "Y";
  public static final String NETTING = "V";
  public static final String NOT_HELD = "1";
  public static final String OPENING_PEG = "O";
  public static final String CANCEL_ON_SYSTEM_FAILURE = "Q";
  public static final String CALL_FIRST = "C";
  public static final String STAY_ON_BIDSIDE = "9";
  public static final String CANCEL_IF_NOT_BEST = "Z";
  public static final String REINSTATE_ON_TRADING_HALT = "J";
  public static final String PEG_TO_LIMIT_PRICE = "d";
  public static final String TRAILING_STOP_PEG = "a";
  public static final String NO_CROSS = "A";
  public static final String LAST_PEG = "L";
  public static final String TRADE_ALONG = "X";
  public static final String PEG_TO_VWAP = "W";
  public static final String PRIMARY_PEG = "R";
  public static final String TRY_TO_SCALE = "8";
  public static final String STAY_ON_OFFERSIDE = "0";
  public static final String HELD = "5";
  public static final String MID_PRICE_PEG = "M";
  public static final String REINSTATE_ON_SYSTEM_FAILURE = "H";
  public static final String CANCEL_ON_TRADING_HALT = "K";
  public static final String WORK_TO_TARGET_STRATEGY = "e";
  public static final String NON_NEGOTIABLE = "N";
  public static final String WORK = "2";
  public static final String GO_ALONG = "3";
  public static final String DO_NOT_REDUCE = "F";
  public static final String STRICT_SCALE = "7";
  public static final String IGNORE_PRICE_VALIDITY_CHECKS = "c";
  public static final String PERCENT_OF_VOLUME = "D";
  public static final String DO_NOT_INCREASE = "E";
  public static final String ALL_OR_NONE = "G";
  public static final String MARKET_PEG = "P";
  public static final String CUSTOMER_DISPLAY_INSTRUCTION = "U";
  public static final String OK_TO_CROSS = "B";
  public static final String PARTICIPATE_DONT_INITIATE = "6";
  public static final String INSTITUTIONS_ONLY = "I";
  public static final String STRICT_LIMIT = "b";
  public static final String OVER_THE_DAY = "4";

  public ExecInst(Message message) {
    super(message, FixTag.execInst);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> STAY_ON_OFFERSIDE;
      case '1' -> NOT_HELD;
      case '2' -> WORK;
      case '3' -> GO_ALONG;
      case '4' -> OVER_THE_DAY;
      case '5' -> HELD;
      case '6' -> PARTICIPATE_DONT_INITIATE;
      case '7' -> STRICT_SCALE;
      case '8' -> TRY_TO_SCALE;
      case '9' -> STAY_ON_BIDSIDE;
      case 'A' -> NO_CROSS;
      case 'B' -> OK_TO_CROSS;
      case 'C' -> CALL_FIRST;
      case 'D' -> PERCENT_OF_VOLUME;
      case 'E' -> DO_NOT_INCREASE;
      case 'F' -> DO_NOT_REDUCE;
      case 'G' -> ALL_OR_NONE;
      case 'H' -> REINSTATE_ON_SYSTEM_FAILURE;
      case 'I' -> INSTITUTIONS_ONLY;
      case 'J' -> REINSTATE_ON_TRADING_HALT;
      case 'K' -> CANCEL_ON_TRADING_HALT;
      case 'L' -> LAST_PEG;
      case 'M' -> MID_PRICE_PEG;
      case 'N' -> NON_NEGOTIABLE;
      case 'O' -> OPENING_PEG;
      case 'P' -> MARKET_PEG;
      case 'Q' -> CANCEL_ON_SYSTEM_FAILURE;
      case 'R' -> PRIMARY_PEG;
      case 'S' -> SUSPEND;
      case 'U' -> CUSTOMER_DISPLAY_INSTRUCTION;
      case 'V' -> NETTING;
      case 'W' -> PEG_TO_VWAP;
      case 'X' -> TRADE_ALONG;
      case 'Y' -> TRY_TO_STOP;
      case 'Z' -> CANCEL_IF_NOT_BEST;
      case 'a' -> TRAILING_STOP_PEG;
      case 'b' -> STRICT_LIMIT;
      case 'c' -> IGNORE_PRICE_VALIDITY_CHECKS;
      case 'd' -> PEG_TO_LIMIT_PRICE;
      case 'e' -> WORK_TO_TARGET_STRATEGY;
      default -> throw new RuntimeException("value");
    };
  }
}