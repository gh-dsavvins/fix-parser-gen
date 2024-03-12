package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class Nested2PartyIDsGroupComp extends AbstractGroupComponent {

  private final Nested2PartyID nested2PartyID;
  private final Nested2PartyIDSource nested2PartyIDSource;
  private final Nested2PartyRole nested2PartyRole;
  private final Nested2PartySubIDsGroup nested2PartySubIDsGroup;

  public Nested2PartyIDsGroupComp(AbstractMessage message) {
    super(message);
    nested2PartyID = new Nested2PartyID(message);
    nested2PartyIDSource = new Nested2PartyIDSource(message);
    nested2PartyRole = new Nested2PartyRole(message);
    nested2PartySubIDsGroup = new Nested2PartySubIDsGroup(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 757 -> nested2PartyID.map(version, bytes, fldBeg);
      case 758 -> nested2PartyIDSource.map(version, bytes, fldBeg);
      case 759 -> nested2PartyRole.map(version, bytes, fldBeg);
      case 806,807,760 -> 
          nested2PartySubIDsGroup.map(tag, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 757 -> nested2PartyID;
      case 758 -> nested2PartyIDSource;
      case 759 -> nested2PartyRole;
      case 806,807,760 -> 
          nested2PartySubIDsGroup.field(tag);
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = nested2PartyID.write(valBeg);
    valBeg = nested2PartyIDSource.write(valBeg);
    valBeg = nested2PartyRole.write(valBeg);
    valBeg = nested2PartySubIDsGroup.write(valBeg);
    return valBeg; 
  }
}