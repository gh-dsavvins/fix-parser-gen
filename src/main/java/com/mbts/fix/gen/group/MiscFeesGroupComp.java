package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class MiscFeesGroupComp extends AbstractGroupComponent {

  private final MiscFeeAmt miscFeeAmt;
  private final MiscFeeCurr miscFeeCurr;
  private final MiscFeeType miscFeeType;
  private final MiscFeeBasis miscFeeBasis;

  public MiscFeesGroupComp(AbstractMessage message) {
    super(message);
    miscFeeAmt = new MiscFeeAmt(message);
    miscFeeCurr = new MiscFeeCurr(message);
    miscFeeType = new MiscFeeType(message);
    miscFeeBasis = new MiscFeeBasis(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 137 -> miscFeeAmt.map(version, bytes, fldBeg);
      case 138 -> miscFeeCurr.map(version, bytes, fldBeg);
      case 139 -> miscFeeType.map(version, bytes, fldBeg);
      case 891 -> miscFeeBasis.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 137 -> miscFeeAmt;
      case 138 -> miscFeeCurr;
      case 139 -> miscFeeType;
      case 891 -> miscFeeBasis;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = miscFeeAmt.write(valBeg);
    valBeg = miscFeeCurr.write(valBeg);
    valBeg = miscFeeType.write(valBeg);
    valBeg = miscFeeBasis.write(valBeg);
    return valBeg; 
  }
}