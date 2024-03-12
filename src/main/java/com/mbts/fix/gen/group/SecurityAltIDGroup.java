package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class SecurityAltIDGroup extends AbstractGroup {

  public SecurityAltIDGroup(AbstractMessage message) {
    super(message, FixTag.noSecurityAltID, FixTag.securityAltID, SecurityAltIDGroupComp::new);
  }

  public LongRef noSecurityAltID() {
    return countField;
  }

  public SecurityAltIDGroupComp securityAltIDGroupComp(int ix) {
    return (SecurityAltIDGroupComp) components[ix];
  }
}