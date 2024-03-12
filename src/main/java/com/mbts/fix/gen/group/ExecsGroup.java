package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class ExecsGroup extends AbstractGroup {

  public ExecsGroup(AbstractMessage message) {
    super(message, FixTag.noExecs, FixTag.lastQty, ExecsGroupComp::new);
  }

  public LongRef noExecs() {
    return countField;
  }

  public ExecsGroupComp execsGroupComp(int ix) {
    return (ExecsGroupComp) components[ix];
  }
}