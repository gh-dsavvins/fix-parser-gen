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
public class SecurityList extends AbstractMessage {

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
  private final TotNoRelatedSym totNoRelatedSym = new TotNoRelatedSym(this);
  private final LastFragment lastFragment = new LastFragment(this);
  private final RelatedSymGroup3 relatedSymGroup3 = new RelatedSymGroup3(this);
  private final SignatureLength signatureLength = new SignatureLength(this);
  private final Signature signature = new Signature(this);
  private final CheckSum checkSum = new CheckSum(this);

  public SecurityList() {
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
    valLim = totNoRelatedSym.write(valLim);
    valLim = lastFragment.write(valLim);
    valLim = relatedSymGroup3.write(valLim);
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
                    return relatedSymGroup3.map(106, beg); //106
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(107, beg); //107
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
                  return relatedSymGroup3.map(146, beg); //146
                }
                break;
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return relatedSymGroup3.map(15, beg); //15
            }
            break;
          case '6':
            fldBeg++;
            if(bytes[fldBeg] == '7' && bytes[++fldBeg] == '=') {
              return relatedSymGroup3.map(167, beg); //167
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
                  return relatedSymGroup3.map(200, beg); //200
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(201, beg); //201
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(202, beg); //202
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(206, beg); //206
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(207, beg); //207
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
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(218, beg); //218
                }
                break;
            }
            break;
          case '2':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return relatedSymGroup3.map(22, beg); //22
            } else {
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(220, beg); //220
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(221, beg); //221
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(222, beg); //222
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(223, beg); //223
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(224, beg); //224
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(225, beg); //225
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(226, beg); //226
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(227, beg); //227
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(228, beg); //228
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
                  return relatedSymGroup3.map(231, beg); //231
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(232, beg); //232
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(233, beg); //233
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(234, beg); //234
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(235, beg); //235
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(236, beg); //236
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(239, beg); //239
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
                  return relatedSymGroup3.map(240, beg); //240
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(241, beg); //241
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(242, beg); //242
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(243, beg); //243
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(244, beg); //244
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(245, beg); //245
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(246, beg); //246
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(247, beg); //247
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(248, beg); //248
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(249, beg); //249
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
                  return relatedSymGroup3.map(250, beg); //250
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(251, beg); //251
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(252, beg); //252
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(253, beg); //253
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(254, beg); //254
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(255, beg); //255
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(256, beg); //256
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(257, beg); //257
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
                  return relatedSymGroup3.map(305, beg); //305
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(306, beg); //306
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(307, beg); //307
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(308, beg); //308
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(309, beg); //309
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
                  return relatedSymGroup3.map(310, beg); //310
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(311, beg); //311
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(312, beg); //312
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(313, beg); //313
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(315, beg); //315
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(316, beg); //316
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(317, beg); //317
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(318, beg); //318
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
              return relatedSymGroup3.map(336, beg); //336
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
                    return relatedSymGroup3.map(348, beg); //348
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(349, beg); //349
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
                    return relatedSymGroup3.map(350, beg); //350
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(351, beg); //351
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(354, beg); //354
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(355, beg); //355
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
                  return relatedSymGroup3.map(362, beg); //362
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(363, beg); //363
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(364, beg); //364
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(365, beg); //365
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
                    return relatedSymGroup3.map(435, beg); //435
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(436, beg); //436
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
                  return relatedSymGroup3.map(454, beg); //454
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(455, beg); //455
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(456, beg); //456
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(457, beg); //457
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(458, beg); //458
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(459, beg); //459
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
                  return relatedSymGroup3.map(460, beg); //460
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(461, beg); //461
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(462, beg); //462
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(463, beg); //463
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
                  return relatedSymGroup3.map(470, beg); //470
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(471, beg); //471
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(472, beg); //472
                }
                break;
            }
            break;
          case '8':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return relatedSymGroup3.map(48, beg); //48
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
                  return relatedSymGroup3.map(541, beg); //541
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(542, beg); //542
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(543, beg); //543
                }
                break;
            }
            break;
          case '5':
            fldBeg++;
            if(bytes[fldBeg] == '=') {
              return relatedSymGroup3.map(55, beg); //55
            } else {
              switch(bytes[fldBeg]) {
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(555, beg); //555
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(556, beg); //556
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
              switch(bytes[fldBeg]) {
                case '0':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return securityRequestResult.map(version, bytes, beg); //560
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(561, beg); //561
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(562, beg); //562
                  }
                  break;
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
              return relatedSymGroup3.map(58, beg); //58
            } else {
              if(bytes[fldBeg] == '7' && bytes[++fldBeg] == '=') {
                return relatedSymGroup3.map(587, beg); //587
              }
            }
            break;
          case '9':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(592, beg); //592
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(593, beg); //593
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(594, beg); //594
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(595, beg); //595
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(596, beg); //596
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(597, beg); //597
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(598, beg); //598
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(599, beg); //599
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
                  return relatedSymGroup3.map(600, beg); //600
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(601, beg); //601
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(602, beg); //602
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(603, beg); //603
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(604, beg); //604
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(605, beg); //605
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(606, beg); //606
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(607, beg); //607
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(608, beg); //608
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(609, beg); //609
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
                  return relatedSymGroup3.map(610, beg); //610
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(611, beg); //611
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(612, beg); //612
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(613, beg); //613
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(614, beg); //614
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(615, beg); //615
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(616, beg); //616
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(617, beg); //617
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(618, beg); //618
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(619, beg); //619
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
                  return relatedSymGroup3.map(620, beg); //620
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(621, beg); //621
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(622, beg); //622
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(623, beg); //623
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(624, beg); //624
                }
                break;
              case '5':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(625, beg); //625
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
              return relatedSymGroup3.map(65, beg); //65
            }
            break;
          case '6':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(662, beg); //662
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(663, beg); //663
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(667, beg); //667
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(668, beg); //668
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
                  return relatedSymGroup3.map(676, beg); //676
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(677, beg); //677
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(678, beg); //678
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(679, beg); //679
                }
                break;
            }
            break;
          case '8':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '0':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(680, beg); //680
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(683, beg); //683
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(688, beg); //688
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(689, beg); //689
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
                  return relatedSymGroup3.map(690, beg); //690
                }
                break;
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(691, beg); //691
                }
                break;
              case '6':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(696, beg); //696
                }
                break;
              case '7':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(697, beg); //697
                }
                break;
              case '8':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(698, beg); //698
                }
                break;
              case '9':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(699, beg); //699
                }
                break;
            }
            break;
        }
        break;
      case '7':
        fldBeg++;
        switch(bytes[fldBeg]) {
          case '0':
            fldBeg++;
            if(bytes[fldBeg] == '1' && bytes[++fldBeg] == '=') {
              return relatedSymGroup3.map(701, beg); //701
            }
            break;
          case '1':
            fldBeg++;
            if(bytes[fldBeg] == '1' && bytes[++fldBeg] == '=') {
              return relatedSymGroup3.map(711, beg); //711
            }
            break;
          case '3':
            fldBeg++;
            if(bytes[fldBeg] == '9' && bytes[++fldBeg] == '=') {
              return relatedSymGroup3.map(739, beg); //739
            }
            break;
          case '4':
            fldBeg++;
            if(bytes[fldBeg] == '0' && bytes[++fldBeg] == '=') {
              return relatedSymGroup3.map(740, beg); //740
            }
            break;
          case '6':
            fldBeg++;
            switch(bytes[fldBeg]) {
              case '1':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(761, beg); //761
                }
                break;
              case '2':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(762, beg); //762
                }
                break;
              case '3':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(763, beg); //763
                }
                break;
              case '4':
                fldBeg++;
                if(bytes[fldBeg] == '=') {
                  return relatedSymGroup3.map(764, beg); //764
                }
                break;
            }
            break;
          case '8':
            fldBeg++;
            if(bytes[fldBeg] == '8' && bytes[++fldBeg] == '=') {
              return relatedSymGroup3.map(788, beg); //788
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
                return relatedSymGroup3.map(810, beg); //810
              }
              break;
            case '2':
              fldBeg++;
              if(bytes[fldBeg] == '7' && bytes[++fldBeg] == '=') {
                return relatedSymGroup3.map(827, beg); //827
              }
              break;
            case '6':
              fldBeg++;
              switch(bytes[fldBeg]) {
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(864, beg); //864
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(865, beg); //865
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(866, beg); //866
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(867, beg); //867
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(868, beg); //868
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(869, beg); //869
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
                    return relatedSymGroup3.map(870, beg); //870
                  }
                  break;
                case '1':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(871, beg); //871
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(872, beg); //872
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(873, beg); //873
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(874, beg); //874
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(875, beg); //875
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(876, beg); //876
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(877, beg); //877
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(878, beg); //878
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(879, beg); //879
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
                    return relatedSymGroup3.map(882, beg); //882
                  }
                  break;
                case '3':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(883, beg); //883
                  }
                  break;
                case '4':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(884, beg); //884
                  }
                  break;
                case '5':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(885, beg); //885
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(886, beg); //886
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(887, beg); //887
                  }
                  break;
                case '8':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(888, beg); //888
                  }
                  break;
                case '9':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(889, beg); //889
                  }
                  break;
              }
              break;
            case '9':
              fldBeg++;
              if(bytes[fldBeg] == '=') {
                return signature.map(version, bytes, beg); //89
              } else {
                switch(bytes[fldBeg]) {
                  case '3':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return lastFragment.map(version, bytes, beg); //893
                    }
                    break;
                  case '8':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return relatedSymGroup3.map(898, beg); //898
                    }
                    break;
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
              } else {
                switch(bytes[fldBeg]) {
                  case '3':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return relatedSymGroup3.map(913, beg); //913
                    }
                    break;
                  case '4':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return relatedSymGroup3.map(914, beg); //914
                    }
                    break;
                  case '5':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return relatedSymGroup3.map(915, beg); //915
                    }
                    break;
                  case '6':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return relatedSymGroup3.map(916, beg); //916
                    }
                    break;
                  case '7':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return relatedSymGroup3.map(917, beg); //917
                    }
                    break;
                  case '8':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return relatedSymGroup3.map(918, beg); //918
                    }
                    break;
                  case '9':
                    fldBeg++;
                    if(bytes[fldBeg] == '=') {
                      return relatedSymGroup3.map(919, beg); //919
                    }
                    break;
                }
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
                    return relatedSymGroup3.map(941, beg); //941
                  }
                  break;
                case '2':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(942, beg); //942
                  }
                  break;
                case '7':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(947, beg); //947
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
                    return relatedSymGroup3.map(955, beg); //955
                  }
                  break;
                case '6':
                  fldBeg++;
                  if(bytes[fldBeg] == '=') {
                    return relatedSymGroup3.map(956, beg); //956
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