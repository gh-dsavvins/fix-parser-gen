package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SideValue1 extends StringRef {

  public SideValue1(Message message) {
    super(message, FixTag.sideValue1);
  }
}