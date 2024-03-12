package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class ExecsGroupComp extends AbstractGroupComponent {

  private final LastQty lastQty;
  private final ExecID execID;
  private final SecondaryExecID secondaryExecID;
  private final LastPx lastPx;
  private final LastParPx lastParPx;
  private final LastCapacity lastCapacity;

  public ExecsGroupComp(AbstractMessage message) {
    super(message);
    lastQty = new LastQty(message);
    execID = new ExecID(message);
    secondaryExecID = new SecondaryExecID(message);
    lastPx = new LastPx(message);
    lastParPx = new LastParPx(message);
    lastCapacity = new LastCapacity(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 32 -> lastQty.map(version, bytes, fldBeg);
      case 17 -> execID.map(version, bytes, fldBeg);
      case 527 -> secondaryExecID.map(version, bytes, fldBeg);
      case 31 -> lastPx.map(version, bytes, fldBeg);
      case 669 -> lastParPx.map(version, bytes, fldBeg);
      case 29 -> lastCapacity.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 32 -> lastQty;
      case 17 -> execID;
      case 527 -> secondaryExecID;
      case 31 -> lastPx;
      case 669 -> lastParPx;
      case 29 -> lastCapacity;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = lastQty.write(valBeg);
    valBeg = execID.write(valBeg);
    valBeg = secondaryExecID.write(valBeg);
    valBeg = lastPx.write(valBeg);
    valBeg = lastParPx.write(valBeg);
    valBeg = lastCapacity.write(valBeg);
    return valBeg; 
  }
}