package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class HopsGroupComp extends AbstractGroupComponent {

  private final HopCompID hopCompID;
  private final HopSendingTime hopSendingTime;
  private final HopRefID hopRefID;

  public HopsGroupComp(AbstractMessage message) {
    super(message);
    hopCompID = new HopCompID(message);
    hopSendingTime = new HopSendingTime(message);
    hopRefID = new HopRefID(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 628 -> hopCompID.map(version, bytes, fldBeg);
      case 629 -> hopSendingTime.map(version, bytes, fldBeg);
      case 630 -> hopRefID.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 628 -> hopCompID;
      case 629 -> hopSendingTime;
      case 630 -> hopRefID;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = hopCompID.write(valBeg);
    valBeg = hopSendingTime.write(valBeg);
    valBeg = hopRefID.write(valBeg);
    return valBeg; 
  }
}