package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class NestedPartyIDsGroup extends AbstractGroup {

  public NestedPartyIDsGroup(AbstractMessage message) {
    super(message, FixTag.noNestedPartyIDs, FixTag.nestedPartyID, NestedPartyIDsGroupComp::new);
  }

  public LongRef noNestedPartyIDs() {
    return countField;
  }

  public NestedPartyIDsGroupComp nestedPartyIDsGroupComp(int ix) {
    return (NestedPartyIDsGroupComp) components[ix];
  }
}