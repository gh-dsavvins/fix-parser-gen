package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class CompIDsGroup1 extends AbstractGroup {

  public CompIDsGroup1(AbstractMessage message) {
    super(message, FixTag.noCompIDs, FixTag.refCompID, CompIDsGroup1Comp::new);
  }

  public LongRef noCompIDs() {
    return countField;
  }

  public CompIDsGroup1Comp compIDsGroup1Comp(int ix) {
    return (CompIDsGroup1Comp) components[ix];
  }
}