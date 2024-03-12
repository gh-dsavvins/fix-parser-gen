package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MessageEncoding extends StringRef {

  public static final String FOR_USING_SJIS = "Shift_JIS";
  public static final String JIS = "ISO-2022-JP";
  public static final String EUC = "EUC-JP";
  public static final String UNICODE = "UTF-8";

  public MessageEncoding(Message message) {
    super(message, FixTag.messageEncoding);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case 'E' -> EUC;
      case 'I' -> JIS;
      case 'S' -> FOR_USING_SJIS;
      case 'U' -> UNICODE;
      default -> throw new RuntimeException("value");
    };
  }
}