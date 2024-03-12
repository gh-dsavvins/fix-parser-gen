package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class AllocAccruedInterestAmt extends StringRef {

  public AllocAccruedInterestAmt(Message message) {
    super(message, FixTag.allocAccruedInterestAmt);
  }
}