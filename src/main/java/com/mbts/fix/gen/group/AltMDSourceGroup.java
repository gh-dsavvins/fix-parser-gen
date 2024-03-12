package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class AltMDSourceGroup extends AbstractGroup {

  public AltMDSourceGroup(AbstractMessage message) {
    super(message, FixTag.noAltMDSource, FixTag.altMDSourceID, AltMDSourceGroupComp::new);
  }

  public LongRef noAltMDSource() {
    return countField;
  }

  public AltMDSourceGroupComp altMDSourceGroupComp(int ix) {
    return (AltMDSourceGroupComp) components[ix];
  }
}