package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class SidesGroup1 extends AbstractGroup {

  public SidesGroup1(AbstractMessage message) {
    super(message, FixTag.noSides, FixTag.side, SidesGroup1Comp::new);
  }

  public LongRef noSides() {
    return countField;
  }

  public SidesGroup1Comp sidesGroup1Comp(int ix) {
    return (SidesGroup1Comp) components[ix];
  }
}