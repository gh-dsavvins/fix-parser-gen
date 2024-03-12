package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class SidesGroup2 extends AbstractGroup {

  public SidesGroup2(AbstractMessage message) {
    super(message, FixTag.noSides, FixTag.side, SidesGroup2Comp::new);
  }

  public LongRef noSides() {
    return countField;
  }

  public SidesGroup2Comp sidesGroup2Comp(int ix) {
    return (SidesGroup2Comp) components[ix];
  }
}