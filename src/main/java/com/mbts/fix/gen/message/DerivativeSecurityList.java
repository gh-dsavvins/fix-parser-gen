package com.mbts.fix.gen.message;

import com.mbts.fix.gen.group.*;
import com.mbts.fix.api.*;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.gen.field.*;
import java.util.function.BiFunction;
import lombok.Getter;
import com.mbts.fix.message.*; 

@Getter
@SuppressWarnings ("unused")
public class DerivativeSecurityList extends AbstractMessage {

  private final BeginString beginString = new BeginString(this);
  private final BodyLength bodyLength = new BodyLength(this);
  private final MsgType msgType = new MsgType(this);
  private final SenderCompID senderCompID = new SenderCompID(this);
  private final TargetCompID targetCompID = new TargetCompID(this);
  private final OnBehalfOfCompID onBehalfOfCompID = new OnBehalfOfCompID(this);
  private final DeliverToCompID deliverToCompID = new DeliverToCompID(this);
  private final SecureDataLen secureDataLen = new SecureDataLen(this);
  private final SecureData secureData = new SecureData(this);
  private final MsgSeqNum msgSeqNum = new MsgSeqNum(this);
  private final SenderSubID senderSubID = new SenderSubID(this);
  private final SenderLocationID senderLocationID = new SenderLocationID(this);
  private final TargetSubID targetSubID = new TargetSubID(this);
  private final TargetLocationID targetLocationID = new TargetLocationID(this);
  private final OnBehalfOfSubID onBehalfOfSubID = new OnBehalfOfSubID(this);
  private final OnBehalfOfLocationID onBehalfOfLocationID = new OnBehalfOfLocationID(this);
  private final DeliverToSubID deliverToSubID = new DeliverToSubID(this);
  private final DeliverToLocationID deliverToLocationID = new DeliverToLocationID(this);
  private final PossDupFlag possDupFlag = new PossDupFlag(this);
  private final PossResend possResend = new PossResend(this);
  private final SendingTime sendingTime = new SendingTime(this);
  private final OrigSendingTime origSendingTime = new OrigSendingTime(this);
  private final XmlDataLen xmlDataLen = new XmlDataLen(this);
  private final XmlData xmlData = new XmlData(this);
  private final MessageEncoding messageEncoding = new MessageEncoding(this);
  private final LastMsgSeqNumProcessed lastMsgSeqNumProcessed = new LastMsgSeqNumProcessed(this);
  private final HopsGroup hopsGroup = new HopsGroup(this);
  private final SecurityReqID securityReqID = new SecurityReqID(this);
  private final SecurityResponseID securityResponseID = new SecurityResponseID(this);
  private final SecurityRequestResult securityRequestResult = new SecurityRequestResult(this);
  private final UnderlyingSymbol underlyingSymbol = new UnderlyingSymbol(this);
  private final UnderlyingSymbolSfx underlyingSymbolSfx = new UnderlyingSymbolSfx(this);
  private final UnderlyingSecurityID underlyingSecurityID = new UnderlyingSecurityID(this);
  private final UnderlyingSecurityIDSource underlyingSecurityIDSource = new UnderlyingSecurityIDSource(this);
  private final UnderlyingSecurityAltIDGroup underlyingSecurityAltIDGroup = new UnderlyingSecurityAltIDGroup(this);
  private final UnderlyingProduct underlyingProduct = new UnderlyingProduct(this);
  private final UnderlyingCFICode underlyingCFICode = new UnderlyingCFICode(this);
  private final UnderlyingSecurityType underlyingSecurityType = new UnderlyingSecurityType(this);
  private final UnderlyingSecuritySubType underlyingSecuritySubType = new UnderlyingSecuritySubType(this);
  private final UnderlyingMaturityMonthYear underlyingMaturityMonthYear = new UnderlyingMaturityMonthYear(this);
  private final UnderlyingMaturityDate underlyingMaturityDate = new UnderlyingMaturityDate(this);
  private final UnderlyingPutOrCall underlyingPutOrCall = new UnderlyingPutOrCall(this);
  private final UnderlyingCouponPaymentDate underlyingCouponPaymentDate = new UnderlyingCouponPaymentDate(this);
  private final UnderlyingIssueDate underlyingIssueDate = new UnderlyingIssueDate(this);
  private final UnderlyingRepoCollateralSecurityType underlyingRepoCollateralSecurityType = new UnderlyingRepoCollateralSecurityType(this);
  private final UnderlyingRepurchaseTerm underlyingRepurchaseTerm = new UnderlyingRepurchaseTerm(this);
  private final UnderlyingRepurchaseRate underlyingRepurchaseRate = new UnderlyingRepurchaseRate(this);
  private final UnderlyingFactor underlyingFactor = new UnderlyingFactor(this);
  private final UnderlyingCreditRating underlyingCreditRating = new UnderlyingCreditRating(this);
  private final UnderlyingInstrRegistry underlyingInstrRegistry = new UnderlyingInstrRegistry(this);
  private final UnderlyingCountryOfIssue underlyingCountryOfIssue = new UnderlyingCountryOfIssue(this);
  private final UnderlyingStateOrProvinceOfIssue underlyingStateOrProvinceOfIssue = new UnderlyingStateOrProvinceOfIssue(this);
  private final UnderlyingLocaleOfIssue underlyingLocaleOfIssue = new UnderlyingLocaleOfIssue(this);
  private final UnderlyingRedemptionDate underlyingRedemptionDate = new UnderlyingRedemptionDate(this);
  private final UnderlyingStrikePrice underlyingStrikePrice = new UnderlyingStrikePrice(this);
  private final UnderlyingStrikeCurrency underlyingStrikeCurrency = new UnderlyingStrikeCurrency(this);
  private final UnderlyingOptAttribute underlyingOptAttribute = new UnderlyingOptAttribute(this);
  private final UnderlyingContractMultiplier underlyingContractMultiplier = new UnderlyingContractMultiplier(this);
  private final UnderlyingCouponRate underlyingCouponRate = new UnderlyingCouponRate(this);
  private final UnderlyingSecurityExchange underlyingSecurityExchange = new UnderlyingSecurityExchange(this);
  private final UnderlyingIssuer underlyingIssuer = new UnderlyingIssuer(this);
  private final EncodedUnderlyingIssuerLen encodedUnderlyingIssuerLen = new EncodedUnderlyingIssuerLen(this);
  private final EncodedUnderlyingIssuer encodedUnderlyingIssuer = new EncodedUnderlyingIssuer(this);
  private final UnderlyingSecurityDesc underlyingSecurityDesc = new UnderlyingSecurityDesc(this);
  private final EncodedUnderlyingSecurityDescLen encodedUnderlyingSecurityDescLen = new EncodedUnderlyingSecurityDescLen(this);
  private final EncodedUnderlyingSecurityDesc encodedUnderlyingSecurityDesc = new EncodedUnderlyingSecurityDesc(this);
  private final UnderlyingCPProgram underlyingCPProgram = new UnderlyingCPProgram(this);
  private final UnderlyingCPRegType underlyingCPRegType = new UnderlyingCPRegType(this);
  private final UnderlyingCurrency underlyingCurrency = new UnderlyingCurrency(this);
  private final UnderlyingQty underlyingQty = new UnderlyingQty(this);
  private final UnderlyingPx underlyingPx = new UnderlyingPx(this);
  private final UnderlyingDirtyPrice underlyingDirtyPrice = new UnderlyingDirtyPrice(this);
  private final UnderlyingEndPrice underlyingEndPrice = new UnderlyingEndPrice(this);
  private final UnderlyingStartValue underlyingStartValue = new UnderlyingStartValue(this);
  private final UnderlyingCurrentValue underlyingCurrentValue = new UnderlyingCurrentValue(this);
  private final UnderlyingEndValue underlyingEndValue = new UnderlyingEndValue(this);
  private final UnderlyingStipsGroup underlyingStipsGroup = new UnderlyingStipsGroup(this);
  private final TotNoRelatedSym totNoRelatedSym = new TotNoRelatedSym(this);
  private final LastFragment lastFragment = new LastFragment(this);
  private final RelatedSymGroup4 relatedSymGroup4 = new RelatedSymGroup4(this);
  private final SignatureLength signatureLength = new SignatureLength(this);
  private final Signature signature = new Signature(this);
  private final CheckSum checkSum = new CheckSum(this);

