package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class Nested2PartyIDsGroup extends AbstractGroup {

  public Nested2PartyIDsGroup(AbstractMessage message) {
    super(message, FixTag.noNested2PartyIDs, FixTag.nested2PartyID, Nested2PartyIDsGroupComp::new);
  }

  public LongRef noNested2PartyIDs() {
    return countField;
  }

  public Nested2PartyIDsGroupComp nested2PartyIDsGroupComp(int ix) {
    return (Nested2PartyIDsGroupComp) components[ix];
  }
}