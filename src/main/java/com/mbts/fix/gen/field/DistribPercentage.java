package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class DistribPercentage extends StringRef {

  public DistribPercentage(Message message) {
    super(message, FixTag.distribPercentage);
  }
}