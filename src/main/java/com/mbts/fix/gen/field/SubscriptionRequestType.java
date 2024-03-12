package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SubscriptionRequestType extends StringRef {

  public static final String SNAPSHOT = "0";
  public static final String SNAPSHOT_PLUS_UPDATES = "1";
  public static final String DISABLE_PREVIOUS_SNAPSHOT_PLUS_UPDATE_REQUEST = "2";

  public SubscriptionRequestType(Message message) {
    super(message, FixTag.subscriptionRequestType);
  }

  public static String value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> SNAPSHOT;
      case '1' -> SNAPSHOT_PLUS_UPDATES;
      case '2' -> DISABLE_PREVIOUS_SNAPSHOT_PLUS_UPDATE_REQUEST;
      default -> throw new RuntimeException("value");
    };
  }
}