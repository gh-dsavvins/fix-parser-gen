package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class Nested3PartyIDsGroupComp extends AbstractGroupComponent {

  private final Nested3PartyID nested3PartyID;
  private final Nested3PartyIDSource nested3PartyIDSource;
  private final Nested3PartyRole nested3PartyRole;
  private final Nested3PartySubIDsGroup nested3PartySubIDsGroup;

  public Nested3PartyIDsGroupComp(AbstractMessage message) {
    super(message);
    nested3PartyID = new Nested3PartyID(message);
    nested3PartyIDSource = new Nested3PartyIDSource(message);
    nested3PartyRole = new Nested3PartyRole(message);
    nested3PartySubIDsGroup = new Nested3PartySubIDsGroup(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 949 -> nested3PartyID.map(version, bytes, fldBeg);
      case 950 -> nested3PartyIDSource.map(version, bytes, fldBeg);
      case 951 -> nested3PartyRole.map(version, bytes, fldBeg);
      case 952,953,954 -> 
          nested3PartySubIDsGroup.map(tag, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 949 -> nested3PartyID;
      case 950 -> nested3PartyIDSource;
      case 951 -> nested3PartyRole;
      case 952,953,954 -> 
          nested3PartySubIDsGroup.field(tag);
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = nested3PartyID.write(valBeg);
    valBeg = nested3PartyIDSource.write(valBeg);
    valBeg = nested3PartyRole.write(valBeg);
    valBeg = nested3PartySubIDsGroup.write(valBeg);
    return valBeg; 
  }
}