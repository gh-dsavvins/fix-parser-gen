package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class Nested2PartySubIDsGroup extends AbstractGroup {

  public Nested2PartySubIDsGroup(AbstractMessage message) {
    super(message, FixTag.noNested2PartySubIDs, FixTag.nested2PartySubID, Nested2PartySubIDsGroupComp::new);
  }

  public LongRef noNested2PartySubIDs() {
    return countField;
  }

  public Nested2PartySubIDsGroupComp nested2PartySubIDsGroupComp(int ix) {
    return (Nested2PartySubIDsGroupComp) components[ix];
  }
}