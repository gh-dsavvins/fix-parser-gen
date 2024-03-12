package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class ContAmtsGroup extends AbstractGroup {

  public ContAmtsGroup(AbstractMessage message) {
    super(message, FixTag.noContAmts, FixTag.contAmtType, ContAmtsGroupComp::new);
  }

  public LongRef noContAmts() {
    return countField;
  }

  public ContAmtsGroupComp contAmtsGroupComp(int ix) {
    return (ContAmtsGroupComp) components[ix];
  }
}