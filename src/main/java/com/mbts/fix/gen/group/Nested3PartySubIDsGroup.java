package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class Nested3PartySubIDsGroup extends AbstractGroup {

  public Nested3PartySubIDsGroup(AbstractMessage message) {
    super(message, FixTag.noNested3PartySubIDs, FixTag.nested3PartySubID, Nested3PartySubIDsGroupComp::new);
  }

  public LongRef noNested3PartySubIDs() {
    return countField;
  }

  public Nested3PartySubIDsGroupComp nested3PartySubIDsGroupComp(int ix) {
    return (Nested3PartySubIDsGroupComp) components[ix];
  }
}