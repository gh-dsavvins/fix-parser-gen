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
public class BidRequest extends AbstractMessage {

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
  private final BidID bidID = new BidID(this);
  private final ClientBidID clientBidID = new ClientBidID(this);
  private final BidRequestTransType bidRequestTransType = new BidRequestTransType(this);
  private final ListName listName = new ListName(this);
  private final TotNoRelatedSym totNoRelatedSym = new TotNoRelatedSym(this);
  private final BidType bidType = new BidType(this);
  private final NumTickets numTickets = new NumTickets(this);
  private final Currency currency = new Currency(this);
  private final SideValue1 sideValue1 = new SideValue1(this);
  private final SideValue2 sideValue2 = new SideValue2(this);
  private final BidDescriptorsGroup bidDescriptorsGroup = new BidDescriptorsGroup(this);
  private final BidComponentsGroup bidComponentsGroup = new BidComponentsGroup(this);
  private final LiquidityIndType liquidityIndType = new LiquidityIndType(this);
  private final WtAverageLiquidity wtAverageLiquidity = new WtAverageLiquidity(this);
  private final ExchangeForPhysical exchangeForPhysical = new ExchangeForPhysical(this);
  private final OutMainCntryUIndex outMainCntryUIndex = new OutMainCntryUIndex(this);
  private final CrossPercent crossPercent = new CrossPercent(this);
  private final ProgRptReqs progRptReqs = new ProgRptReqs(this);
  private final ProgPeriodInterval progPeriodInterval = new ProgPeriodInterval(this);
  private final IncTaxInd incTaxInd = new IncTaxInd(this);
  private final ForexReq forexReq = new ForexReq(this);
  private final NumBidders numBidders = new NumBidders(this);
  private final TradeDate tradeDate = new TradeDate(this);
  private final BidTradeType bidTradeType = new BidTradeType(this);
  private final BasisPxType basisPxType = new BasisPxType(this);
  private final StrikeTime strikeTime = new StrikeTime(this);
  private final Text text = new Text(this);
  private final EncodedTextLen encodedTextLen = new EncodedTextLen(this);
  private final EncodedText encodedText = new EncodedText(this);
  private final SignatureLength signatureLength = new SignatureLength(this);
  private final Signature signature = new Signature(this);
  private final CheckSum checkSum = new CheckSum(this);

