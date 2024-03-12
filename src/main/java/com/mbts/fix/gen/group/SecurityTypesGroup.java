package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class SecurityTypesGroup extends AbstractGroup {

  public SecurityTypesGroup(AbstractMessage message) {
    super(message, FixTag.noSecurityTypes, FixTag.securityType, SecurityTypesGroupComp::new);
  }

  public LongRef noSecurityTypes() {
    return countField;
  }

  public SecurityTypesGroupComp securityTypesGroupComp(int ix) {
    return (SecurityTypesGroupComp) components[ix];
  }
}