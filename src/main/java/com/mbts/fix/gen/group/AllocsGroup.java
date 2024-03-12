package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class AllocsGroup extends AbstractGroup {

  public AllocsGroup(AbstractMessage message) {
    super(message, FixTag.noAllocs, FixTag.allocAccount, AllocsGroupComp::new);
  }

  public LongRef noAllocs() {
    return countField;
  }

  public AllocsGroupComp allocsGroupComp(int ix) {
    return (AllocsGroupComp) components[ix];
  }
}