package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class SettlPartyIDsGroup extends AbstractGroup {

  public SettlPartyIDsGroup(AbstractMessage message) {
    super(message, FixTag.noSettlPartyIDs, FixTag.settlPartyID, SettlPartyIDsGroupComp::new);
  }

  public LongRef noSettlPartyIDs() {
    return countField;
  }

  public SettlPartyIDsGroupComp settlPartyIDsGroupComp(int ix) {
    return (SettlPartyIDsGroupComp) components[ix];
  }
}