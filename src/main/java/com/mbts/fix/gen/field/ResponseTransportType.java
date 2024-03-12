package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ResponseTransportType extends LongRef {

  public static final long OUT_OF_BAND_PRE_ARRANGED_OUT_OF_BAND_DELIVERY_MECHANISM = 1;
  public static final long INBAND_TRANSPORT_THE_REQUEST_WAS_SENT_OVER = 0;

  public ResponseTransportType(Message message) {
    super(message, FixTag.responseTransportType);
  }

  public static long value(byte[] bytes, int valBeg) {
    return switch(bytes[valBeg]) {
      case '0' -> INBAND_TRANSPORT_THE_REQUEST_WAS_SENT_OVER;
      case '1' -> OUT_OF_BAND_PRE_ARRANGED_OUT_OF_BAND_DELIVERY_MECHANISM;
      default -> throw new RuntimeException("value");
    };
  }
}