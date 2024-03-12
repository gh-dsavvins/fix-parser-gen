package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class LegsGroup7 extends AbstractGroup {

  public LegsGroup7(AbstractMessage message) {
    super(message, FixTag.noLegs, FixTag.legSymbol, LegsGroup7Comp::new);
  }

  public LongRef noLegs() {
    return countField;
  }

  public LegsGroup7Comp legsGroup7Comp(int ix) {
    return (LegsGroup7Comp) components[ix];
  }
}