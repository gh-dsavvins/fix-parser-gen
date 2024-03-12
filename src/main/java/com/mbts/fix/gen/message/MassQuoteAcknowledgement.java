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
public class MassQuoteAcknowledgement extends AbstractMessage {

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
  private final QuoteReqID quoteReqID = new QuoteReqID(this);
  private final QuoteID quoteID = new QuoteID(this);
  private final QuoteStatus quoteStatus = new QuoteStatus(this);
  private final QuoteRejectReason quoteRejectReason = new QuoteRejectReason(this);
  private final QuoteResponseLevel quoteResponseLevel = new QuoteResponseLevel(this);
  private final QuoteType quoteType = new QuoteType(this);
  private final PartyIDsGroup partyIDsGroup = new PartyIDsGroup(this);
  private final Account account = new Account(this);
  private final AcctIDSource acctIDSource = new AcctIDSource(this);
  private final AccountType accountType = new AccountType(this);
  private final Text text = new Text(this);
  private final EncodedTextLen encodedTextLen = new EncodedTextLen(this);
  private final EncodedText encodedText = new EncodedText(this);
  private final QuoteSetsGroup quoteSetsGroup = new QuoteSetsGroup(this);
  private final SignatureLength signatureLength = new SignatureLength(this);
  private final Signature signature = new Signature(this);
  private final CheckSum checkSum = new CheckSum(this);

