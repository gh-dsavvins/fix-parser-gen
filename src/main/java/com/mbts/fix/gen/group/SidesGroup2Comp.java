package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class SidesGroup2Comp extends AbstractGroupComponent {

  private final Side side;
  private final OrderID orderID;
  private final SecondaryOrderID secondaryOrderID;
  private final ClOrdID clOrdID;
  private final SecondaryClOrdID secondaryClOrdID;
  private final ListID listID;
  private final PartyIDsGroup partyIDsGroup;
  private final Account account;
  private final AcctIDSource acctIDSource;
  private final AccountType accountType;
  private final ProcessCode processCode;
  private final OddLot oddLot;
  private final ClearingInstructionsGroup clearingInstructionsGroup;
  private final TradeInputSource tradeInputSource;
  private final TradeInputDevice tradeInputDevice;
  private final OrderInputDevice orderInputDevice;
  private final Currency currency;
  private final ComplianceID complianceID;
  private final SolicitedFlag solicitedFlag;
  private final OrderCapacity orderCapacity;
  private final OrderRestrictions orderRestrictions;
  private final CustOrderCapacity custOrderCapacity;
  private final OrdType ordType;
  private final ExecInst execInst;
  private final TransBkdTime transBkdTime;
  private final TradingSessionID tradingSessionID;
  private final TradingSessionSubID tradingSessionSubID;
  private final TimeBracket timeBracket;
  private final Commission commission;
  private final CommType commType;
  private final CommCurrency commCurrency;
  private final FundRenewWaiv fundRenewWaiv;
  private final GrossTradeAmt grossTradeAmt;
  private final NumDaysInterest numDaysInterest;
  private final ExDate exDate;
  private final AccruedInterestRate accruedInterestRate;
  private final AccruedInterestAmt accruedInterestAmt;
  private final InterestAtMaturity interestAtMaturity;
  private final EndAccruedInterestAmt endAccruedInterestAmt;
  private final StartCash startCash;
  private final EndCash endCash;
  private final Concession concession;
  private final TotalTakedown totalTakedown;
  private final NetMoney netMoney;
  private final SettlCurrAmt settlCurrAmt;
  private final SettlCurrency settlCurrency;
  private final SettlCurrFxRate settlCurrFxRate;
  private final SettlCurrFxRateCalc settlCurrFxRateCalc;
  private final PositionEffect positionEffect;
  private final Text text;
  private final EncodedTextLen encodedTextLen;
  private final EncodedText encodedText;
  private final SideMultiLegReportingType sideMultiLegReportingType;
  private final ContAmtsGroup contAmtsGroup;
  private final StipulationsGroup stipulationsGroup;
  private final MiscFeesGroup miscFeesGroup;
  private final ExchangeRule exchangeRule;
  private final TradeAllocIndicator tradeAllocIndicator;
  private final PreallocMethod preallocMethod;
  private final AllocID allocID;
  private final AllocsGroup4 allocsGroup4;

  public SidesGroup2Comp(AbstractMessage message) {
    super(message);
    side = new Side(message);
    orderID = new OrderID(message);
    secondaryOrderID = new SecondaryOrderID(message);
    clOrdID = new ClOrdID(message);
    secondaryClOrdID = new SecondaryClOrdID(message);
    listID = new ListID(message);
    partyIDsGroup = new PartyIDsGroup(message);
    account = new Account(message);
    acctIDSource = new AcctIDSource(message);
    accountType = new AccountType(message);
    processCode = new ProcessCode(message);
    oddLot = new OddLot(message);
    clearingInstructionsGroup = new ClearingInstructionsGroup(message);
    tradeInputSource = new TradeInputSource(message);
    tradeInputDevice = new TradeInputDevice(message);
    orderInputDevice = new OrderInputDevice(message);
    currency = new Currency(message);
    complianceID = new ComplianceID(message);
    solicitedFlag = new SolicitedFlag(message);
    orderCapacity = new OrderCapacity(message);
    orderRestrictions = new OrderRestrictions(message);
    custOrderCapacity = new CustOrderCapacity(message);
    ordType = new OrdType(message);
    execInst = new ExecInst(message);
    transBkdTime = new TransBkdTime(message);
    tradingSessionID = new TradingSessionID(message);
    tradingSessionSubID = new TradingSessionSubID(message);
    timeBracket = new TimeBracket(message);
    commission = new Commission(message);
    commType = new CommType(message);
    commCurrency = new CommCurrency(message);
    fundRenewWaiv = new FundRenewWaiv(message);
    grossTradeAmt = new GrossTradeAmt(message);
    numDaysInterest = new NumDaysInterest(message);
    exDate = new ExDate(message);
    accruedInterestRate = new AccruedInterestRate(message);
    accruedInterestAmt = new AccruedInterestAmt(message);
    interestAtMaturity = new InterestAtMaturity(message);
    endAccruedInterestAmt = new EndAccruedInterestAmt(message);
    startCash = new StartCash(message);
    endCash = new EndCash(message);
    concession = new Concession(message);
    totalTakedown = new TotalTakedown(message);
    netMoney = new NetMoney(message);
    settlCurrAmt = new SettlCurrAmt(message);
    settlCurrency = new SettlCurrency(message);
    settlCurrFxRate = new SettlCurrFxRate(message);
    settlCurrFxRateCalc = new SettlCurrFxRateCalc(message);
    positionEffect = new PositionEffect(message);
    text = new Text(message);
    encodedTextLen = new EncodedTextLen(message);
    encodedText = new EncodedText(message);
    sideMultiLegReportingType = new SideMultiLegReportingType(message);
    contAmtsGroup = new ContAmtsGroup(message);
    stipulationsGroup = new StipulationsGroup(message);
    miscFeesGroup = new MiscFeesGroup(message);
    exchangeRule = new ExchangeRule(message);
    tradeAllocIndicator = new TradeAllocIndicator(message);
    preallocMethod = new PreallocMethod(message);
    allocID = new AllocID(message);
    allocsGroup4 = new AllocsGroup4(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 54 -> side.map(version, bytes, fldBeg);
      case 37 -> orderID.map(version, bytes, fldBeg);
      case 198 -> secondaryOrderID.map(version, bytes, fldBeg);
      case 11 -> clOrdID.map(version, bytes, fldBeg);
      case 526 -> secondaryClOrdID.map(version, bytes, fldBeg);
      case 66 -> listID.map(version, bytes, fldBeg);
      case 448,802,803,452,453,523,447 -> 
          partyIDsGroup.map(tag, fldBeg);
      case 1 -> account.map(version, bytes, fldBeg);
      case 660 -> acctIDSource.map(version, bytes, fldBeg);
      case 581 -> accountType.map(version, bytes, fldBeg);
      case 81 -> processCode.map(version, bytes, fldBeg);
      case 575 -> oddLot.map(version, bytes, fldBeg);
      case 576,577 -> 
          clearingInstructionsGroup.map(tag, fldBeg);
      case 578 -> tradeInputSource.map(version, bytes, fldBeg);
      case 579 -> tradeInputDevice.map(version, bytes, fldBeg);
      case 821 -> orderInputDevice.map(version, bytes, fldBeg);
      case 15 -> currency.map(version, bytes, fldBeg);
      case 376 -> complianceID.map(version, bytes, fldBeg);
      case 377 -> solicitedFlag.map(version, bytes, fldBeg);
      case 528 -> orderCapacity.map(version, bytes, fldBeg);
      case 529 -> orderRestrictions.map(version, bytes, fldBeg);
      case 582 -> custOrderCapacity.map(version, bytes, fldBeg);
      case 40 -> ordType.map(version, bytes, fldBeg);
      case 18 -> execInst.map(version, bytes, fldBeg);
      case 483 -> transBkdTime.map(version, bytes, fldBeg);
      case 336 -> tradingSessionID.map(version, bytes, fldBeg);
      case 625 -> tradingSessionSubID.map(version, bytes, fldBeg);
      case 943 -> timeBracket.map(version, bytes, fldBeg);
      case 12 -> commission.map(version, bytes, fldBeg);
      case 13 -> commType.map(version, bytes, fldBeg);
      case 479 -> commCurrency.map(version, bytes, fldBeg);
      case 497 -> fundRenewWaiv.map(version, bytes, fldBeg);
      case 381 -> grossTradeAmt.map(version, bytes, fldBeg);
      case 157 -> numDaysInterest.map(version, bytes, fldBeg);
      case 230 -> exDate.map(version, bytes, fldBeg);
      case 158 -> accruedInterestRate.map(version, bytes, fldBeg);
      case 159 -> accruedInterestAmt.map(version, bytes, fldBeg);
      case 738 -> interestAtMaturity.map(version, bytes, fldBeg);
      case 920 -> endAccruedInterestAmt.map(version, bytes, fldBeg);
      case 921 -> startCash.map(version, bytes, fldBeg);
      case 922 -> endCash.map(version, bytes, fldBeg);
      case 238 -> concession.map(version, bytes, fldBeg);
      case 237 -> totalTakedown.map(version, bytes, fldBeg);
      case 118 -> netMoney.map(version, bytes, fldBeg);
      case 119 -> settlCurrAmt.map(version, bytes, fldBeg);
      case 120 -> settlCurrency.map(version, bytes, fldBeg);
      case 155 -> settlCurrFxRate.map(version, bytes, fldBeg);
      case 156 -> settlCurrFxRateCalc.map(version, bytes, fldBeg);
      case 77 -> positionEffect.map(version, bytes, fldBeg);
      case 58 -> text.map(version, bytes, fldBeg);
      case 354 -> encodedTextLen.map(version, bytes, fldBeg);
      case 355 -> encodedText.map(version, bytes, fldBeg);
      case 752 -> sideMultiLegReportingType.map(version, bytes, fldBeg);
      case 518,519,520,521 -> 
          contAmtsGroup.map(tag, fldBeg);
      case 232,233,234 -> 
          stipulationsGroup.map(tag, fldBeg);
      case 136,137,138,139,891 -> 
          miscFeesGroup.map(tag, fldBeg);
      case 825 -> exchangeRule.map(version, bytes, fldBeg);
      case 826 -> tradeAllocIndicator.map(version, bytes, fldBeg);
      case 591 -> preallocMethod.map(version, bytes, fldBeg);
      case 70 -> allocID.map(version, bytes, fldBeg);
      case 736,806,807,78,79,80,467,756,661,757,758,759,760 -> 
          allocsGroup4.map(tag, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 54 -> side;
      case 37 -> orderID;
      case 198 -> secondaryOrderID;
      case 11 -> clOrdID;
      case 526 -> secondaryClOrdID;
      case 66 -> listID;
      case 448,802,803,452,453,523,447 -> 
          partyIDsGroup.field(tag);
      case 1 -> account;
      case 660 -> acctIDSource;
      case 581 -> accountType;
      case 81 -> processCode;
      case 575 -> oddLot;
      case 576,577 -> 
          clearingInstructionsGroup.field(tag);
      case 578 -> tradeInputSource;
      case 579 -> tradeInputDevice;
      case 821 -> orderInputDevice;
      case 15 -> currency;
      case 376 -> complianceID;
      case 377 -> solicitedFlag;
      case 528 -> orderCapacity;
      case 529 -> orderRestrictions;
      case 582 -> custOrderCapacity;
      case 40 -> ordType;
      case 18 -> execInst;
      case 483 -> transBkdTime;
      case 336 -> tradingSessionID;
      case 625 -> tradingSessionSubID;
      case 943 -> timeBracket;
      case 12 -> commission;
      case 13 -> commType;
      case 479 -> commCurrency;
      case 497 -> fundRenewWaiv;
      case 381 -> grossTradeAmt;
      case 157 -> numDaysInterest;
      case 230 -> exDate;
      case 158 -> accruedInterestRate;
      case 159 -> accruedInterestAmt;
      case 738 -> interestAtMaturity;
      case 920 -> endAccruedInterestAmt;
      case 921 -> startCash;
      case 922 -> endCash;
      case 238 -> concession;
      case 237 -> totalTakedown;
      case 118 -> netMoney;
      case 119 -> settlCurrAmt;
      case 120 -> settlCurrency;
      case 155 -> settlCurrFxRate;
      case 156 -> settlCurrFxRateCalc;
      case 77 -> positionEffect;
      case 58 -> text;
      case 354 -> encodedTextLen;
      case 355 -> encodedText;
      case 752 -> sideMultiLegReportingType;
      case 518,519,520,521 -> 
          contAmtsGroup.field(tag);
      case 232,233,234 -> 
          stipulationsGroup.field(tag);
      case 136,137,138,139,891 -> 
          miscFeesGroup.field(tag);
      case 825 -> exchangeRule;
      case 826 -> tradeAllocIndicator;
      case 591 -> preallocMethod;
      case 70 -> allocID;
      case 736,806,807,78,79,80,467,756,661,757,758,759,760 -> 
          allocsGroup4.field(tag);
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = side.write(valBeg);
    valBeg = orderID.write(valBeg);
    valBeg = secondaryOrderID.write(valBeg);
    valBeg = clOrdID.write(valBeg);
    valBeg = secondaryClOrdID.write(valBeg);
    valBeg = listID.write(valBeg);
    valBeg = partyIDsGroup.write(valBeg);
    valBeg = account.write(valBeg);
    valBeg = acctIDSource.write(valBeg);
    valBeg = accountType.write(valBeg);
    valBeg = processCode.write(valBeg);
    valBeg = oddLot.write(valBeg);
    valBeg = clearingInstructionsGroup.write(valBeg);
    valBeg = tradeInputSource.write(valBeg);
    valBeg = tradeInputDevice.write(valBeg);
    valBeg = orderInputDevice.write(valBeg);
    valBeg = currency.write(valBeg);
    valBeg = complianceID.write(valBeg);
    valBeg = solicitedFlag.write(valBeg);
    valBeg = orderCapacity.write(valBeg);
    valBeg = orderRestrictions.write(valBeg);
    valBeg = custOrderCapacity.write(valBeg);
    valBeg = ordType.write(valBeg);
    valBeg = execInst.write(valBeg);
    valBeg = transBkdTime.write(valBeg);
    valBeg = tradingSessionID.write(valBeg);
    valBeg = tradingSessionSubID.write(valBeg);
    valBeg = timeBracket.write(valBeg);
    valBeg = commission.write(valBeg);
    valBeg = commType.write(valBeg);
    valBeg = commCurrency.write(valBeg);
    valBeg = fundRenewWaiv.write(valBeg);
    valBeg = grossTradeAmt.write(valBeg);
    valBeg = numDaysInterest.write(valBeg);
    valBeg = exDate.write(valBeg);
    valBeg = accruedInterestRate.write(valBeg);
    valBeg = accruedInterestAmt.write(valBeg);
    valBeg = interestAtMaturity.write(valBeg);
    valBeg = endAccruedInterestAmt.write(valBeg);
    valBeg = startCash.write(valBeg);
    valBeg = endCash.write(valBeg);
    valBeg = concession.write(valBeg);
    valBeg = totalTakedown.write(valBeg);
    valBeg = netMoney.write(valBeg);
    valBeg = settlCurrAmt.write(valBeg);
    valBeg = settlCurrency.write(valBeg);
    valBeg = settlCurrFxRate.write(valBeg);
    valBeg = settlCurrFxRateCalc.write(valBeg);
    valBeg = positionEffect.write(valBeg);
    valBeg = text.write(valBeg);
    valBeg = encodedTextLen.write(valBeg);
    valBeg = encodedText.write(valBeg);
    valBeg = sideMultiLegReportingType.write(valBeg);
    valBeg = contAmtsGroup.write(valBeg);
    valBeg = stipulationsGroup.write(valBeg);
    valBeg = miscFeesGroup.write(valBeg);
    valBeg = exchangeRule.write(valBeg);
    valBeg = tradeAllocIndicator.write(valBeg);
    valBeg = preallocMethod.write(valBeg);
    valBeg = allocID.write(valBeg);
    valBeg = allocsGroup4.write(valBeg);
    return valBeg; 
  }
}