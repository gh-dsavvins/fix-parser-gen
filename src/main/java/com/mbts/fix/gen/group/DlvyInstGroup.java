package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class DlvyInstGroup extends AbstractGroup {

  public DlvyInstGroup(AbstractMessage message) {
    super(message, FixTag.noDlvyInst, FixTag.settlInstSource, DlvyInstGroupComp::new);
  }

  public LongRef noDlvyInst() {
    return countField;
  }

  public DlvyInstGroupComp dlvyInstGroupComp(int ix) {
    return (DlvyInstGroupComp) components[ix];
  }
}