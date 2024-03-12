package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class SettlPartySubIDsGroup extends AbstractGroup {

  public SettlPartySubIDsGroup(AbstractMessage message) {
    super(message, FixTag.noSettlPartySubIDs, FixTag.settlPartySubID, SettlPartySubIDsGroupComp::new);
  }

  public LongRef noSettlPartySubIDs() {
    return countField;
  }

  public SettlPartySubIDsGroupComp settlPartySubIDsGroupComp(int ix) {
    return (SettlPartySubIDsGroupComp) components[ix];
  }
}