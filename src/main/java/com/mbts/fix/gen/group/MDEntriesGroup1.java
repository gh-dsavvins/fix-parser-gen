package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class MDEntriesGroup1 extends AbstractGroup {

  public MDEntriesGroup1(AbstractMessage message) {
    super(message, FixTag.noMDEntries, FixTag.mDUpdateAction, MDEntriesGroup1Comp::new);
  }

  public LongRef noMDEntries() {
    return countField;
  }

  public MDEntriesGroup1Comp mDEntriesGroup1Comp(int ix) {
    return (MDEntriesGroup1Comp) components[ix];
  }
}