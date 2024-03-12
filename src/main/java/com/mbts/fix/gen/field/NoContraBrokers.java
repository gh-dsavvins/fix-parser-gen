package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class NoContraBrokers extends LongRef {

  public NoContraBrokers(Message message) {
    super(message, FixTag.noContraBrokers);
  }
}