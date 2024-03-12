package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class LegsGroup6 extends AbstractGroup {

  public LegsGroup6(AbstractMessage message) {
    super(message, FixTag.noLegs, FixTag.legSymbol, LegsGroup6Comp::new);
  }

  public LongRef noLegs() {
    return countField;
  }

  public LegsGroup6Comp legsGroup6Comp(int ix) {
    return (LegsGroup6Comp) components[ix];
  }
}