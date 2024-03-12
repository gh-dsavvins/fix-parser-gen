package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class NestedPartySubIDsGroup extends AbstractGroup {

  public NestedPartySubIDsGroup(AbstractMessage message) {
    super(message, FixTag.noNestedPartySubIDs, FixTag.nestedPartySubID, NestedPartySubIDsGroupComp::new);
  }

  public LongRef noNestedPartySubIDs() {
    return countField;
  }

  public NestedPartySubIDsGroupComp nestedPartySubIDsGroupComp(int ix) {
    return (NestedPartySubIDsGroupComp) components[ix];
  }
}