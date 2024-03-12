package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class HopsGroup extends AbstractGroup {

  public HopsGroup(AbstractMessage message) {
    super(message, FixTag.noHops, FixTag.hopCompID, HopsGroupComp::new);
  }

  public LongRef noHops() {
    return countField;
  }

  public HopsGroupComp hopsGroupComp(int ix) {
    return (HopsGroupComp) components[ix];
  }
}