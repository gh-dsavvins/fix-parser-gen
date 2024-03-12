package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class MDEntriesGroup extends AbstractGroup {

  public MDEntriesGroup(AbstractMessage message) {
    super(message, FixTag.noMDEntries, FixTag.mDEntryType, MDEntriesGroupComp::new);
  }

  public LongRef noMDEntries() {
    return countField;
  }

  public MDEntriesGroupComp mDEntriesGroupComp(int ix) {
    return (MDEntriesGroupComp) components[ix];
  }
}