package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MiscFeeAmt extends StringRef {

  public MiscFeeAmt(Message message) {
    super(message, FixTag.miscFeeAmt);
  }
}