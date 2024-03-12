package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class NestedPartyIDsGroupComp extends AbstractGroupComponent {

  private final NestedPartyID nestedPartyID;
  private final NestedPartyIDSource nestedPartyIDSource;
  private final NestedPartyRole nestedPartyRole;
  private final NestedPartySubIDsGroup nestedPartySubIDsGroup;

  public NestedPartyIDsGroupComp(AbstractMessage message) {
    super(message);
    nestedPartyID = new NestedPartyID(message);
    nestedPartyIDSource = new NestedPartyIDSource(message);
    nestedPartyRole = new NestedPartyRole(message);
    nestedPartySubIDsGroup = new NestedPartySubIDsGroup(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 524 -> nestedPartyID.map(version, bytes, fldBeg);
      case 525 -> nestedPartyIDSource.map(version, bytes, fldBeg);
      case 538 -> nestedPartyRole.map(version, bytes, fldBeg);
      case 545,804,805 -> 
          nestedPartySubIDsGroup.map(tag, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 524 -> nestedPartyID;
      case 525 -> nestedPartyIDSource;
      case 538 -> nestedPartyRole;
      case 545,804,805 -> 
          nestedPartySubIDsGroup.field(tag);
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = nestedPartyID.write(valBeg);
    valBeg = nestedPartyIDSource.write(valBeg);
    valBeg = nestedPartyRole.write(valBeg);
    valBeg = nestedPartySubIDsGroup.write(valBeg);
    return valBeg; 
  }
}