package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class GrossTradeAmt extends StringRef {

  public GrossTradeAmt(Message message) {
    super(message, FixTag.grossTradeAmt);
  }
}