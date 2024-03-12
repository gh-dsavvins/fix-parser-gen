package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class UnderlyingSecurityAltIDGroup extends AbstractGroup {

  public UnderlyingSecurityAltIDGroup(AbstractMessage message) {
    super(message, FixTag.noUnderlyingSecurityAltID, FixTag.underlyingSecurityAltID, UnderlyingSecurityAltIDGroupComp::new);
  }

  public LongRef noUnderlyingSecurityAltID() {
    return countField;
  }

  public UnderlyingSecurityAltIDGroupComp underlyingSecurityAltIDGroupComp(int ix) {
    return (UnderlyingSecurityAltIDGroupComp) components[ix];
  }
}