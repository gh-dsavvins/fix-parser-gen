package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class SettlInstGroup extends AbstractGroup {

  public SettlInstGroup(AbstractMessage message) {
    super(message, FixTag.noSettlInst, FixTag.settlInstID, SettlInstGroupComp::new);
  }

  public LongRef noSettlInst() {
    return countField;
  }

  public SettlInstGroupComp settlInstGroupComp(int ix) {
    return (SettlInstGroupComp) components[ix];
  }
}