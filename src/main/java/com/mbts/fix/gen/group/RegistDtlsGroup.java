package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class RegistDtlsGroup extends AbstractGroup {

  public RegistDtlsGroup(AbstractMessage message) {
    super(message, FixTag.noRegistDtls, FixTag.registDtls, RegistDtlsGroupComp::new);
  }

  public LongRef noRegistDtls() {
    return countField;
  }

  public RegistDtlsGroupComp registDtlsGroupComp(int ix) {
    return (RegistDtlsGroupComp) components[ix];
  }
}