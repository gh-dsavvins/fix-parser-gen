package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class DlvyInstGroupComp extends AbstractGroupComponent {

  private final SettlInstSource settlInstSource;
  private final DlvyInstType dlvyInstType;
  private final SettlPartyIDsGroup settlPartyIDsGroup;

  public DlvyInstGroupComp(AbstractMessage message) {
    super(message);
    settlInstSource = new SettlInstSource(message);
    dlvyInstType = new DlvyInstType(message);
    settlPartyIDsGroup = new SettlPartyIDsGroup(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 165 -> settlInstSource.map(version, bytes, fldBeg);
      case 787 -> dlvyInstType.map(version, bytes, fldBeg);
      case 784,801,785,786,781,782,783 -> 
          settlPartyIDsGroup.map(tag, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 165 -> settlInstSource;
      case 787 -> dlvyInstType;
      case 784,801,785,786,781,782,783 -> 
          settlPartyIDsGroup.field(tag);
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = settlInstSource.write(valBeg);
    valBeg = dlvyInstType.write(valBeg);
    valBeg = settlPartyIDsGroup.write(valBeg);
    return valBeg; 
  }
}