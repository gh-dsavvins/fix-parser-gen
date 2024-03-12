package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class BidComponentsGroupComp extends AbstractGroupComponent {

  private final ListID listID;
  private final Side side;
  private final TradingSessionID tradingSessionID;
  private final TradingSessionSubID tradingSessionSubID;
  private final NetGrossInd netGrossInd;
  private final SettlType settlType;
  private final SettlDate settlDate;
  private final Account account;
  private final AcctIDSource acctIDSource;

  public BidComponentsGroupComp(AbstractMessage message) {
    super(message);
    listID = new ListID(message);
    side = new Side(message);
    tradingSessionID = new TradingSessionID(message);
    tradingSessionSubID = new TradingSessionSubID(message);
    netGrossInd = new NetGrossInd(message);
    settlType = new SettlType(message);
    settlDate = new SettlDate(message);
    account = new Account(message);
    acctIDSource = new AcctIDSource(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 66 -> listID.map(version, bytes, fldBeg);
      case 54 -> side.map(version, bytes, fldBeg);
      case 336 -> tradingSessionID.map(version, bytes, fldBeg);
      case 625 -> tradingSessionSubID.map(version, bytes, fldBeg);
      case 430 -> netGrossInd.map(version, bytes, fldBeg);
      case 63 -> settlType.map(version, bytes, fldBeg);
      case 64 -> settlDate.map(version, bytes, fldBeg);
      case 1 -> account.map(version, bytes, fldBeg);
      case 660 -> acctIDSource.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 66 -> listID;
      case 54 -> side;
      case 336 -> tradingSessionID;
      case 625 -> tradingSessionSubID;
      case 430 -> netGrossInd;
      case 63 -> settlType;
      case 64 -> settlDate;
      case 1 -> account;
      case 660 -> acctIDSource;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = listID.write(valBeg);
    valBeg = side.write(valBeg);
    valBeg = tradingSessionID.write(valBeg);
    valBeg = tradingSessionSubID.write(valBeg);
    valBeg = netGrossInd.write(valBeg);
    valBeg = settlType.write(valBeg);
    valBeg = settlDate.write(valBeg);
    valBeg = account.write(valBeg);
    valBeg = acctIDSource.write(valBeg);
    return valBeg; 
  }
}