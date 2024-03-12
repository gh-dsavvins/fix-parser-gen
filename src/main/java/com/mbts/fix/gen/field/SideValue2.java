package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SideValue2 extends StringRef {

  public SideValue2(Message message) {
    super(message, FixTag.sideValue2);
  }
}