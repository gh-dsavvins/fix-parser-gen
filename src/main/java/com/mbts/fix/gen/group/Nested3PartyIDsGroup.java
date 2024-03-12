package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class Nested3PartyIDsGroup extends AbstractGroup {

  public Nested3PartyIDsGroup(AbstractMessage message) {
    super(message, FixTag.noNested3PartyIDs, FixTag.nested3PartyID, Nested3PartyIDsGroupComp::new);
  }

  public LongRef noNested3PartyIDs() {
    return countField;
  }

  public Nested3PartyIDsGroupComp nested3PartyIDsGroupComp(int ix) {
    return (Nested3PartyIDsGroupComp) components[ix];
  }
}