package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class SettlPartySubIDsGroupComp extends AbstractGroupComponent {

  private final SettlPartySubID settlPartySubID;
  private final SettlPartySubIDType settlPartySubIDType;

  public SettlPartySubIDsGroupComp(AbstractMessage message) {
    super(message);
    settlPartySubID = new SettlPartySubID(message);
    settlPartySubIDType = new SettlPartySubIDType(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 785 -> settlPartySubID.map(version, bytes, fldBeg);
      case 786 -> settlPartySubIDType.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 785 -> settlPartySubID;
      case 786 -> settlPartySubIDType;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = settlPartySubID.write(valBeg);
    valBeg = settlPartySubIDType.write(valBeg);
    return valBeg; 
  }
}