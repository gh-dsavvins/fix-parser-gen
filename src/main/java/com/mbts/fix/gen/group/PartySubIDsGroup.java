package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class PartySubIDsGroup extends AbstractGroup {

  public PartySubIDsGroup(AbstractMessage message) {
    super(message, FixTag.noPartySubIDs, FixTag.partySubID, PartySubIDsGroupComp::new);
  }

  public LongRef noPartySubIDs() {
    return countField;
  }

  public PartySubIDsGroupComp partySubIDsGroupComp(int ix) {
    return (PartySubIDsGroupComp) components[ix];
  }
}