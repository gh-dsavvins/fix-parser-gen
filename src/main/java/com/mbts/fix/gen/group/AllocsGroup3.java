package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class AllocsGroup3 extends AbstractGroup {

  public AllocsGroup3(AbstractMessage message) {
    super(message, FixTag.noAllocs, FixTag.allocAccount, AllocsGroup3Comp::new);
  }

  public LongRef noAllocs() {
    return countField;
  }

  public AllocsGroup3Comp allocsGroup3Comp(int ix) {
    return (AllocsGroup3Comp) components[ix];
  }
}