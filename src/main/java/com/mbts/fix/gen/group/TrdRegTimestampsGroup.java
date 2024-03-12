package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class TrdRegTimestampsGroup extends AbstractGroup {

  public TrdRegTimestampsGroup(AbstractMessage message) {
    super(message, FixTag.noTrdRegTimestamps, FixTag.trdRegTimestamp, TrdRegTimestampsGroupComp::new);
  }

  public LongRef noTrdRegTimestamps() {
    return countField;
  }

  public TrdRegTimestampsGroupComp trdRegTimestampsGroupComp(int ix) {
    return (TrdRegTimestampsGroupComp) components[ix];
  }
}