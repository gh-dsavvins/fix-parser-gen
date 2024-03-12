package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class PosAmtGroupComp extends AbstractGroupComponent {

  private final PosAmtType posAmtType;
  private final PosAmt posAmt;

  public PosAmtGroupComp(AbstractMessage message) {
    super(message);
    posAmtType = new PosAmtType(message);
    posAmt = new PosAmt(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 707 -> posAmtType.map(version, bytes, fldBeg);
      case 708 -> posAmt.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 707 -> posAmtType;
      case 708 -> posAmt;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = posAmtType.write(valBeg);
    valBeg = posAmt.write(valBeg);
    return valBeg; 
  }
}