  public DerivativeSecurityList() {
    super();
    beginString.set("FIX.4.4");
    bodyLength.set(999);
  }

  @Override
  protected AbstractField msgType() {
    return beginString;
  }

  @Override
  protected void writeUnmapped() {
    valBeg = 24;
    valLim = 24;
    int bodyBeg = 24;
    valLim = securityReqID.write(valLim);
    valLim = securityResponseID.write(valLim);
    valLim = securityRequestResult.write(valLim);
    valLim = underlyingSymbol.write(valLim);
    valLim = underlyingSymbolSfx.write(valLim);
    valLim = underlyingSecurityID.write(valLim);
    valLim = underlyingSecurityIDSource.write(valLim);
    valLim = underlyingSecurityAltIDGroup.write(valLim);
    valLim = underlyingProduct.write(valLim);
    valLim = underlyingCFICode.write(valLim);
    valLim = underlyingSecurityType.write(valLim);
    valLim = underlyingSecuritySubType.write(valLim);
    valLim = underlyingMaturityMonthYear.write(valLim);
    valLim = underlyingMaturityDate.write(valLim);
    valLim = underlyingPutOrCall.write(valLim);
    valLim = underlyingCouponPaymentDate.write(valLim);
    valLim = underlyingIssueDate.write(valLim);
    valLim = underlyingRepoCollateralSecurityType.write(valLim);
    valLim = underlyingRepurchaseTerm.write(valLim);
    valLim = underlyingRepurchaseRate.write(valLim);
    valLim = underlyingFactor.write(valLim);
    valLim = underlyingCreditRating.write(valLim);
    valLim = underlyingInstrRegistry.write(valLim);
    valLim = underlyingCountryOfIssue.write(valLim);
    valLim = underlyingStateOrProvinceOfIssue.write(valLim);
    valLim = underlyingLocaleOfIssue.write(valLim);
    valLim = underlyingRedemptionDate.write(valLim);
    valLim = underlyingStrikePrice.write(valLim);
    valLim = underlyingStrikeCurrency.write(valLim);
    valLim = underlyingOptAttribute.write(valLim);
    valLim = underlyingContractMultiplier.write(valLim);
    valLim = underlyingCouponRate.write(valLim);
    valLim = underlyingSecurityExchange.write(valLim);
    valLim = underlyingIssuer.write(valLim);
    valLim = encodedUnderlyingIssuerLen.write(valLim);
    valLim = encodedUnderlyingIssuer.write(valLim);
    valLim = underlyingSecurityDesc.write(valLim);
    valLim = encodedUnderlyingSecurityDescLen.write(valLim);
    valLim = encodedUnderlyingSecurityDesc.write(valLim);
    valLim = underlyingCPProgram.write(valLim);
    valLim = underlyingCPRegType.write(valLim);
    valLim = underlyingCurrency.write(valLim);
    valLim = underlyingQty.write(valLim);
    valLim = underlyingPx.write(valLim);
    valLim = underlyingDirtyPrice.write(valLim);
    valLim = underlyingEndPrice.write(valLim);
    valLim = underlyingStartValue.write(valLim);
    valLim = underlyingCurrentValue.write(valLim);
    valLim = underlyingEndValue.write(valLim);
    valLim = underlyingStipsGroup.write(valLim);
    valLim = totNoRelatedSym.write(valLim);
    valLim = lastFragment.write(valLim);
    valLim = relatedSymGroup4.write(valLim);
    int bodyLim = valLim;
    writeUnmapped(bodyLength, bodyLim - bodyBeg, beginString, checkSum);
  }

