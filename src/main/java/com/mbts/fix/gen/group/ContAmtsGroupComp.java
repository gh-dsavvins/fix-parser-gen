package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class ContAmtsGroupComp extends AbstractGroupComponent {

  private final ContAmtType contAmtType;
  private final ContAmtValue contAmtValue;
  private final ContAmtCurr contAmtCurr;

  public ContAmtsGroupComp(AbstractMessage message) {
    super(message);
    contAmtType = new ContAmtType(message);
    contAmtValue = new ContAmtValue(message);
    contAmtCurr = new ContAmtCurr(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 519 -> contAmtType.map(version, bytes, fldBeg);
      case 520 -> contAmtValue.map(version, bytes, fldBeg);
      case 521 -> contAmtCurr.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 519 -> contAmtType;
      case 520 -> contAmtValue;
      case 521 -> contAmtCurr;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = contAmtType.write(valBeg);
    valBeg = contAmtValue.write(valBeg);
    valBeg = contAmtCurr.write(valBeg);
    return valBeg; 
  }
}