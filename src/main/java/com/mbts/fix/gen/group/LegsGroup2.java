package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class LegsGroup2 extends AbstractGroup {

  public LegsGroup2(AbstractMessage message) {
    super(message, FixTag.noLegs, FixTag.legSymbol, LegsGroup2Comp::new);
  }

  public LongRef noLegs() {
    return countField;
  }

  public LegsGroup2Comp legsGroup2Comp(int ix) {
    return (LegsGroup2Comp) components[ix];
  }
}