  @Override
  protected Tag unknownTag() {
    return FixTag.unknown;
  }

  @Override
  protected int writeMapped() {
    int fldLim = super.writeMapped();
    calcAndWriteBodyLengthMapped(bodyLength, beginString);
    calcAndWriteCheckSum(checkSum);
    return fldLim;
  }

  @Override
  public Field map(int fldBeg) {
    int beg = fldBeg;
    switch(bytes[fldBeg]) {
      case '1':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '0':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return checkSum.map(version, bytes, beg); //10
            } else {
              switch(bytes[fldBeg]) {
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(106, beg); //106
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(107, beg); //107
                  }
                  break;
              }
            }
            break;
          case '1':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return onBehalfOfCompID.map(version, bytes, beg); //115
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return onBehalfOfSubID.map(version, bytes, beg); //116
                }
                break;
            }
            break;
          case '2':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return origSendingTime.map(version, bytes, beg); //122
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return deliverToCompID.map(version, bytes, beg); //128
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return deliverToSubID.map(version, bytes, beg); //129
                }
                break;
            }
            break;
          case '4':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return senderLocationID.map(version, bytes, beg); //142
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return targetLocationID.map(version, bytes, beg); //143
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return onBehalfOfLocationID.map(version, bytes, beg); //144
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return deliverToLocationID.map(version, bytes, beg); //145
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(146, beg); //146
                }
                break;
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return relatedSymGroup4.map(15, beg); //15
            }
            break;
          case '6':
            fldBeg++;
            if(bytes[fldBeg] == '7' && bytes[++fldBeg] == '=') {
              return relatedSymGroup4.map(167, beg); //167
            }
            break;
        }
        break;
      case '2':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '0':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(200, beg); //200
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(201, beg); //201
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(202, beg); //202
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(206, beg); //206
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(207, beg); //207
                }
                break;
            }
            break;
          case '1':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return xmlDataLen.map(version, bytes, beg); //212
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return xmlData.map(version, bytes, beg); //213
                }
                break;
            }
            break;
          case '2':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return relatedSymGroup4.map(22, beg); //22
            } else {
              switch(bytes[fldBeg]) {
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(223, beg); //223
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(224, beg); //224
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(225, beg); //225
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(226, beg); //226
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(227, beg); //227
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(228, beg); //228
                  }
                  break;
              }
            }
            break;
          case '3':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(231, beg); //231
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(239, beg); //239
                }
                break;
            }
            break;
          case '4':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(240, beg); //240
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingCouponPaymentDate.map(version, bytes, beg); //241
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingIssueDate.map(version, bytes, beg); //242
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingRepoCollateralSecurityType.map(version, bytes, beg); //243
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingRepurchaseTerm.map(version, bytes, beg); //244
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingRepurchaseRate.map(version, bytes, beg); //245
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingFactor.map(version, bytes, beg); //246
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingRedemptionDate.map(version, bytes, beg); //247
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(248, beg); //248
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(249, beg); //249
                }
                break;
            }
            break;
          case '5':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(250, beg); //250
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(251, beg); //251
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(252, beg); //252
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(253, beg); //253
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(254, beg); //254
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(255, beg); //255
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingCreditRating.map(version, bytes, beg); //256
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(257, beg); //257
                }
                break;
            }
            break;
        }
        break;
      case '3':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '0':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSecurityIDSource.map(version, bytes, beg); //305
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingIssuer.map(version, bytes, beg); //306
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSecurityDesc.map(version, bytes, beg); //307
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSecurityExchange.map(version, bytes, beg); //308
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSecurityID.map(version, bytes, beg); //309
                }
                break;
            }
            break;
          case '1':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSecurityType.map(version, bytes, beg); //310
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSymbol.map(version, bytes, beg); //311
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSymbolSfx.map(version, bytes, beg); //312
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingMaturityMonthYear.map(version, bytes, beg); //313
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingPutOrCall.map(version, bytes, beg); //315
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingStrikePrice.map(version, bytes, beg); //316
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingOptAttribute.map(version, bytes, beg); //317
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingCurrency.map(version, bytes, beg); //318
                }
                break;
            }
            break;
          case '2':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return securityReqID.map(version, bytes, beg); //320
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return securityResponseID.map(version, bytes, beg); //322
                }
                break;
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '6' && bytes[++fldBeg] == '=') {
              return relatedSymGroup4.map(336, beg); //336
            }
            break;
          case '4':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return msgSeqNum.map(version, bytes, beg); //34
            } else {
              switch(bytes[fldBeg]) {
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return messageEncoding.map(version, bytes, beg); //347
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(348, beg); //348
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(349, beg); //349
                  }
                  break;
              }
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return msgType.map(version, bytes, beg); //35
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(350, beg); //350
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(351, beg); //351
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(354, beg); //354
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(355, beg); //355
                  }
                  break;
              }
            }
            break;
          case '6':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return encodedUnderlyingIssuerLen.map(version, bytes, beg); //362
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return encodedUnderlyingIssuer.map(version, bytes, beg); //363
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return encodedUnderlyingSecurityDescLen.map(version, bytes, beg); //364
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return encodedUnderlyingSecurityDesc.map(version, bytes, beg); //365
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return lastMsgSeqNumProcessed.map(version, bytes, beg); //369
                }
                break;
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '3' && bytes[++fldBeg] == '=') {
              return totNoRelatedSym.map(version, bytes, beg); //393
            }
            break;
        }
        break;
      case '4':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return possDupFlag.map(version, bytes, beg); //43
            } else {
              switch(bytes[fldBeg]) {
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingCouponRate.map(version, bytes, beg); //435
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingContractMultiplier.map(version, bytes, beg); //436
                  }
                  break;
              }
            }
            break;
          case '5':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(454, beg); //454
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(455, beg); //455
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(456, beg); //456
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSecurityAltIDGroup.map(457, beg); //457
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSecurityAltIDGroup.map(458, beg); //458
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSecurityAltIDGroup.map(459, beg); //459
                }
                break;
            }
            break;
          case '6':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(460, beg); //460
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(461, beg); //461
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingProduct.map(version, bytes, beg); //462
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingCFICode.map(version, bytes, beg); //463
                }
                break;
            }
            break;
          case '7':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(470, beg); //470
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(471, beg); //471
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(472, beg); //472
                }
                break;
            }
            break;
          case '8':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return relatedSymGroup4.map(48, beg); //48
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return senderCompID.map(version, bytes, beg); //49
            }
            break;
        }
        break;
      case '5':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '0':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return senderSubID.map(version, bytes, beg); //50
            }
            break;
          case '2':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return sendingTime.map(version, bytes, beg); //52
            }
            break;
          case '4':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(541, beg); //541
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingMaturityDate.map(version, bytes, beg); //542
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(543, beg); //543
                }
                break;
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return relatedSymGroup4.map(55, beg); //55
            } else {
              switch(bytes[fldBeg]) {
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(555, beg); //555
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(556, beg); //556
                  }
                  break;
              }
            }
            break;
          case '6':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return targetCompID.map(version, bytes, beg); //56
            } else {
              if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
                return securityRequestResult.map(version, bytes, beg); //560
              }
            }
            break;
          case '7':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return targetSubID.map(version, bytes, beg); //57
            }
            break;
          case '8':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return relatedSymGroup4.map(58, beg); //58
            }
            break;
          case '9':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingCountryOfIssue.map(version, bytes, beg); //592
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingStateOrProvinceOfIssue.map(version, bytes, beg); //593
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingLocaleOfIssue.map(version, bytes, beg); //594
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingInstrRegistry.map(version, bytes, beg); //595
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(596, beg); //596
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(597, beg); //597
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(598, beg); //598
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(599, beg); //599
                }
                break;
            }
            break;
        }
        break;
      case '6':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '0':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(600, beg); //600
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(601, beg); //601
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(602, beg); //602
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(603, beg); //603
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(604, beg); //604
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(605, beg); //605
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(606, beg); //606
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(607, beg); //607
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(608, beg); //608
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(609, beg); //609
                }
                break;
            }
            break;
          case '1':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(610, beg); //610
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(611, beg); //611
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(612, beg); //612
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(613, beg); //613
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(614, beg); //614
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(615, beg); //615
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(616, beg); //616
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(617, beg); //617
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(618, beg); //618
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(619, beg); //619
                }
                break;
            }
            break;
          case '2':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(620, beg); //620
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(621, beg); //621
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(622, beg); //622
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(623, beg); //623
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(624, beg); //624
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(625, beg); //625
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return hopsGroup.map(627, beg); //627
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return hopsGroup.map(628, beg); //628
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return hopsGroup.map(629, beg); //629
                }
                break;
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
              return hopsGroup.map(630, beg); //630
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return relatedSymGroup4.map(65, beg); //65
            }
            break;
          case '6':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(667, beg); //667
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(668, beg); //668
                }
                break;
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '1' && bytes[++fldBeg] == '=') {
              return relatedSymGroup4.map(691, beg); //691
            }
            break;
        }
        break;
      case '7':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '9' && bytes[++fldBeg] == '=') {
              return relatedSymGroup4.map(739, beg); //739
            }
            break;
          case '4':
            fldBeg++;
            if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
              return relatedSymGroup4.map(740, beg); //740
            }
            break;
          case '6':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(762, beg); //762
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return underlyingSecuritySubType.map(version, bytes, beg); //763
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup4.map(764, beg); //764
                }
                break;
            }
            break;
        }
        break;
      case '8':
        fldBeg++;
        if(bytes[fldBeg] == '=') {
          return beginString.map(version, bytes, beg); //8
        } else {
          switch(bytes[fldBeg]) {
            case '1':
              fldBeg++;
              if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
                return underlyingPx.map(version, bytes, beg); //810
              }
              break;
            case '2':
              fldBeg++;
              if(bytes[fldBeg] == '7' && bytes[++fldBeg] == '=') {
                return relatedSymGroup4.map(827, beg); //827
              }
              break;
            case '6':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(864, beg); //864
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(865, beg); //865
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(866, beg); //866
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(867, beg); //867
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(868, beg); //868
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(869, beg); //869
                  }
                  break;
              }
              break;
            case '7':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(870, beg); //870
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(871, beg); //871
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(872, beg); //872
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(873, beg); //873
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(874, beg); //874
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(875, beg); //875
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(876, beg); //876
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingCPProgram.map(version, bytes, beg); //877
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingCPRegType.map(version, bytes, beg); //878
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingQty.map(version, bytes, beg); //879
                  }
                  break;
              }
              break;
            case '8':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingDirtyPrice.map(version, bytes, beg); //882
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingEndPrice.map(version, bytes, beg); //883
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingStartValue.map(version, bytes, beg); //884
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingCurrentValue.map(version, bytes, beg); //885
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingEndValue.map(version, bytes, beg); //886
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingStipsGroup.map(887, beg); //887
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingStipsGroup.map(888, beg); //888
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingStipsGroup.map(889, beg); //889
                  }
                  break;
              }
              break;
            case '9':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return signature.map(version, bytes, beg); //89
              } else {
                if(bytes[fldBeg] == '3' && bytes[++fldBeg] == '=') {
                  return lastFragment.map(version, bytes, beg); //893
                }
              }
              break;
          }
        }
        break;
      case '9':
        fldBeg++;
        if(bytes[fldBeg] == '=') {
          return bodyLength.map(version, bytes, beg); //9
        } else {
          switch(bytes[fldBeg]) {
            case '0':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return secureDataLen.map(version, bytes, beg); //90
              }
              break;
            case '1':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return secureData.map(version, bytes, beg); //91
              }
              break;
            case '3':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return signatureLength.map(version, bytes, beg); //93
              }
              break;
            case '4':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return underlyingStrikeCurrency.map(version, bytes, beg); //941
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(942, beg); //942
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(947, beg); //947
                  }
                  break;
              }
              break;
            case '5':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(955, beg); //955
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup4.map(956, beg); //956
                  }
                  break;
              }
              break;
            case '7':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return possResend.map(version, bytes, beg); //97
              }
              break;
          }
        }
        break;
    }
    return unknownField(fldBeg);
  }
}