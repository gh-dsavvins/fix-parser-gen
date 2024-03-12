package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class InstrAttribGroupComp extends AbstractGroupComponent {

  private final InstrAttribType instrAttribType;
  private final InstrAttribValue instrAttribValue;

  public InstrAttribGroupComp(AbstractMessage message) {
    super(message);
    instrAttribType = new InstrAttribType(message);
    instrAttribValue = new InstrAttribValue(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 871 -> instrAttribType.map(version, bytes, fldBeg);
      case 872 -> instrAttribValue.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 871 -> instrAttribType;
      case 872 -> instrAttribValue;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = instrAttribType.write(valBeg);
    valBeg = instrAttribValue.write(valBeg);
    return valBeg; 
  }
}