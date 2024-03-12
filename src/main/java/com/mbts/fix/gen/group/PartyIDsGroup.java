package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class PartyIDsGroup extends AbstractGroup {

  public PartyIDsGroup(AbstractMessage message) {
    super(message, FixTag.noPartyIDs, FixTag.partyID, PartyIDsGroupComp::new);
  }

  public LongRef noPartyIDs() {
    return countField;
  }

  public PartyIDsGroupComp partyIDsGroupComp(int ix) {
    return (PartyIDsGroupComp) components[ix];
  }
}