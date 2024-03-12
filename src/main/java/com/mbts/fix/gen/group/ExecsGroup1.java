package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class ExecsGroup1 extends AbstractGroup {

  public ExecsGroup1(AbstractMessage message) {
    super(message, FixTag.noExecs, FixTag.execID, ExecsGroup1Comp::new);
  }

  public LongRef noExecs() {
    return countField;
  }

  public ExecsGroup1Comp execsGroup1Comp(int ix) {
    return (ExecsGroup1Comp) components[ix];
  }
}