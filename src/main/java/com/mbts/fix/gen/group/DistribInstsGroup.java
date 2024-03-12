package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class DistribInstsGroup extends AbstractGroup {

  public DistribInstsGroup(AbstractMessage message) {
    super(message, FixTag.noDistribInsts, FixTag.distribPaymentMethod, DistribInstsGroupComp::new);
  }

  public LongRef noDistribInsts() {
    return countField;
  }

  public DistribInstsGroupComp distribInstsGroupComp(int ix) {
    return (DistribInstsGroupComp) components[ix];
  }
}