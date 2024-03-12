package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class StrikePrice extends StringRef {

  public StrikePrice(Message message) {
    super(message, FixTag.strikePrice);
  }
}