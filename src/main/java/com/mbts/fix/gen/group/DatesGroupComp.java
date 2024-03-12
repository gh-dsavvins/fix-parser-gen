package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class DatesGroupComp extends AbstractGroupComponent {

  private final TradeDate tradeDate;
  private final TransactTime transactTime;

  public DatesGroupComp(AbstractMessage message) {
    super(message);
    tradeDate = new TradeDate(message);
    transactTime = new TransactTime(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 75 -> tradeDate.map(version, bytes, fldBeg);
      case 60 -> transactTime.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 75 -> tradeDate;
      case 60 -> transactTime;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = tradeDate.write(valBeg);
    valBeg = transactTime.write(valBeg);
    return valBeg; 
  }
}