package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class LegSettlDate extends StringRef {

  public LegSettlDate(Message message) {
    super(message, FixTag.legSettlDate);
  }
}