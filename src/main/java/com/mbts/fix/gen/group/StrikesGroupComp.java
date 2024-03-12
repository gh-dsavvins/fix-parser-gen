package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class StrikesGroupComp extends AbstractGroupComponent {

  private final Symbol symbol;
  private final SymbolSfx symbolSfx;
  private final SecurityID securityID;
  private final SecurityIDSource securityIDSource;
  private final SecurityAltIDGroup securityAltIDGroup;
  private final Product product;
  private final CFICode cFICode;
  private final SecurityType securityType;
  private final SecuritySubType securitySubType;
  private final MaturityMonthYear maturityMonthYear;
  private final MaturityDate maturityDate;
  private final PutOrCall putOrCall;
  private final CouponPaymentDate couponPaymentDate;
  private final IssueDate issueDate;
  private final RepoCollateralSecurityType repoCollateralSecurityType;
  private final RepurchaseTerm repurchaseTerm;
  private final RepurchaseRate repurchaseRate;
  private final Factor factor;
  private final CreditRating creditRating;
  private final InstrRegistry instrRegistry;
  private final CountryOfIssue countryOfIssue;
  private final StateOrProvinceOfIssue stateOrProvinceOfIssue;
  private final LocaleOfIssue localeOfIssue;
  private final RedemptionDate redemptionDate;
  private final StrikePrice strikePrice;
  private final StrikeCurrency strikeCurrency;
  private final OptAttribute optAttribute;
  private final ContractMultiplier contractMultiplier;
  private final CouponRate couponRate;
  private final SecurityExchange securityExchange;
  private final Issuer issuer;
  private final EncodedIssuerLen encodedIssuerLen;
  private final EncodedIssuer encodedIssuer;
  private final SecurityDesc securityDesc;
  private final EncodedSecurityDescLen encodedSecurityDescLen;
  private final EncodedSecurityDesc encodedSecurityDesc;
  private final Pool pool;
  private final ContractSettlMonth contractSettlMonth;
  private final CPProgram cPProgram;
  private final CPRegType cPRegType;
  private final EventsGroup eventsGroup;
  private final DatedDate datedDate;
  private final InterestAccrualDate interestAccrualDate;

  public StrikesGroupComp(AbstractMessage message) {
    super(message);
    symbol = new Symbol(message);
    symbolSfx = new SymbolSfx(message);
    securityID = new SecurityID(message);
    securityIDSource = new SecurityIDSource(message);
    securityAltIDGroup = new SecurityAltIDGroup(message);
    product = new Product(message);
    cFICode = new CFICode(message);
    securityType = new SecurityType(message);
    securitySubType = new SecuritySubType(message);
    maturityMonthYear = new MaturityMonthYear(message);
    maturityDate = new MaturityDate(message);
    putOrCall = new PutOrCall(message);
    couponPaymentDate = new CouponPaymentDate(message);
    issueDate = new IssueDate(message);
    repoCollateralSecurityType = new RepoCollateralSecurityType(message);
    repurchaseTerm = new RepurchaseTerm(message);
    repurchaseRate = new RepurchaseRate(message);
    factor = new Factor(message);
    creditRating = new CreditRating(message);
    instrRegistry = new InstrRegistry(message);
    countryOfIssue = new CountryOfIssue(message);
    stateOrProvinceOfIssue = new StateOrProvinceOfIssue(message);
    localeOfIssue = new LocaleOfIssue(message);
    redemptionDate = new RedemptionDate(message);
    strikePrice = new StrikePrice(message);
    strikeCurrency = new StrikeCurrency(message);
    optAttribute = new OptAttribute(message);
    contractMultiplier = new ContractMultiplier(message);
    couponRate = new CouponRate(message);
    securityExchange = new SecurityExchange(message);
    issuer = new Issuer(message);
    encodedIssuerLen = new EncodedIssuerLen(message);
    encodedIssuer = new EncodedIssuer(message);
    securityDesc = new SecurityDesc(message);
    encodedSecurityDescLen = new EncodedSecurityDescLen(message);
    encodedSecurityDesc = new EncodedSecurityDesc(message);
    pool = new Pool(message);
    contractSettlMonth = new ContractSettlMonth(message);
    cPProgram = new CPProgram(message);
    cPRegType = new CPRegType(message);
    eventsGroup = new EventsGroup(message);
    datedDate = new DatedDate(message);
    interestAccrualDate = new InterestAccrualDate(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 55 -> symbol.map(version, bytes, fldBeg);
      case 65 -> symbolSfx.map(version, bytes, fldBeg);
      case 48 -> securityID.map(version, bytes, fldBeg);
      case 22 -> securityIDSource.map(version, bytes, fldBeg);
      case 454,455,456 -> 
          securityAltIDGroup.map(tag, fldBeg);
      case 460 -> product.map(version, bytes, fldBeg);
      case 461 -> cFICode.map(version, bytes, fldBeg);
      case 167 -> securityType.map(version, bytes, fldBeg);
      case 762 -> securitySubType.map(version, bytes, fldBeg);
      case 200 -> maturityMonthYear.map(version, bytes, fldBeg);
      case 541 -> maturityDate.map(version, bytes, fldBeg);
      case 201 -> putOrCall.map(version, bytes, fldBeg);
      case 224 -> couponPaymentDate.map(version, bytes, fldBeg);
      case 225 -> issueDate.map(version, bytes, fldBeg);
      case 239 -> repoCollateralSecurityType.map(version, bytes, fldBeg);
      case 226 -> repurchaseTerm.map(version, bytes, fldBeg);
      case 227 -> repurchaseRate.map(version, bytes, fldBeg);
      case 228 -> factor.map(version, bytes, fldBeg);
      case 255 -> creditRating.map(version, bytes, fldBeg);
      case 543 -> instrRegistry.map(version, bytes, fldBeg);
      case 470 -> countryOfIssue.map(version, bytes, fldBeg);
      case 471 -> stateOrProvinceOfIssue.map(version, bytes, fldBeg);
      case 472 -> localeOfIssue.map(version, bytes, fldBeg);
      case 240 -> redemptionDate.map(version, bytes, fldBeg);
      case 202 -> strikePrice.map(version, bytes, fldBeg);
      case 947 -> strikeCurrency.map(version, bytes, fldBeg);
      case 206 -> optAttribute.map(version, bytes, fldBeg);
      case 231 -> contractMultiplier.map(version, bytes, fldBeg);
      case 223 -> couponRate.map(version, bytes, fldBeg);
      case 207 -> securityExchange.map(version, bytes, fldBeg);
      case 106 -> issuer.map(version, bytes, fldBeg);
      case 348 -> encodedIssuerLen.map(version, bytes, fldBeg);
      case 349 -> encodedIssuer.map(version, bytes, fldBeg);
      case 107 -> securityDesc.map(version, bytes, fldBeg);
      case 350 -> encodedSecurityDescLen.map(version, bytes, fldBeg);
      case 351 -> encodedSecurityDesc.map(version, bytes, fldBeg);
      case 691 -> pool.map(version, bytes, fldBeg);
      case 667 -> contractSettlMonth.map(version, bytes, fldBeg);
      case 875 -> cPProgram.map(version, bytes, fldBeg);
      case 876 -> cPRegType.map(version, bytes, fldBeg);
      case 864,865,866,867,868 -> 
          eventsGroup.map(tag, fldBeg);
      case 873 -> datedDate.map(version, bytes, fldBeg);
      case 874 -> interestAccrualDate.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 55 -> symbol;
      case 65 -> symbolSfx;
      case 48 -> securityID;
      case 22 -> securityIDSource;
      case 454,455,456 -> 
          securityAltIDGroup.field(tag);
      case 460 -> product;
      case 461 -> cFICode;
      case 167 -> securityType;
      case 762 -> securitySubType;
      case 200 -> maturityMonthYear;
      case 541 -> maturityDate;
      case 201 -> putOrCall;
      case 224 -> couponPaymentDate;
      case 225 -> issueDate;
      case 239 -> repoCollateralSecurityType;
      case 226 -> repurchaseTerm;
      case 227 -> repurchaseRate;
      case 228 -> factor;
      case 255 -> creditRating;
      case 543 -> instrRegistry;
      case 470 -> countryOfIssue;
      case 471 -> stateOrProvinceOfIssue;
      case 472 -> localeOfIssue;
      case 240 -> redemptionDate;
      case 202 -> strikePrice;
      case 947 -> strikeCurrency;
      case 206 -> optAttribute;
      case 231 -> contractMultiplier;
      case 223 -> couponRate;
      case 207 -> securityExchange;
      case 106 -> issuer;
      case 348 -> encodedIssuerLen;
      case 349 -> encodedIssuer;
      case 107 -> securityDesc;
      case 350 -> encodedSecurityDescLen;
      case 351 -> encodedSecurityDesc;
      case 691 -> pool;
      case 667 -> contractSettlMonth;
      case 875 -> cPProgram;
      case 876 -> cPRegType;
      case 864,865,866,867,868 -> 
          eventsGroup.field(tag);
      case 873 -> datedDate;
      case 874 -> interestAccrualDate;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = symbol.write(valBeg);
    valBeg = symbolSfx.write(valBeg);
    valBeg = securityID.write(valBeg);
    valBeg = securityIDSource.write(valBeg);
    valBeg = securityAltIDGroup.write(valBeg);
    valBeg = product.write(valBeg);
    valBeg = cFICode.write(valBeg);
    valBeg = securityType.write(valBeg);
    valBeg = securitySubType.write(valBeg);
    valBeg = maturityMonthYear.write(valBeg);
    valBeg = maturityDate.write(valBeg);
    valBeg = putOrCall.write(valBeg);
    valBeg = couponPaymentDate.write(valBeg);
    valBeg = issueDate.write(valBeg);
    valBeg = repoCollateralSecurityType.write(valBeg);
    valBeg = repurchaseTerm.write(valBeg);
    valBeg = repurchaseRate.write(valBeg);
    valBeg = factor.write(valBeg);
    valBeg = creditRating.write(valBeg);
    valBeg = instrRegistry.write(valBeg);
    valBeg = countryOfIssue.write(valBeg);
    valBeg = stateOrProvinceOfIssue.write(valBeg);
    valBeg = localeOfIssue.write(valBeg);
    valBeg = redemptionDate.write(valBeg);
    valBeg = strikePrice.write(valBeg);
    valBeg = strikeCurrency.write(valBeg);
    valBeg = optAttribute.write(valBeg);
    valBeg = contractMultiplier.write(valBeg);
    valBeg = couponRate.write(valBeg);
    valBeg = securityExchange.write(valBeg);
    valBeg = issuer.write(valBeg);
    valBeg = encodedIssuerLen.write(valBeg);
    valBeg = encodedIssuer.write(valBeg);
    valBeg = securityDesc.write(valBeg);
    valBeg = encodedSecurityDescLen.write(valBeg);
    valBeg = encodedSecurityDesc.write(valBeg);
    valBeg = pool.write(valBeg);
    valBeg = contractSettlMonth.write(valBeg);
    valBeg = cPProgram.write(valBeg);
    valBeg = cPRegType.write(valBeg);
    valBeg = eventsGroup.write(valBeg);
    valBeg = datedDate.write(valBeg);
    valBeg = interestAccrualDate.write(valBeg);
    return valBeg; 
  }
}