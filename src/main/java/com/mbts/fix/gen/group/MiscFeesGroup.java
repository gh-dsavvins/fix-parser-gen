package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class MiscFeesGroup extends AbstractGroup {

  public MiscFeesGroup(AbstractMessage message) {
    super(message, FixTag.noMiscFees, FixTag.miscFeeAmt, MiscFeesGroupComp::new);
  }

  public LongRef noMiscFees() {
    return countField;
  }

  public MiscFeesGroupComp miscFeesGroupComp(int ix) {
    return (MiscFeesGroupComp) components[ix];
  }
}