package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class LegAllocsGroup extends AbstractGroup {

  public LegAllocsGroup(AbstractMessage message) {
    super(message, FixTag.noLegAllocs, FixTag.legAllocAccount, LegAllocsGroupComp::new);
  }

  public LongRef noLegAllocs() {
    return countField;
  }

  public LegAllocsGroupComp legAllocsGroupComp(int ix) {
    return (LegAllocsGroupComp) components[ix];
  }
}