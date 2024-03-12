package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class MarginExcess extends StringRef {

  public MarginExcess(Message message) {
    super(message, FixTag.marginExcess);
  }
}