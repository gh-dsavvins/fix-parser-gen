package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class LegsGroup5 extends AbstractGroup {

  public LegsGroup5(AbstractMessage message) {
    super(message, FixTag.noLegs, FixTag.legSymbol, LegsGroup5Comp::new);
  }

  public LongRef noLegs() {
    return countField;
  }

  public LegsGroup5Comp legsGroup5Comp(int ix) {
    return (LegsGroup5Comp) components[ix];
  }
}