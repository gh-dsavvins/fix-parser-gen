package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class LegPriceType extends LongRef {

  public LegPriceType(Message message) {
    super(message, FixTag.legPriceType);
  }
}