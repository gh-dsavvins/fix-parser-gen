package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class IOIQualifiersGroup extends AbstractGroup {

  public IOIQualifiersGroup(AbstractMessage message) {
    super(message, FixTag.noIOIQualifiers, FixTag.iOIQualifier, IOIQualifiersGroupComp::new);
  }

  public LongRef noIOIQualifiers() {
    return countField;
  }

  public IOIQualifiersGroupComp iOIQualifiersGroupComp(int ix) {
    return (IOIQualifiersGroupComp) components[ix];
  }
}