package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class StipulationValue extends StringRef {

  public StipulationValue(Message message) {
    super(message, FixTag.stipulationValue);
  }
}