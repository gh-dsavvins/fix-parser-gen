package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class TradingSessionsGroupComp extends AbstractGroupComponent {

  private final TradingSessionID tradingSessionID;
  private final TradingSessionSubID tradingSessionSubID;

  public TradingSessionsGroupComp(AbstractMessage message) {
    super(message);
    tradingSessionID = new TradingSessionID(message);
    tradingSessionSubID = new TradingSessionSubID(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 336 -> tradingSessionID.map(version, bytes, fldBeg);
      case 625 -> tradingSessionSubID.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 336 -> tradingSessionID;
      case 625 -> tradingSessionSubID;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = tradingSessionID.write(valBeg);
    valBeg = tradingSessionSubID.write(valBeg);
    return valBeg; 
  }
}