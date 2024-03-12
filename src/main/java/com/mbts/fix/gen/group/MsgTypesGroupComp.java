package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class MsgTypesGroupComp extends AbstractGroupComponent {

  private final RefMsgType refMsgType;
  private final MsgDirection msgDirection;

  public MsgTypesGroupComp(AbstractMessage message) {
    super(message);
    refMsgType = new RefMsgType(message);
    msgDirection = new MsgDirection(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 372 -> refMsgType.map(version, bytes, fldBeg);
      case 385 -> msgDirection.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 372 -> refMsgType;
      case 385 -> msgDirection;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = refMsgType.write(valBeg);
    valBeg = msgDirection.write(valBeg);
    return valBeg; 
  }
}