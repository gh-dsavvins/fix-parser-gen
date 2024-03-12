package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class ContraBrokersGroupComp extends AbstractGroupComponent {

  private final ContraBroker contraBroker;
  private final ContraTrader contraTrader;
  private final ContraTradeQty contraTradeQty;
  private final ContraTradeTime contraTradeTime;
  private final ContraLegRefID contraLegRefID;

  public ContraBrokersGroupComp(AbstractMessage message) {
    super(message);
    contraBroker = new ContraBroker(message);
    contraTrader = new ContraTrader(message);
    contraTradeQty = new ContraTradeQty(message);
    contraTradeTime = new ContraTradeTime(message);
    contraLegRefID = new ContraLegRefID(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 375 -> contraBroker.map(version, bytes, fldBeg);
      case 337 -> contraTrader.map(version, bytes, fldBeg);
      case 437 -> contraTradeQty.map(version, bytes, fldBeg);
      case 438 -> contraTradeTime.map(version, bytes, fldBeg);
      case 655 -> contraLegRefID.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 375 -> contraBroker;
      case 337 -> contraTrader;
      case 437 -> contraTradeQty;
      case 438 -> contraTradeTime;
      case 655 -> contraLegRefID;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = contraBroker.write(valBeg);
    valBeg = contraTrader.write(valBeg);
    valBeg = contraTradeQty.write(valBeg);
    valBeg = contraTradeTime.write(valBeg);
    valBeg = contraLegRefID.write(valBeg);
    return valBeg; 
  }
}