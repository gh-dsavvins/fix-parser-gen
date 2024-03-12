package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class LegsGroup1 extends AbstractGroup {

  public LegsGroup1(AbstractMessage message) {
    super(message, FixTag.noLegs, FixTag.legSymbol, LegsGroup1Comp::new);
  }

  public LongRef noLegs() {
    return countField;
  }

  public LegsGroup1Comp legsGroup1Comp(int ix) {
    return (LegsGroup1Comp) components[ix];
  }
}