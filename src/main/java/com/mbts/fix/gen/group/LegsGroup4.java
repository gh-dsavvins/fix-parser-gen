package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class LegsGroup4 extends AbstractGroup {

  public LegsGroup4(AbstractMessage message) {
    super(message, FixTag.noLegs, FixTag.legSymbol, LegsGroup4Comp::new);
  }

  public LongRef noLegs() {
    return countField;
  }

  public LegsGroup4Comp legsGroup4Comp(int ix) {
    return (LegsGroup4Comp) components[ix];
  }
}