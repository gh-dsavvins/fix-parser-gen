package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class AffectedOrdersGroupComp extends AbstractGroupComponent {

  private final OrigClOrdID origClOrdID;
  private final AffectedOrderID affectedOrderID;
  private final AffectedSecondaryOrderID affectedSecondaryOrderID;

  public AffectedOrdersGroupComp(AbstractMessage message) {
    super(message);
    origClOrdID = new OrigClOrdID(message);
    affectedOrderID = new AffectedOrderID(message);
    affectedSecondaryOrderID = new AffectedSecondaryOrderID(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 41 -> origClOrdID.map(version, bytes, fldBeg);
      case 535 -> affectedOrderID.map(version, bytes, fldBeg);
      case 536 -> affectedSecondaryOrderID.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 41 -> origClOrdID;
      case 535 -> affectedOrderID;
      case 536 -> affectedSecondaryOrderID;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = origClOrdID.write(valBeg);
    valBeg = affectedOrderID.write(valBeg);
    valBeg = affectedSecondaryOrderID.write(valBeg);
    return valBeg; 
  }
}