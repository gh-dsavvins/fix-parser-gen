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
public class NewOrderList extends AbstractMessage {

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
  private final ListID listID = new ListID(this);
  private final BidID bidID = new BidID(this);
  private final ClientBidID clientBidID = new ClientBidID(this);
  private final ProgRptReqs progRptReqs = new ProgRptReqs(this);
  private final BidType bidType = new BidType(this);
  private final ProgPeriodInterval progPeriodInterval = new ProgPeriodInterval(this);
  private final CancellationRights cancellationRights = new CancellationRights(this);
  private final MoneyLaunderingStatus moneyLaunderingStatus = new MoneyLaunderingStatus(this);
  private final RegistID registID = new RegistID(this);
  private final ListExecInstType listExecInstType = new ListExecInstType(this);
  private final ListExecInst listExecInst = new ListExecInst(this);
  private final EncodedListExecInstLen encodedListExecInstLen = new EncodedListExecInstLen(this);
  private final EncodedListExecInst encodedListExecInst = new EncodedListExecInst(this);
  private final AllowableOneSidednessPct allowableOneSidednessPct = new AllowableOneSidednessPct(this);
  private final AllowableOneSidednessValue allowableOneSidednessValue = new AllowableOneSidednessValue(this);
  private final AllowableOneSidednessCurr allowableOneSidednessCurr = new AllowableOneSidednessCurr(this);
  private final TotNoOrders totNoOrders = new TotNoOrders(this);
  private final LastFragment lastFragment = new LastFragment(this);
  private final OrdersGroup ordersGroup = new OrdersGroup(this);
  private final SignatureLength signatureLength = new SignatureLength(this);
  private final Signature signature = new Signature(this);
  private final CheckSum checkSum = new CheckSum(this);

