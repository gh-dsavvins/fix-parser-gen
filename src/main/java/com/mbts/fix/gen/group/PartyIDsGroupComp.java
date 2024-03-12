package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class PartyIDsGroupComp extends AbstractGroupComponent {

  private final PartyID partyID;
  private final PartyIDSource partyIDSource;
  private final PartyRole partyRole;
  private final PartySubIDsGroup partySubIDsGroup;

  public PartyIDsGroupComp(AbstractMessage message) {
    super(message);
    partyID = new PartyID(message);
    partyIDSource = new PartyIDSource(message);
    partyRole = new PartyRole(message);
    partySubIDsGroup = new PartySubIDsGroup(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 448 -> partyID.map(version, bytes, fldBeg);
      case 447 -> partyIDSource.map(version, bytes, fldBeg);
      case 452 -> partyRole.map(version, bytes, fldBeg);
      case 802,803,523 -> 
          partySubIDsGroup.map(tag, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 448 -> partyID;
      case 447 -> partyIDSource;
      case 452 -> partyRole;
      case 802,803,523 -> 
          partySubIDsGroup.field(tag);
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = partyID.write(valBeg);
    valBeg = partyIDSource.write(valBeg);
    valBeg = partyRole.write(valBeg);
    valBeg = partySubIDsGroup.write(valBeg);
    return valBeg; 
  }
}