package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class ClearingInstructionsGroupComp extends AbstractGroupComponent {

  private final ClearingInstruction clearingInstruction;

  public ClearingInstructionsGroupComp(AbstractMessage message) {
    super(message);
    clearingInstruction = new ClearingInstruction(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 577 -> clearingInstruction.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 577 -> clearingInstruction;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = clearingInstruction.write(valBeg);
    return valBeg; 
  }
}