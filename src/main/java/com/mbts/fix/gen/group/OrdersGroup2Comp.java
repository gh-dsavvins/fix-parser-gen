package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class OrdersGroup2Comp extends AbstractGroupComponent {

  private final ClOrdID clOrdID;
  private final SecondaryClOrdID secondaryClOrdID;
  private final CumQty cumQty;
  private final OrdStatus ordStatus;
  private final WorkingIndicator workingIndicator;
  private final LeavesQty leavesQty;
  private final CxlQty cxlQty;
  private final AvgPx avgPx;
  private final OrdRejReason ordRejReason;
  private final Text text;
  private final EncodedTextLen encodedTextLen;
  private final EncodedText encodedText;

  public OrdersGroup2Comp(AbstractMessage message) {
    super(message);
    clOrdID = new ClOrdID(message);
    secondaryClOrdID = new SecondaryClOrdID(message);
    cumQty = new CumQty(message);
    ordStatus = new OrdStatus(message);
    workingIndicator = new WorkingIndicator(message);
    leavesQty = new LeavesQty(message);
    cxlQty = new CxlQty(message);
    avgPx = new AvgPx(message);
    ordRejReason = new OrdRejReason(message);
    text = new Text(message);
    encodedTextLen = new EncodedTextLen(message);
    encodedText = new EncodedText(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 11 -> clOrdID.map(version, bytes, fldBeg);
      case 526 -> secondaryClOrdID.map(version, bytes, fldBeg);
      case 14 -> cumQty.map(version, bytes, fldBeg);
      case 39 -> ordStatus.map(version, bytes, fldBeg);
      case 636 -> workingIndicator.map(version, bytes, fldBeg);
      case 151 -> leavesQty.map(version, bytes, fldBeg);
      case 84 -> cxlQty.map(version, bytes, fldBeg);
      case 6 -> avgPx.map(version, bytes, fldBeg);
      case 103 -> ordRejReason.map(version, bytes, fldBeg);
      case 58 -> text.map(version, bytes, fldBeg);
      case 354 -> encodedTextLen.map(version, bytes, fldBeg);
      case 355 -> encodedText.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 11 -> clOrdID;
      case 526 -> secondaryClOrdID;
      case 14 -> cumQty;
      case 39 -> ordStatus;
      case 636 -> workingIndicator;
      case 151 -> leavesQty;
      case 84 -> cxlQty;
      case 6 -> avgPx;
      case 103 -> ordRejReason;
      case 58 -> text;
      case 354 -> encodedTextLen;
      case 355 -> encodedText;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = clOrdID.write(valBeg);
    valBeg = secondaryClOrdID.write(valBeg);
    valBeg = cumQty.write(valBeg);
    valBeg = ordStatus.write(valBeg);
    valBeg = workingIndicator.write(valBeg);
    valBeg = leavesQty.write(valBeg);
    valBeg = cxlQty.write(valBeg);
    valBeg = avgPx.write(valBeg);
    valBeg = ordRejReason.write(valBeg);
    valBeg = text.write(valBeg);
    valBeg = encodedTextLen.write(valBeg);
    valBeg = encodedText.write(valBeg);
    return valBeg; 
  }
}