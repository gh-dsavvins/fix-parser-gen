package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class LegsGroup3 extends AbstractGroup {

  public LegsGroup3(AbstractMessage message) {
    super(message, FixTag.noLegs, FixTag.legSymbol, LegsGroup3Comp::new);
  }

  public LongRef noLegs() {
    return countField;
  }

  public LegsGroup3Comp legsGroup3Comp(int ix) {
    return (LegsGroup3Comp) components[ix];
  }
}