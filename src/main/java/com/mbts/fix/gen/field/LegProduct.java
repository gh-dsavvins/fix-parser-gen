package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class LegProduct extends LongRef {

  public LegProduct(Message message) {
    super(message, FixTag.legProduct);
  }
}