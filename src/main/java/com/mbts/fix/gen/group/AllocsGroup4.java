package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class AllocsGroup4 extends AbstractGroup {

  public AllocsGroup4(AbstractMessage message) {
    super(message, FixTag.noAllocs, FixTag.allocAccount, AllocsGroup4Comp::new);
  }

  public LongRef noAllocs() {
    return countField;
  }

  public AllocsGroup4Comp allocsGroup4Comp(int ix) {
    return (AllocsGroup4Comp) components[ix];
  }
}