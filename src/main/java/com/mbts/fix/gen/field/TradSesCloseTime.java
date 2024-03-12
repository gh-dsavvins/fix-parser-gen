package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class TradSesCloseTime extends StringRef {

  public TradSesCloseTime(Message message) {
    super(message, FixTag.tradSesCloseTime);
  }
}