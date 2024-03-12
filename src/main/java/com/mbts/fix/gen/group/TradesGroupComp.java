package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class TradesGroupComp extends AbstractGroupComponent {

  private final TradeReportID tradeReportID;
  private final SecondaryTradeReportID secondaryTradeReportID;

  public TradesGroupComp(AbstractMessage message) {
    super(message);
    tradeReportID = new TradeReportID(message);
    secondaryTradeReportID = new SecondaryTradeReportID(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 571 -> tradeReportID.map(version, bytes, fldBeg);
      case 818 -> secondaryTradeReportID.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 571 -> tradeReportID;
      case 818 -> secondaryTradeReportID;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = tradeReportID.write(valBeg);
    valBeg = secondaryTradeReportID.write(valBeg);
    return valBeg; 
  }
}