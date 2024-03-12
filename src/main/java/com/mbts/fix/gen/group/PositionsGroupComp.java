package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class PositionsGroupComp extends AbstractGroupComponent {

  private final PosType posType;
  private final LongQty longQty;
  private final ShortQty shortQty;
  private final PosQtyStatus posQtyStatus;
  private final NestedPartyIDsGroup nestedPartyIDsGroup;

  public PositionsGroupComp(AbstractMessage message) {
    super(message);
    posType = new PosType(message);
    longQty = new LongQty(message);
    shortQty = new ShortQty(message);
    posQtyStatus = new PosQtyStatus(message);
    nestedPartyIDsGroup = new NestedPartyIDsGroup(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 703 -> posType.map(version, bytes, fldBeg);
      case 704 -> longQty.map(version, bytes, fldBeg);
      case 705 -> shortQty.map(version, bytes, fldBeg);
      case 706 -> posQtyStatus.map(version, bytes, fldBeg);
      case 545,804,805,538,539,524,525 -> 
          nestedPartyIDsGroup.map(tag, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 703 -> posType;
      case 704 -> longQty;
      case 705 -> shortQty;
      case 706 -> posQtyStatus;
      case 545,804,805,538,539,524,525 -> 
          nestedPartyIDsGroup.field(tag);
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = posType.write(valBeg);
    valBeg = longQty.write(valBeg);
    valBeg = shortQty.write(valBeg);
    valBeg = posQtyStatus.write(valBeg);
    valBeg = nestedPartyIDsGroup.write(valBeg);
    return valBeg; 
  }
}