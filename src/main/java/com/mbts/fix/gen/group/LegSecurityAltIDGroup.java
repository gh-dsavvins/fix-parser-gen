package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class LegSecurityAltIDGroup extends AbstractGroup {

  public LegSecurityAltIDGroup(AbstractMessage message) {
    super(message, FixTag.noLegSecurityAltID, FixTag.legSecurityAltID, LegSecurityAltIDGroupComp::new);
  }

  public LongRef noLegSecurityAltID() {
    return countField;
  }

  public LegSecurityAltIDGroupComp legSecurityAltIDGroupComp(int ix) {
    return (LegSecurityAltIDGroupComp) components[ix];
  }
}