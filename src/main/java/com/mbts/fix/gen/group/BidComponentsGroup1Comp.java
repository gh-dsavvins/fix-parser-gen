package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class BidComponentsGroup1Comp extends AbstractGroupComponent {

  private final Commission commission;
  private final CommType commType;
  private final CommCurrency commCurrency;
  private final FundRenewWaiv fundRenewWaiv;
  private final ListID listID;
  private final Country country;
  private final Side side;
  private final Price price;
  private final PriceType priceType;
  private final FairValue fairValue;
  private final NetGrossInd netGrossInd;
  private final SettlType settlType;
  private final SettlDate settlDate;
  private final TradingSessionID tradingSessionID;
  private final TradingSessionSubID tradingSessionSubID;
  private final Text text;
  private final EncodedTextLen encodedTextLen;
  private final EncodedText encodedText;

  public BidComponentsGroup1Comp(AbstractMessage message) {
    super(message);
    commission = new Commission(message);
    commType = new CommType(message);
    commCurrency = new CommCurrency(message);
    fundRenewWaiv = new FundRenewWaiv(message);
    listID = new ListID(message);
    country = new Country(message);
    side = new Side(message);
    price = new Price(message);
    priceType = new PriceType(message);
    fairValue = new FairValue(message);
    netGrossInd = new NetGrossInd(message);
    settlType = new SettlType(message);
    settlDate = new SettlDate(message);
    tradingSessionID = new TradingSessionID(message);
    tradingSessionSubID = new TradingSessionSubID(message);
    text = new Text(message);
    encodedTextLen = new EncodedTextLen(message);
    encodedText = new EncodedText(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 12 -> commission.map(version, bytes, fldBeg);
      case 13 -> commType.map(version, bytes, fldBeg);
      case 479 -> commCurrency.map(version, bytes, fldBeg);
      case 497 -> fundRenewWaiv.map(version, bytes, fldBeg);
      case 66 -> listID.map(version, bytes, fldBeg);
      case 421 -> country.map(version, bytes, fldBeg);
      case 54 -> side.map(version, bytes, fldBeg);
      case 44 -> price.map(version, bytes, fldBeg);
      case 423 -> priceType.map(version, bytes, fldBeg);
      case 406 -> fairValue.map(version, bytes, fldBeg);
      case 430 -> netGrossInd.map(version, bytes, fldBeg);
      case 63 -> settlType.map(version, bytes, fldBeg);
      case 64 -> settlDate.map(version, bytes, fldBeg);
      case 336 -> tradingSessionID.map(version, bytes, fldBeg);
      case 625 -> tradingSessionSubID.map(version, bytes, fldBeg);
      case 58 -> text.map(version, bytes, fldBeg);
      case 354 -> encodedTextLen.map(version, bytes, fldBeg);
      case 355 -> encodedText.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 12 -> commission;
      case 13 -> commType;
      case 479 -> commCurrency;
      case 497 -> fundRenewWaiv;
      case 66 -> listID;
      case 421 -> country;
      case 54 -> side;
      case 44 -> price;
      case 423 -> priceType;
      case 406 -> fairValue;
      case 430 -> netGrossInd;
      case 63 -> settlType;
      case 64 -> settlDate;
      case 336 -> tradingSessionID;
      case 625 -> tradingSessionSubID;
      case 58 -> text;
      case 354 -> encodedTextLen;
      case 355 -> encodedText;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = commission.write(valBeg);
    valBeg = commType.write(valBeg);
    valBeg = commCurrency.write(valBeg);
    valBeg = fundRenewWaiv.write(valBeg);
    valBeg = listID.write(valBeg);
    valBeg = country.write(valBeg);
    valBeg = side.write(valBeg);
    valBeg = price.write(valBeg);
    valBeg = priceType.write(valBeg);
    valBeg = fairValue.write(valBeg);
    valBeg = netGrossInd.write(valBeg);
    valBeg = settlType.write(valBeg);
    valBeg = settlDate.write(valBeg);
    valBeg = tradingSessionID.write(valBeg);
    valBeg = tradingSessionSubID.write(valBeg);
    valBeg = text.write(valBeg);
    valBeg = encodedTextLen.write(valBeg);
    valBeg = encodedText.write(valBeg);
    return valBeg; 
  }
}