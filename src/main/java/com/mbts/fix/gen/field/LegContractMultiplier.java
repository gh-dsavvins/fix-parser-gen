package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class LegContractMultiplier extends DoubleRef {

  public LegContractMultiplier(Message message) {
    super(message, FixTag.legContractMultiplier);
  }
}