package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class SidesGroup extends AbstractGroup {

  public SidesGroup(AbstractMessage message) {
    super(message, FixTag.noSides, FixTag.side, SidesGroupComp::new);
  }

  public LongRef noSides() {
    return countField;
  }

  public SidesGroupComp sidesGroupComp(int ix) {
    return (SidesGroupComp) components[ix];
  }
}