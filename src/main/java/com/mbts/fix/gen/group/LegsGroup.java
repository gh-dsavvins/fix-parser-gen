package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class LegsGroup extends AbstractGroup {

  public LegsGroup(AbstractMessage message) {
    super(message, FixTag.noLegs, FixTag.legSymbol, LegsGroupComp::new);
  }

  public LongRef noLegs() {
    return countField;
  }

  public LegsGroupComp legsGroupComp(int ix) {
    return (LegsGroupComp) components[ix];
  }
}