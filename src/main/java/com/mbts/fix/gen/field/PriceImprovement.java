package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class PriceImprovement extends StringRef {

  public PriceImprovement(Message message) {
    super(message, FixTag.priceImprovement);
  }
}