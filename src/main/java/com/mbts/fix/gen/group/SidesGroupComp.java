package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class SidesGroupComp extends AbstractGroupComponent {

  private final Side side;
  private final ClOrdID clOrdID;
  private final SecondaryClOrdID secondaryClOrdID;
  private final ClOrdLinkID clOrdLinkID;
  private final PartyIDsGroup partyIDsGroup;
  private final TradeOriginationDate tradeOriginationDate;
  private final TradeDate tradeDate;
  private final Account account;
  private final AcctIDSource acctIDSource;
  private final AccountType accountType;
  private final DayBookingInst dayBookingInst;
  private final BookingUnit bookingUnit;
  private final PreallocMethod preallocMethod;
  private final AllocID allocID;
  private final AllocsGroup allocsGroup;
  private final QtyType qtyType;
  private final OrderQty orderQty;
  private final CashOrderQty cashOrderQty;
  private final OrderPercent orderPercent;
  private final RoundingDirection roundingDirection;
  private final RoundingModulus roundingModulus;
  private final Commission commission;
  private final CommType commType;
  private final CommCurrency commCurrency;
  private final FundRenewWaiv fundRenewWaiv;
  private final OrderCapacity orderCapacity;
  private final OrderRestrictions orderRestrictions;
  private final CustOrderCapacity custOrderCapacity;
  private final ForexReq forexReq;
  private final SettlCurrency settlCurrency;
  private final BookingType bookingType;
  private final Text text;
  private final EncodedTextLen encodedTextLen;
  private final EncodedText encodedText;
  private final PositionEffect positionEffect;
  private final CoveredOrUncovered coveredOrUncovered;
  private final CashMargin cashMargin;
  private final ClearingFeeIndicator clearingFeeIndicator;
  private final SolicitedFlag solicitedFlag;
  private final SideComplianceID sideComplianceID;

  public SidesGroupComp(AbstractMessage message) {
    super(message);
    side = new Side(message);
    clOrdID = new ClOrdID(message);
    secondaryClOrdID = new SecondaryClOrdID(message);
    clOrdLinkID = new ClOrdLinkID(message);
    partyIDsGroup = new PartyIDsGroup(message);
    tradeOriginationDate = new TradeOriginationDate(message);
    tradeDate = new TradeDate(message);
    account = new Account(message);
    acctIDSource = new AcctIDSource(message);
    accountType = new AccountType(message);
    dayBookingInst = new DayBookingInst(message);
    bookingUnit = new BookingUnit(message);
    preallocMethod = new PreallocMethod(message);
    allocID = new AllocID(message);
    allocsGroup = new AllocsGroup(message);
    qtyType = new QtyType(message);
    orderQty = new OrderQty(message);
    cashOrderQty = new CashOrderQty(message);
    orderPercent = new OrderPercent(message);
    roundingDirection = new RoundingDirection(message);
    roundingModulus = new RoundingModulus(message);
    commission = new Commission(message);
    commType = new CommType(message);
    commCurrency = new CommCurrency(message);
    fundRenewWaiv = new FundRenewWaiv(message);
    orderCapacity = new OrderCapacity(message);
    orderRestrictions = new OrderRestrictions(message);
    custOrderCapacity = new CustOrderCapacity(message);
    forexReq = new ForexReq(message);
    settlCurrency = new SettlCurrency(message);
    bookingType = new BookingType(message);
    text = new Text(message);
    encodedTextLen = new EncodedTextLen(message);
    encodedText = new EncodedText(message);
    positionEffect = new PositionEffect(message);
    coveredOrUncovered = new CoveredOrUncovered(message);
    cashMargin = new CashMargin(message);
    clearingFeeIndicator = new ClearingFeeIndicator(message);
    solicitedFlag = new SolicitedFlag(message);
    sideComplianceID = new SideComplianceID(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 54 -> side.map(version, bytes, fldBeg);
      case 11 -> clOrdID.map(version, bytes, fldBeg);
      case 526 -> secondaryClOrdID.map(version, bytes, fldBeg);
      case 583 -> clOrdLinkID.map(version, bytes, fldBeg);
      case 448,802,803,452,453,523,447 -> 
          partyIDsGroup.map(tag, fldBeg);
      case 229 -> tradeOriginationDate.map(version, bytes, fldBeg);
      case 75 -> tradeDate.map(version, bytes, fldBeg);
      case 1 -> account.map(version, bytes, fldBeg);
      case 660 -> acctIDSource.map(version, bytes, fldBeg);
      case 581 -> accountType.map(version, bytes, fldBeg);
      case 589 -> dayBookingInst.map(version, bytes, fldBeg);
      case 590 -> bookingUnit.map(version, bytes, fldBeg);
      case 591 -> preallocMethod.map(version, bytes, fldBeg);
      case 70 -> allocID.map(version, bytes, fldBeg);
      case 736,545,804,805,524,525,78,79,80,467,661,538,539 -> 
          allocsGroup.map(tag, fldBeg);
      case 854 -> qtyType.map(version, bytes, fldBeg);
      case 38 -> orderQty.map(version, bytes, fldBeg);
      case 152 -> cashOrderQty.map(version, bytes, fldBeg);
      case 516 -> orderPercent.map(version, bytes, fldBeg);
      case 468 -> roundingDirection.map(version, bytes, fldBeg);
      case 469 -> roundingModulus.map(version, bytes, fldBeg);
      case 12 -> commission.map(version, bytes, fldBeg);
      case 13 -> commType.map(version, bytes, fldBeg);
      case 479 -> commCurrency.map(version, bytes, fldBeg);
      case 497 -> fundRenewWaiv.map(version, bytes, fldBeg);
      case 528 -> orderCapacity.map(version, bytes, fldBeg);
      case 529 -> orderRestrictions.map(version, bytes, fldBeg);
      case 582 -> custOrderCapacity.map(version, bytes, fldBeg);
      case 121 -> forexReq.map(version, bytes, fldBeg);
      case 120 -> settlCurrency.map(version, bytes, fldBeg);
      case 775 -> bookingType.map(version, bytes, fldBeg);
      case 58 -> text.map(version, bytes, fldBeg);
      case 354 -> encodedTextLen.map(version, bytes, fldBeg);
      case 355 -> encodedText.map(version, bytes, fldBeg);
      case 77 -> positionEffect.map(version, bytes, fldBeg);
      case 203 -> coveredOrUncovered.map(version, bytes, fldBeg);
      case 544 -> cashMargin.map(version, bytes, fldBeg);
      case 635 -> clearingFeeIndicator.map(version, bytes, fldBeg);
      case 377 -> solicitedFlag.map(version, bytes, fldBeg);
      case 659 -> sideComplianceID.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 54 -> side;
      case 11 -> clOrdID;
      case 526 -> secondaryClOrdID;
      case 583 -> clOrdLinkID;
      case 448,802,803,452,453,523,447 -> 
          partyIDsGroup.field(tag);
      case 229 -> tradeOriginationDate;
      case 75 -> tradeDate;
      case 1 -> account;
      case 660 -> acctIDSource;
      case 581 -> accountType;
      case 589 -> dayBookingInst;
      case 590 -> bookingUnit;
      case 591 -> preallocMethod;
      case 70 -> allocID;
      case 736,545,804,805,524,525,78,79,80,467,661,538,539 -> 
          allocsGroup.field(tag);
      case 854 -> qtyType;
      case 38 -> orderQty;
      case 152 -> cashOrderQty;
      case 516 -> orderPercent;
      case 468 -> roundingDirection;
      case 469 -> roundingModulus;
      case 12 -> commission;
      case 13 -> commType;
      case 479 -> commCurrency;
      case 497 -> fundRenewWaiv;
      case 528 -> orderCapacity;
      case 529 -> orderRestrictions;
      case 582 -> custOrderCapacity;
      case 121 -> forexReq;
      case 120 -> settlCurrency;
      case 775 -> bookingType;
      case 58 -> text;
      case 354 -> encodedTextLen;
      case 355 -> encodedText;
      case 77 -> positionEffect;
      case 203 -> coveredOrUncovered;
      case 544 -> cashMargin;
      case 635 -> clearingFeeIndicator;
      case 377 -> solicitedFlag;
      case 659 -> sideComplianceID;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = side.write(valBeg);
    valBeg = clOrdID.write(valBeg);
    valBeg = secondaryClOrdID.write(valBeg);
    valBeg = clOrdLinkID.write(valBeg);
    valBeg = partyIDsGroup.write(valBeg);
    valBeg = tradeOriginationDate.write(valBeg);
    valBeg = tradeDate.write(valBeg);
    valBeg = account.write(valBeg);
    valBeg = acctIDSource.write(valBeg);
    valBeg = accountType.write(valBeg);
    valBeg = dayBookingInst.write(valBeg);
    valBeg = bookingUnit.write(valBeg);
    valBeg = preallocMethod.write(valBeg);
    valBeg = allocID.write(valBeg);
    valBeg = allocsGroup.write(valBeg);
    valBeg = qtyType.write(valBeg);
    valBeg = orderQty.write(valBeg);
    valBeg = cashOrderQty.write(valBeg);
    valBeg = orderPercent.write(valBeg);
    valBeg = roundingDirection.write(valBeg);
    valBeg = roundingModulus.write(valBeg);
    valBeg = commission.write(valBeg);
    valBeg = commType.write(valBeg);
    valBeg = commCurrency.write(valBeg);
    valBeg = fundRenewWaiv.write(valBeg);
    valBeg = orderCapacity.write(valBeg);
    valBeg = orderRestrictions.write(valBeg);
    valBeg = custOrderCapacity.write(valBeg);
    valBeg = forexReq.write(valBeg);
    valBeg = settlCurrency.write(valBeg);
    valBeg = bookingType.write(valBeg);
    valBeg = text.write(valBeg);
    valBeg = encodedTextLen.write(valBeg);
    valBeg = encodedText.write(valBeg);
    valBeg = positionEffect.write(valBeg);
    valBeg = coveredOrUncovered.write(valBeg);
    valBeg = cashMargin.write(valBeg);
    valBeg = clearingFeeIndicator.write(valBeg);
    valBeg = solicitedFlag.write(valBeg);
    valBeg = sideComplianceID.write(valBeg);
    return valBeg; 
  }
}