package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class MDEntryTypesGroup extends AbstractGroup {

  public MDEntryTypesGroup(AbstractMessage message) {
    super(message, FixTag.noMDEntryTypes, FixTag.mDEntryType, MDEntryTypesGroupComp::new);
  }

  public LongRef noMDEntryTypes() {
    return countField;
  }

  public MDEntryTypesGroupComp mDEntryTypesGroupComp(int ix) {
    return (MDEntryTypesGroupComp) components[ix];
  }
}