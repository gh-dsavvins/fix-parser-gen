package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class MDEntriesGroupComp extends AbstractGroupComponent {

  private final MDEntryType mDEntryType;
  private final MDEntryPx mDEntryPx;
  private final Currency currency;
  private final MDEntrySize mDEntrySize;
  private final MDEntryDate mDEntryDate;
  private final MDEntryTime mDEntryTime;
  private final TickDirection tickDirection;
  private final MDMkt mDMkt;
  private final TradingSessionID tradingSessionID;
  private final TradingSessionSubID tradingSessionSubID;
  private final QuoteCondition quoteCondition;
  private final TradeCondition tradeCondition;
  private final MDEntryOriginator mDEntryOriginator;
  private final LocationID locationID;
  private final DeskID deskID;
  private final OpenCloseSettlFlag openCloseSettlFlag;
  private final TimeInForce timeInForce;
  private final ExpireDate expireDate;
  private final ExpireTime expireTime;
  private final MinQty minQty;
  private final ExecInst execInst;
  private final SellerDays sellerDays;
  private final OrderID orderID;
  private final QuoteEntryID quoteEntryID;
  private final MDEntryBuyer mDEntryBuyer;
  private final MDEntrySeller mDEntrySeller;
  private final NumberOfOrders numberOfOrders;
  private final MDEntryPositionNo mDEntryPositionNo;
  private final Scope scope;
  private final PriceDelta priceDelta;
  private final Text text;
  private final EncodedTextLen encodedTextLen;
  private final EncodedText encodedText;

  public MDEntriesGroupComp(AbstractMessage message) {
    super(message);
    mDEntryType = new MDEntryType(message);
    mDEntryPx = new MDEntryPx(message);
    currency = new Currency(message);
    mDEntrySize = new MDEntrySize(message);
    mDEntryDate = new MDEntryDate(message);
    mDEntryTime = new MDEntryTime(message);
    tickDirection = new TickDirection(message);
    mDMkt = new MDMkt(message);
    tradingSessionID = new TradingSessionID(message);
    tradingSessionSubID = new TradingSessionSubID(message);
    quoteCondition = new QuoteCondition(message);
    tradeCondition = new TradeCondition(message);
    mDEntryOriginator = new MDEntryOriginator(message);
    locationID = new LocationID(message);
    deskID = new DeskID(message);
    openCloseSettlFlag = new OpenCloseSettlFlag(message);
    timeInForce = new TimeInForce(message);
    expireDate = new ExpireDate(message);
    expireTime = new ExpireTime(message);
    minQty = new MinQty(message);
    execInst = new ExecInst(message);
    sellerDays = new SellerDays(message);
    orderID = new OrderID(message);
    quoteEntryID = new QuoteEntryID(message);
    mDEntryBuyer = new MDEntryBuyer(message);
    mDEntrySeller = new MDEntrySeller(message);
    numberOfOrders = new NumberOfOrders(message);
    mDEntryPositionNo = new MDEntryPositionNo(message);
    scope = new Scope(message);
    priceDelta = new PriceDelta(message);
    text = new Text(message);
    encodedTextLen = new EncodedTextLen(message);
    encodedText = new EncodedText(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 269 -> mDEntryType.map(version, bytes, fldBeg);
      case 270 -> mDEntryPx.map(version, bytes, fldBeg);
      case 15 -> currency.map(version, bytes, fldBeg);
      case 271 -> mDEntrySize.map(version, bytes, fldBeg);
      case 272 -> mDEntryDate.map(version, bytes, fldBeg);
      case 273 -> mDEntryTime.map(version, bytes, fldBeg);
      case 274 -> tickDirection.map(version, bytes, fldBeg);
      case 275 -> mDMkt.map(version, bytes, fldBeg);
      case 336 -> tradingSessionID.map(version, bytes, fldBeg);
      case 625 -> tradingSessionSubID.map(version, bytes, fldBeg);
      case 276 -> quoteCondition.map(version, bytes, fldBeg);
      case 277 -> tradeCondition.map(version, bytes, fldBeg);
      case 282 -> mDEntryOriginator.map(version, bytes, fldBeg);
      case 283 -> locationID.map(version, bytes, fldBeg);
      case 284 -> deskID.map(version, bytes, fldBeg);
      case 286 -> openCloseSettlFlag.map(version, bytes, fldBeg);
      case 59 -> timeInForce.map(version, bytes, fldBeg);
      case 432 -> expireDate.map(version, bytes, fldBeg);
      case 126 -> expireTime.map(version, bytes, fldBeg);
      case 110 -> minQty.map(version, bytes, fldBeg);
      case 18 -> execInst.map(version, bytes, fldBeg);
      case 287 -> sellerDays.map(version, bytes, fldBeg);
      case 37 -> orderID.map(version, bytes, fldBeg);
      case 299 -> quoteEntryID.map(version, bytes, fldBeg);
      case 288 -> mDEntryBuyer.map(version, bytes, fldBeg);
      case 289 -> mDEntrySeller.map(version, bytes, fldBeg);
      case 346 -> numberOfOrders.map(version, bytes, fldBeg);
      case 290 -> mDEntryPositionNo.map(version, bytes, fldBeg);
      case 546 -> scope.map(version, bytes, fldBeg);
      case 811 -> priceDelta.map(version, bytes, fldBeg);
      case 58 -> text.map(version, bytes, fldBeg);
      case 354 -> encodedTextLen.map(version, bytes, fldBeg);
      case 355 -> encodedText.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 269 -> mDEntryType;
      case 270 -> mDEntryPx;
      case 15 -> currency;
      case 271 -> mDEntrySize;
      case 272 -> mDEntryDate;
      case 273 -> mDEntryTime;
      case 274 -> tickDirection;
      case 275 -> mDMkt;
      case 336 -> tradingSessionID;
      case 625 -> tradingSessionSubID;
      case 276 -> quoteCondition;
      case 277 -> tradeCondition;
      case 282 -> mDEntryOriginator;
      case 283 -> locationID;
      case 284 -> deskID;
      case 286 -> openCloseSettlFlag;
      case 59 -> timeInForce;
      case 432 -> expireDate;
      case 126 -> expireTime;
      case 110 -> minQty;
      case 18 -> execInst;
      case 287 -> sellerDays;
      case 37 -> orderID;
      case 299 -> quoteEntryID;
      case 288 -> mDEntryBuyer;
      case 289 -> mDEntrySeller;
      case 346 -> numberOfOrders;
      case 290 -> mDEntryPositionNo;
      case 546 -> scope;
      case 811 -> priceDelta;
      case 58 -> text;
      case 354 -> encodedTextLen;
      case 355 -> encodedText;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = mDEntryType.write(valBeg);
    valBeg = mDEntryPx.write(valBeg);
    valBeg = currency.write(valBeg);
    valBeg = mDEntrySize.write(valBeg);
    valBeg = mDEntryDate.write(valBeg);
    valBeg = mDEntryTime.write(valBeg);
    valBeg = tickDirection.write(valBeg);
    valBeg = mDMkt.write(valBeg);
    valBeg = tradingSessionID.write(valBeg);
    valBeg = tradingSessionSubID.write(valBeg);
    valBeg = quoteCondition.write(valBeg);
    valBeg = tradeCondition.write(valBeg);
    valBeg = mDEntryOriginator.write(valBeg);
    valBeg = locationID.write(valBeg);
    valBeg = deskID.write(valBeg);
    valBeg = openCloseSettlFlag.write(valBeg);
    valBeg = timeInForce.write(valBeg);
    valBeg = expireDate.write(valBeg);
    valBeg = expireTime.write(valBeg);
    valBeg = minQty.write(valBeg);
    valBeg = execInst.write(valBeg);
    valBeg = sellerDays.write(valBeg);
    valBeg = orderID.write(valBeg);
    valBeg = quoteEntryID.write(valBeg);
    valBeg = mDEntryBuyer.write(valBeg);
    valBeg = mDEntrySeller.write(valBeg);
    valBeg = numberOfOrders.write(valBeg);
    valBeg = mDEntryPositionNo.write(valBeg);
    valBeg = scope.write(valBeg);
    valBeg = priceDelta.write(valBeg);
    valBeg = text.write(valBeg);
    valBeg = encodedTextLen.write(valBeg);
    valBeg = encodedText.write(valBeg);
    return valBeg; 
  }
}