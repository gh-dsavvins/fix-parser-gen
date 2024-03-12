package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class LiquidityPctLow extends StringRef {

  public LiquidityPctLow(Message message) {
    super(message, FixTag.liquidityPctLow);
  }
}