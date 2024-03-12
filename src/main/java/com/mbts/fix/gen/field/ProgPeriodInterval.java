package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class ProgPeriodInterval extends LongRef {

  public ProgPeriodInterval(Message message) {
    super(message, FixTag.progPeriodInterval);
  }
}