  public NewOrderList() {
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
    valLim = listID.write(valLim);
    valLim = bidID.write(valLim);
    valLim = clientBidID.write(valLim);
    valLim = progRptReqs.write(valLim);
    valLim = bidType.write(valLim);
    valLim = progPeriodInterval.write(valLim);
    valLim = cancellationRights.write(valLim);
    valLim = moneyLaunderingStatus.write(valLim);
    valLim = registID.write(valLim);
    valLim = listExecInstType.write(valLim);
    valLim = listExecInst.write(valLim);
    valLim = encodedListExecInstLen.write(valLim);
    valLim = encodedListExecInst.write(valLim);
    valLim = allowableOneSidednessPct.write(valLim);
    valLim = allowableOneSidednessValue.write(valLim);
    valLim = allowableOneSidednessCurr.write(valLim);
    valLim = totNoOrders.write(valLim);
    valLim = lastFragment.write(valLim);
    valLim = ordersGroup.write(valLim);
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
          return ordersGroup.map(1, beg); //1
        } else {
          switch(bytes[fldBeg]) {
            case '0':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return checkSum.map(version, bytes, beg); //10
              } else {
                switch(bytes[fldBeg]) {
                  case '0':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup.map(100, beg); //100
                    }
                    break;
                  case '6':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup.map(106, beg); //106
                    }
                    break;
                  case '7':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup.map(107, beg); //107
                    }
                    break;
                }
              }
              break;
            case '1':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return ordersGroup.map(11, beg); //11
              } else {
                switch(bytes[fldBeg]) {
                  case '0':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup.map(110, beg); //110
                    }
                    break;
                  case '1':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup.map(111, beg); //111
                    }
                    break;
                  case '4':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup.map(114, beg); //114
                    }
                    break;
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
                  case '7':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup.map(117, beg); //117
                    }
                    break;
                }
              }
              break;
            case '2':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return ordersGroup.map(12, beg); //12
              } else {
                switch(bytes[fldBeg]) {
                  case '0':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup.map(120, beg); //120
                    }
                    break;
                  case '1':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup.map(121, beg); //121
                    }
                    break;
                  case '2':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return origSendingTime.map(version, bytes, beg); //122
                    }
                    break;
                  case '6':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup.map(126, beg); //126
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
              }
              break;
            case '3':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return ordersGroup.map(13, beg); //13
              }
              break;
            case '4':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(140, beg); //140
                  }
                  break;
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
                return ordersGroup.map(15, beg); //15
              } else {
                if(bytes[fldBeg] == '2' && bytes[++fldBeg] == '=') {
                  return ordersGroup.map(152, beg); //152
                }
              }
              break;
            case '6':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(160, beg); //160
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(167, beg); //167
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(168, beg); //168
                  }
                  break;
              }
              break;
            case '8':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return ordersGroup.map(18, beg); //18
              }
              break;
            case '9':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(192, beg); //192
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(193, beg); //193
                  }
                  break;
              }
              break;
          }
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
                  return ordersGroup.map(200, beg); //200
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(201, beg); //201
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(202, beg); //202
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(203, beg); //203
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(206, beg); //206
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(207, beg); //207
                }
                break;
            }
            break;
          case '1':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(21, beg); //21
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(210, beg); //210
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(211, beg); //211
                  }
                  break;
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
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(218, beg); //218
                  }
                  break;
              }
            }
            break;
          case '2':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(22, beg); //22
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(220, beg); //220
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(221, beg); //221
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(222, beg); //222
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(223, beg); //223
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(224, beg); //224
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(225, beg); //225
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(226, beg); //226
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(227, beg); //227
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(228, beg); //228
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(229, beg); //229
                  }
                  break;
              }
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(23, beg); //23
            } else {
              switch(bytes[fldBeg]) {
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(231, beg); //231
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(232, beg); //232
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(233, beg); //233
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(234, beg); //234
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(235, beg); //235
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(236, beg); //236
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(239, beg); //239
                  }
                  break;
              }
            }
            break;
          case '4':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(240, beg); //240
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(241, beg); //241
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(242, beg); //242
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(243, beg); //243
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(244, beg); //244
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(245, beg); //245
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(246, beg); //246
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(247, beg); //247
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
                  return ordersGroup.map(255, beg); //255
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(256, beg); //256
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
                  return ordersGroup.map(305, beg); //305
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(306, beg); //306
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(307, beg); //307
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(308, beg); //308
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(309, beg); //309
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
                  return ordersGroup.map(310, beg); //310
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(311, beg); //311
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(312, beg); //312
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(313, beg); //313
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(315, beg); //315
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(316, beg); //316
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(317, beg); //317
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(318, beg); //318
                }
                break;
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '6' && bytes[++fldBeg] == '=') {
              return ordersGroup.map(336, beg); //336
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
                    return ordersGroup.map(348, beg); //348
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(349, beg); //349
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
                    return ordersGroup.map(350, beg); //350
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(351, beg); //351
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return encodedListExecInstLen.map(version, bytes, beg); //352
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return encodedListExecInst.map(version, bytes, beg); //353
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(354, beg); //354
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(355, beg); //355
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
                  return ordersGroup.map(362, beg); //362
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(363, beg); //363
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(364, beg); //364
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(365, beg); //365
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
          case '7':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(376, beg); //376
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(377, beg); //377
                }
                break;
            }
            break;
          case '8':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(38, beg); //38
            } else {
              switch(bytes[fldBeg]) {
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(386, beg); //386
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(388, beg); //388
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(389, beg); //389
                  }
                  break;
              }
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
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return bidType.map(version, bytes, beg); //394
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
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(40, beg); //40
            } else {
              if(bytes[fldBeg] == '1' && bytes[++fldBeg] == '=') {
                return ordersGroup.map(401, beg); //401
              }
            }
            break;
          case '1':
            fldBeg++;
            switch(bytes[fldBeg]) {
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
            }
            break;
          case '2':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(423, beg); //423
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(427, beg); //427
                }
                break;
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return possDupFlag.map(version, bytes, beg); //43
            } else {
              switch(bytes[fldBeg]) {
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(432, beg); //432
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return listExecInstType.map(version, bytes, beg); //433
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(435, beg); //435
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(436, beg); //436
                  }
                  break;
              }
            }
            break;
          case '4':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(44, beg); //44
            } else {
              switch(bytes[fldBeg]) {
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(447, beg); //447
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(448, beg); //448
                  }
                  break;
              }
            }
            break;
          case '5':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(452, beg); //452
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(453, beg); //453
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(454, beg); //454
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(455, beg); //455
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(456, beg); //456
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(457, beg); //457
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(458, beg); //458
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(459, beg); //459
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
                  return ordersGroup.map(460, beg); //460
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(461, beg); //461
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(462, beg); //462
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(463, beg); //463
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(467, beg); //467
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(468, beg); //468
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(469, beg); //469
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
                  return ordersGroup.map(470, beg); //470
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(471, beg); //471
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(472, beg); //472
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(479, beg); //479
                }
                break;
            }
            break;
          case '8':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(48, beg); //48
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return cancellationRights.map(version, bytes, beg); //480
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return moneyLaunderingStatus.map(version, bytes, beg); //481
                  }
                  break;
              }
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return senderCompID.map(version, bytes, beg); //49
            } else {
              switch(bytes[fldBeg]) {
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(494, beg); //494
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(497, beg); //497
                  }
                  break;
              }
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
          case '1':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return registID.map(version, bytes, beg); //513
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(516, beg); //516
                }
                break;
            }
            break;
          case '2':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return sendingTime.map(version, bytes, beg); //52
            } else {
              switch(bytes[fldBeg]) {
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(523, beg); //523
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(524, beg); //524
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(525, beg); //525
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(526, beg); //526
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(528, beg); //528
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(529, beg); //529
                  }
                  break;
              }
            }
            break;
          case '3':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(538, beg); //538
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(539, beg); //539
                }
                break;
            }
            break;
          case '4':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(54, beg); //54
            } else {
              switch(bytes[fldBeg]) {
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(541, beg); //541
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(542, beg); //542
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(543, beg); //543
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(544, beg); //544
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(545, beg); //545
                  }
                  break;
              }
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(55, beg); //55
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
              return ordersGroup.map(58, beg); //58
            } else {
              switch(bytes[fldBeg]) {
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(581, beg); //581
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(582, beg); //582
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(583, beg); //583
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(589, beg); //589
                  }
                  break;
              }
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(59, beg); //59
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(590, beg); //590
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(591, beg); //591
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(592, beg); //592
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(593, beg); //593
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(594, beg); //594
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(595, beg); //595
                  }
                  break;
              }
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
              return ordersGroup.map(60, beg); //60
            }
            break;
          case '2':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(625, beg); //625
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
              return ordersGroup.map(63, beg); //63
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return hopsGroup.map(630, beg); //630
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(635, beg); //635
                  }
                  break;
              }
            }
            break;
          case '4':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(64, beg); //64
            } else {
              if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
                return ordersGroup.map(640, beg); //640
              }
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(65, beg); //65
            }
            break;
          case '6':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return listID.map(version, bytes, beg); //66
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(660, beg); //660
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(661, beg); //661
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(662, beg); //662
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(663, beg); //663
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(667, beg); //667
                  }
                  break;
              }
            }
            break;
          case '7':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(67, beg); //67
            }
            break;
          case '8':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return totNoOrders.map(version, bytes, beg); //68
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return listExecInst.map(version, bytes, beg); //69
            } else {
              switch(bytes[fldBeg]) {
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(691, beg); //691
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(696, beg); //696
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(697, beg); //697
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(698, beg); //698
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(699, beg); //699
                  }
                  break;
              }
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
              return ordersGroup.map(70, beg); //70
            } else {
              if(bytes[fldBeg] == '1' && bytes[++fldBeg] == '=') {
                return ordersGroup.map(701, beg); //701
              }
            }
            break;
          case '1':
            fldBeg++;
            if(bytes[fldBeg] == '1' && bytes[++fldBeg] == '=') {
              return ordersGroup.map(711, beg); //711
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(73, beg); //73
            } else {
              if(bytes[fldBeg] == '6' && bytes[++fldBeg] == '=') {
                return ordersGroup.map(736, beg); //736
              }
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(75, beg); //75
            }
            break;
          case '6':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(761, beg); //761
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(762, beg); //762
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return ordersGroup.map(763, beg); //763
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return allowableOneSidednessPct.map(version, bytes, beg); //765
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return allowableOneSidednessValue.map(version, bytes, beg); //766
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return allowableOneSidednessCurr.map(version, bytes, beg); //767
                }
                break;
            }
            break;
          case '7':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(77, beg); //77
            } else {
              if(bytes[fldBeg] == '5' && bytes[++fldBeg] == '=') {
                return ordersGroup.map(775, beg); //775
              }
            }
            break;
          case '8':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(78, beg); //78
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return ordersGroup.map(79, beg); //79
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
            case '0':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return ordersGroup.map(80, beg); //80
              } else {
                switch(bytes[fldBeg]) {
                  case '2':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup.map(802, beg); //802
                    }
                    break;
                  case '3':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup.map(803, beg); //803
                    }
                    break;
                  case '4':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup.map(804, beg); //804
                    }
                    break;
                  case '5':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return ordersGroup.map(805, beg); //805
                    }
                    break;
                }
              }
              break;
            case '1':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return ordersGroup.map(81, beg); //81
              } else {
                if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
                  return ordersGroup.map(810, beg); //810
                }
              }
              break;
            case '3':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(835, beg); //835
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(836, beg); //836
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(837, beg); //837
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(838, beg); //838
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
                    return ordersGroup.map(840, beg); //840
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(841, beg); //841
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(842, beg); //842
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(843, beg); //843
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(844, beg); //844
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(846, beg); //846
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(847, beg); //847
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(848, beg); //848
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(849, beg); //849
                  }
                  break;
              }
              break;
            case '5':
              fldBeg++;
              if(bytes[fldBeg] == '4' && bytes[++fldBeg] == '=') {
                return ordersGroup.map(854, beg); //854
              }
              break;
            case '6':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(864, beg); //864
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(865, beg); //865
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(866, beg); //866
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(867, beg); //867
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(868, beg); //868
                  }
                  break;
              }
              break;
            case '7':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(873, beg); //873
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(874, beg); //874
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(875, beg); //875
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(876, beg); //876
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(877, beg); //877
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(878, beg); //878
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(879, beg); //879
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
                    return ordersGroup.map(882, beg); //882
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(883, beg); //883
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(884, beg); //884
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(885, beg); //885
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(886, beg); //886
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(887, beg); //887
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(888, beg); //888
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(889, beg); //889
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
                    return ordersGroup.map(941, beg); //941
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return ordersGroup.map(947, beg); //947
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
            case '9':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return ordersGroup.map(99, beg); //99
              }
              break;
          }
        }
        break;
    }
    return unknownField(fldBeg);
  }
}