package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class PosAmtGroup extends AbstractGroup {

  public PosAmtGroup(AbstractMessage message) {
    super(message, FixTag.noPosAmt, FixTag.posAmtType, PosAmtGroupComp::new);
  }

  public LongRef noPosAmt() {
    return countField;
  }

  public PosAmtGroupComp posAmtGroupComp(int ix) {
    return (PosAmtGroupComp) components[ix];
  }
}