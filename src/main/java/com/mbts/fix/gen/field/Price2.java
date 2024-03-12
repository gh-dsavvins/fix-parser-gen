package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class Price2 extends StringRef {

  public Price2(Message message) {
    super(message, FixTag.price2);
  }
}