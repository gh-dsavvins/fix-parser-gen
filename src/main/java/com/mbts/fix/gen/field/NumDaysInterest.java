package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class NumDaysInterest extends LongRef {

  public NumDaysInterest(Message message) {
    super(message, FixTag.numDaysInterest);
  }
}