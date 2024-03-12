package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class AllocsGroup2 extends AbstractGroup {

  public AllocsGroup2(AbstractMessage message) {
    super(message, FixTag.noAllocs, FixTag.allocAccount, AllocsGroup2Comp::new);
  }

  public LongRef noAllocs() {
    return countField;
  }

  public AllocsGroup2Comp allocsGroup2Comp(int ix) {
    return (AllocsGroup2Comp) components[ix];
  }
}