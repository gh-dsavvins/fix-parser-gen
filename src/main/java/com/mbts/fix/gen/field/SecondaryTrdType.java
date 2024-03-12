package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class SecondaryTrdType extends LongRef {

  public SecondaryTrdType(Message message) {
    super(message, FixTag.secondaryTrdType);
  }
}