  public MassQuoteAcknowledgement() {
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
    valLim = quoteReqID.write(valLim);
    valLim = quoteID.write(valLim);
    valLim = quoteStatus.write(valLim);
    valLim = quoteRejectReason.write(valLim);
    valLim = quoteResponseLevel.write(valLim);
    valLim = quoteType.write(valLim);
    valLim = partyIDsGroup.write(valLim);
    valLim = account.write(valLim);
    valLim = acctIDSource.write(valLim);
    valLim = accountType.write(valLim);
    valLim = text.write(valLim);
    valLim = encodedTextLen.write(valLim);
    valLim = encodedText.write(valLim);
    valLim = quoteSetsGroup.write(valLim);
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
          return account.map(version, bytes, beg); //1
        } else {
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
                      return quoteSetsGroup.map(106, beg); //106
                    }
                    break;
                  case '7':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return quoteSetsGroup.map(107, beg); //107
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
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteID.map(version, bytes, beg); //117
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
            case '3':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteReqID.map(version, bytes, beg); //131
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(132, beg); //132
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(133, beg); //133
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(134, beg); //134
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(135, beg); //135
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
                return quoteSetsGroup.map(15, beg); //15
              }
              break;
            case '6':
              fldBeg++;
              if(bytes[fldBeg] == '7' && bytes[++fldBeg] == '=') {
                return quoteSetsGroup.map(167, beg); //167
              }
              break;
            case '8':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(188, beg); //188
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(189, beg); //189
                  }
                  break;
              }
              break;
            case '9':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(190, beg); //190
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(191, beg); //191
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(192, beg); //192
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(193, beg); //193
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
                  return quoteSetsGroup.map(200, beg); //200
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(201, beg); //201
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(202, beg); //202
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(206, beg); //206
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(207, beg); //207
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
              return quoteSetsGroup.map(22, beg); //22
            } else {
              switch(bytes[fldBeg]) {
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(223, beg); //223
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(224, beg); //224
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(225, beg); //225
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(226, beg); //226
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(227, beg); //227
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(228, beg); //228
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
                  return quoteSetsGroup.map(231, beg); //231
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(239, beg); //239
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
                  return quoteSetsGroup.map(240, beg); //240
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(241, beg); //241
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(242, beg); //242
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(243, beg); //243
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(244, beg); //244
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(245, beg); //245
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(246, beg); //246
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(247, beg); //247
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(248, beg); //248
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(249, beg); //249
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
                  return quoteSetsGroup.map(250, beg); //250
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(251, beg); //251
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(252, beg); //252
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(253, beg); //253
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(254, beg); //254
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(255, beg); //255
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(256, beg); //256
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(257, beg); //257
                }
                break;
            }
            break;
          case '9':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(295, beg); //295
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(296, beg); //296
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteStatus.map(version, bytes, beg); //297
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(299, beg); //299
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
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteRejectReason.map(version, bytes, beg); //300
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteResponseLevel.map(version, bytes, beg); //301
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(302, beg); //302
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(304, beg); //304
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(305, beg); //305
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(306, beg); //306
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(307, beg); //307
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(308, beg); //308
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(309, beg); //309
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
                  return quoteSetsGroup.map(310, beg); //310
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(311, beg); //311
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(312, beg); //312
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(313, beg); //313
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(315, beg); //315
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(316, beg); //316
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(317, beg); //317
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(318, beg); //318
                }
                break;
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '6' && bytes[++fldBeg] == '=') {
              return quoteSetsGroup.map(336, beg); //336
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
                    return quoteSetsGroup.map(348, beg); //348
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(349, beg); //349
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
                    return quoteSetsGroup.map(350, beg); //350
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(351, beg); //351
                  }
                  break;
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
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(362, beg); //362
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(363, beg); //363
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(364, beg); //364
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(365, beg); //365
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(368, beg); //368
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
        }
        break;
      case '4':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '0':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return quoteSetsGroup.map(40, beg); //40
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return possDupFlag.map(version, bytes, beg); //43
            } else {
              switch(bytes[fldBeg]) {
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(435, beg); //435
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(436, beg); //436
                  }
                  break;
              }
            }
            break;
          case '4':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return partyIDsGroup.map(447, beg); //447
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return partyIDsGroup.map(448, beg); //448
                }
                break;
            }
            break;
          case '5':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return partyIDsGroup.map(452, beg); //452
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return partyIDsGroup.map(453, beg); //453
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(454, beg); //454
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(455, beg); //455
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(456, beg); //456
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(457, beg); //457
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(458, beg); //458
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(459, beg); //459
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
                  return quoteSetsGroup.map(460, beg); //460
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(461, beg); //461
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(462, beg); //462
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(463, beg); //463
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
                  return quoteSetsGroup.map(470, beg); //470
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(471, beg); //471
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(472, beg); //472
                }
                break;
            }
            break;
          case '8':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return quoteSetsGroup.map(48, beg); //48
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
            } else {
              if(bytes[fldBeg] == '3' && bytes[++fldBeg] == '=') {
                return partyIDsGroup.map(523, beg); //523
              }
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '7' && bytes[++fldBeg] == '=') {
              return quoteType.map(version, bytes, beg); //537
            }
            break;
          case '4':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(541, beg); //541
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(542, beg); //542
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(543, beg); //543
                }
                break;
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return quoteSetsGroup.map(55, beg); //55
            } else {
              switch(bytes[fldBeg]) {
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(555, beg); //555
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(556, beg); //556
                  }
                  break;
              }
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
            } else {
              if(bytes[fldBeg] == '1' && bytes[++fldBeg] == '=') {
                return accountType.map(version, bytes, beg); //581
              }
            }
            break;
          case '9':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(592, beg); //592
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(593, beg); //593
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(594, beg); //594
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(595, beg); //595
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(596, beg); //596
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(597, beg); //597
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(598, beg); //598
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(599, beg); //599
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
            if(bytes[fldBeg] == '=') {
              return quoteSetsGroup.map(60, beg); //60
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(600, beg); //600
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(601, beg); //601
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(602, beg); //602
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(603, beg); //603
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(604, beg); //604
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(605, beg); //605
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(606, beg); //606
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(607, beg); //607
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(608, beg); //608
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(609, beg); //609
                  }
                  break;
              }
            }
            break;
          case '1':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(610, beg); //610
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(611, beg); //611
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(612, beg); //612
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(613, beg); //613
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(614, beg); //614
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(615, beg); //615
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(616, beg); //616
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(617, beg); //617
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(618, beg); //618
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(619, beg); //619
                }
                break;
            }
            break;
          case '2':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return quoteSetsGroup.map(62, beg); //62
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(620, beg); //620
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(621, beg); //621
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(622, beg); //622
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(623, beg); //623
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(624, beg); //624
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(625, beg); //625
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
            }
            break;
          case '3':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return hopsGroup.map(630, beg); //630
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(631, beg); //631
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(632, beg); //632
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(633, beg); //633
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(634, beg); //634
                }
                break;
            }
            break;
          case '4':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return quoteSetsGroup.map(64, beg); //64
            } else {
              switch(bytes[fldBeg]) {
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(642, beg); //642
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(643, beg); //643
                  }
                  break;
              }
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return quoteSetsGroup.map(65, beg); //65
            }
            break;
          case '6':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return acctIDSource.map(version, bytes, beg); //660
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(667, beg); //667
                }
                break;
            }
            break;
          case '9':
            fldBeg++;
            if(bytes[fldBeg] == '1' && bytes[++fldBeg] == '=') {
              return quoteSetsGroup.map(691, beg); //691
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
              return quoteSetsGroup.map(739, beg); //739
            }
            break;
          case '4':
            fldBeg++;
            if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
              return quoteSetsGroup.map(740, beg); //740
            }
            break;
          case '6':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(762, beg); //762
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(763, beg); //763
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return quoteSetsGroup.map(764, beg); //764
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
            case '0':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return partyIDsGroup.map(802, beg); //802
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return partyIDsGroup.map(803, beg); //803
                  }
                  break;
              }
              break;
            case '1':
              fldBeg++;
              if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
                return quoteSetsGroup.map(810, beg); //810
              }
              break;
            case '6':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(864, beg); //864
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(865, beg); //865
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(866, beg); //866
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(867, beg); //867
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(868, beg); //868
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
                    return quoteSetsGroup.map(873, beg); //873
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(874, beg); //874
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(875, beg); //875
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(876, beg); //876
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(877, beg); //877
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(878, beg); //878
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(879, beg); //879
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
                    return quoteSetsGroup.map(882, beg); //882
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(883, beg); //883
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(884, beg); //884
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(885, beg); //885
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(886, beg); //886
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(887, beg); //887
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(888, beg); //888
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(889, beg); //889
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
                  return quoteSetsGroup.map(893, beg); //893
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
                    return quoteSetsGroup.map(941, beg); //941
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(942, beg); //942
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(947, beg); //947
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
                    return quoteSetsGroup.map(955, beg); //955
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return quoteSetsGroup.map(956, beg); //956
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