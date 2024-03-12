package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class AllocsGroup1 extends AbstractGroup {

  public AllocsGroup1(AbstractMessage message) {
    super(message, FixTag.noAllocs, FixTag.allocAccount, AllocsGroup1Comp::new);
  }

  public LongRef noAllocs() {
    return countField;
  }

  public AllocsGroup1Comp allocsGroup1Comp(int ix) {
    return (AllocsGroup1Comp) components[ix];
  }
}