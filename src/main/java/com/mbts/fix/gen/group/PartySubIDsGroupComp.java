package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class PartySubIDsGroupComp extends AbstractGroupComponent {

  private final PartySubID partySubID;
  private final PartySubIDType partySubIDType;

  public PartySubIDsGroupComp(AbstractMessage message) {
    super(message);
    partySubID = new PartySubID(message);
    partySubIDType = new PartySubIDType(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 523 -> partySubID.map(version, bytes, fldBeg);
      case 803 -> partySubIDType.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 523 -> partySubID;
      case 803 -> partySubIDType;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = partySubID.write(valBeg);
    valBeg = partySubIDType.write(valBeg);
    return valBeg; 
  }
}