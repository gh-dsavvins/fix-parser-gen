package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class DayAvgPx extends StringRef {

  public DayAvgPx(Message message) {
    super(message, FixTag.dayAvgPx);
  }
}