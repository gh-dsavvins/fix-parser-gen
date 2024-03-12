package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SettlDate2 extends StringRef {

  public SettlDate2(Message message) {
    super(message, FixTag.settlDate2);
  }
}