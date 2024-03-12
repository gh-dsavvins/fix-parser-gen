package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class SidesGroup1Comp extends AbstractGroupComponent {

  private final Side side;
  private final OrigClOrdID origClOrdID;
  private final ClOrdID clOrdID;
  private final SecondaryClOrdID secondaryClOrdID;
  private final ClOrdLinkID clOrdLinkID;
  private final OrigOrdModTime origOrdModTime;
  private final PartyIDsGroup partyIDsGroup;
  private final TradeOriginationDate tradeOriginationDate;
  private final TradeDate tradeDate;
  private final OrderQty orderQty;
  private final CashOrderQty cashOrderQty;
  private final OrderPercent orderPercent;
  private final RoundingDirection roundingDirection;
  private final RoundingModulus roundingModulus;
  private final ComplianceID complianceID;
  private final Text text;
  private final EncodedTextLen encodedTextLen;
  private final EncodedText encodedText;

  public SidesGroup1Comp(AbstractMessage message) {
    super(message);
    side = new Side(message);
    origClOrdID = new OrigClOrdID(message);
    clOrdID = new ClOrdID(message);
    secondaryClOrdID = new SecondaryClOrdID(message);
    clOrdLinkID = new ClOrdLinkID(message);
    origOrdModTime = new OrigOrdModTime(message);
    partyIDsGroup = new PartyIDsGroup(message);
    tradeOriginationDate = new TradeOriginationDate(message);
    tradeDate = new TradeDate(message);
    orderQty = new OrderQty(message);
    cashOrderQty = new CashOrderQty(message);
    orderPercent = new OrderPercent(message);
    roundingDirection = new RoundingDirection(message);
    roundingModulus = new RoundingModulus(message);
    complianceID = new ComplianceID(message);
    text = new Text(message);
    encodedTextLen = new EncodedTextLen(message);
    encodedText = new EncodedText(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 54 -> side.map(version, bytes, fldBeg);
      case 41 -> origClOrdID.map(version, bytes, fldBeg);
      case 11 -> clOrdID.map(version, bytes, fldBeg);
      case 526 -> secondaryClOrdID.map(version, bytes, fldBeg);
      case 583 -> clOrdLinkID.map(version, bytes, fldBeg);
      case 586 -> origOrdModTime.map(version, bytes, fldBeg);
      case 448,802,803,452,453,523,447 -> 
          partyIDsGroup.map(tag, fldBeg);
      case 229 -> tradeOriginationDate.map(version, bytes, fldBeg);
      case 75 -> tradeDate.map(version, bytes, fldBeg);
      case 38 -> orderQty.map(version, bytes, fldBeg);
      case 152 -> cashOrderQty.map(version, bytes, fldBeg);
      case 516 -> orderPercent.map(version, bytes, fldBeg);
      case 468 -> roundingDirection.map(version, bytes, fldBeg);
      case 469 -> roundingModulus.map(version, bytes, fldBeg);
      case 376 -> complianceID.map(version, bytes, fldBeg);
      case 58 -> text.map(version, bytes, fldBeg);
      case 354 -> encodedTextLen.map(version, bytes, fldBeg);
      case 355 -> encodedText.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 54 -> side;
      case 41 -> origClOrdID;
      case 11 -> clOrdID;
      case 526 -> secondaryClOrdID;
      case 583 -> clOrdLinkID;
      case 586 -> origOrdModTime;
      case 448,802,803,452,453,523,447 -> 
          partyIDsGroup.field(tag);
      case 229 -> tradeOriginationDate;
      case 75 -> tradeDate;
      case 38 -> orderQty;
      case 152 -> cashOrderQty;
      case 516 -> orderPercent;
      case 468 -> roundingDirection;
      case 469 -> roundingModulus;
      case 376 -> complianceID;
      case 58 -> text;
      case 354 -> encodedTextLen;
      case 355 -> encodedText;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = side.write(valBeg);
    valBeg = origClOrdID.write(valBeg);
    valBeg = clOrdID.write(valBeg);
    valBeg = secondaryClOrdID.write(valBeg);
    valBeg = clOrdLinkID.write(valBeg);
    valBeg = origOrdModTime.write(valBeg);
    valBeg = partyIDsGroup.write(valBeg);
    valBeg = tradeOriginationDate.write(valBeg);
    valBeg = tradeDate.write(valBeg);
    valBeg = orderQty.write(valBeg);
    valBeg = cashOrderQty.write(valBeg);
    valBeg = orderPercent.write(valBeg);
    valBeg = roundingDirection.write(valBeg);
    valBeg = roundingModulus.write(valBeg);
    valBeg = complianceID.write(valBeg);
    valBeg = text.write(valBeg);
    valBeg = encodedTextLen.write(valBeg);
    valBeg = encodedText.write(valBeg);
    return valBeg; 
  }
}