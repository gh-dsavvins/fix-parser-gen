package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class CompIDsGroup extends AbstractGroup {

  public CompIDsGroup(AbstractMessage message) {
    super(message, FixTag.noCompIDs, FixTag.refCompID, CompIDsGroupComp::new);
  }

  public LongRef noCompIDs() {
    return countField;
  }

  public CompIDsGroupComp compIDsGroupComp(int ix) {
    return (CompIDsGroupComp) components[ix];
  }
}