  public BidRequest() {
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
    valLim = bidID.write(valLim);
    valLim = clientBidID.write(valLim);
    valLim = bidRequestTransType.write(valLim);
    valLim = listName.write(valLim);
    valLim = totNoRelatedSym.write(valLim);
    valLim = bidType.write(valLim);
    valLim = numTickets.write(valLim);
    valLim = currency.write(valLim);
    valLim = sideValue1.write(valLim);
    valLim = sideValue2.write(valLim);
    valLim = bidDescriptorsGroup.write(valLim);
    valLim = bidComponentsGroup.write(valLim);
    valLim = liquidityIndType.write(valLim);
    valLim = wtAverageLiquidity.write(valLim);
    valLim = exchangeForPhysical.write(valLim);
    valLim = outMainCntryUIndex.write(valLim);
    valLim = crossPercent.write(valLim);
    valLim = progRptReqs.write(valLim);
    valLim = progPeriodInterval.write(valLim);
    valLim = incTaxInd.write(valLim);
    valLim = forexReq.write(valLim);
    valLim = numBidders.write(valLim);
    valLim = tradeDate.write(valLim);
    valLim = bidTradeType.write(valLim);
    valLim = basisPxType.write(valLim);
    valLim = strikeTime.write(valLim);
    valLim = text.write(valLim);
    valLim = encodedTextLen.write(valLim);
    valLim = encodedText.write(valLim);
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
        if(bytes[fldBeg] == '=') {
          return bidComponentsGroup.map(1, beg); //1
        } else {
          switch(bytes[fldBeg]) {
            case '0':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return checkSum.map(version, bytes, beg); //10
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
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return forexReq.map(version, bytes, beg); //121
                  }
                  break;
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
              }
              break;
            case '5':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return currency.map(version, bytes, beg); //15
              }
              break;
          }
        }
        break;
      case '2':
        fldBeg++;
        switch(bytes[fldBeg]) {
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
        }
        break;
      case '3':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '6' && bytes[++fldBeg] == '=') {
              return bidComponentsGroup.map(336, beg); //336
            }
            break;
          case '4':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return msgSeqNum.map(version, bytes, beg); //34
            } else {
              if(bytes[fldBeg] == '7' && bytes[++fldBeg] == '=') {
                return messageEncoding.map(version, bytes, beg); //347
              }
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return msgType.map(version, bytes, beg); //35
            } else {
              switch(bytes[fldBeg]) {
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return encodedTextLen.map(version, bytes, beg); //354
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return encodedText.map(version, bytes, beg); //355
                  }
                  break;
              }
            }
            break;
          case '6':
            fldBeg++;
            if(bytes[fldBeg] == '9' && bytes[++fldBeg] == '=') {
              return lastMsgSeqNumProcessed.map(version, bytes, beg); //369
            }
            break;
          case '7':
            fldBeg++;
            if(bytes[fldBeg] == '4' && bytes[++fldBeg] == '=') {
              return bidRequestTransType.map(version, bytes, beg); //374
            }
            break;
          case '9':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidID.map(version, bytes, beg); //390
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return clientBidID.map(version, bytes, beg); //391
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return listName.map(version, bytes, beg); //392
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return totNoRelatedSym.map(version, bytes, beg); //393
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidType.map(version, bytes, beg); //394
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return numTickets.map(version, bytes, beg); //395
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return sideValue1.map(version, bytes, beg); //396
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return sideValue2.map(version, bytes, beg); //397
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidDescriptorsGroup.map(398, beg); //398
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidDescriptorsGroup.map(399, beg); //399
                }
                break;
            }
            break;
        }
        break;
      case '4':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '0':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidDescriptorsGroup.map(400, beg); //400
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidDescriptorsGroup.map(401, beg); //401
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidDescriptorsGroup.map(402, beg); //402
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidDescriptorsGroup.map(403, beg); //403
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidDescriptorsGroup.map(404, beg); //404
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidDescriptorsGroup.map(405, beg); //405
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidDescriptorsGroup.map(406, beg); //406
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidDescriptorsGroup.map(407, beg); //407
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidDescriptorsGroup.map(408, beg); //408
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return liquidityIndType.map(version, bytes, beg); //409
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
                  return wtAverageLiquidity.map(version, bytes, beg); //410
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return exchangeForPhysical.map(version, bytes, beg); //411
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return outMainCntryUIndex.map(version, bytes, beg); //412
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return crossPercent.map(version, bytes, beg); //413
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return progRptReqs.map(version, bytes, beg); //414
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return progPeriodInterval.map(version, bytes, beg); //415
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return incTaxInd.map(version, bytes, beg); //416
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return numBidders.map(version, bytes, beg); //417
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidTradeType.map(version, bytes, beg); //418
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return basisPxType.map(version, bytes, beg); //419
                }
                break;
            }
            break;
          case '2':
            fldBeg++;
            if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
              return bidComponentsGroup.map(420, beg); //420
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return possDupFlag.map(version, bytes, beg); //43
            } else {
              if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
                return bidComponentsGroup.map(430, beg); //430
              }
            }
            break;
          case '4':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidDescriptorsGroup.map(441, beg); //441
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return strikeTime.map(version, bytes, beg); //443
                }
                break;
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
            if(bytes[fldBeg] == '=') {
              return bidComponentsGroup.map(54, beg); //54
            }
            break;
          case '6':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return targetCompID.map(version, bytes, beg); //56
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
              return text.map(version, bytes, beg); //58
            }
            break;
        }
        break;
      case '6':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '2':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidComponentsGroup.map(625, beg); //625
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
            if(bytes[fldBeg] == '=') {
              return bidComponentsGroup.map(63, beg); //63
            } else {
              if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
                return hopsGroup.map(630, beg); //630
              }
            }
            break;
          case '4':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return bidComponentsGroup.map(64, beg); //64
            }
            break;
          case '6':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return bidComponentsGroup.map(66, beg); //66
            } else {
              if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
                return bidComponentsGroup.map(660, beg); //660
              }
            }
            break;
        }
        break;
      case '7':
        fldBeg++;
        if(bytes[fldBeg] == '5' && bytes[++fldBeg] == '=') {
          return tradeDate.map(version, bytes, beg); //75
        }
        break;
      case '8':
        fldBeg++;
        if(bytes[fldBeg] == '=') {
          return beginString.map(version, bytes, beg); //8
        } else {
          if(bytes[fldBeg] == '9' && bytes[++fldBeg] == '=') {
            return signature.map(version, bytes, beg); //89
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