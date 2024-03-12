package com.mbts.fix.gen.group;

import com.mbts.fix.message.AbstractGroupComponent;
import com.mbts.fix.message.AbstractMessage;
import com.mbts.fix.gen.field.*;
import lombok.Getter;
import com.mbts.fix.api.*;

@Getter
@SuppressWarnings ("unused")
public class OrdersGroup1Comp extends AbstractGroupComponent {

  private final ClOrdID clOrdID;
  private final OrderID orderID;
  private final SecondaryOrderID secondaryOrderID;
  private final SecondaryClOrdID secondaryClOrdID;
  private final ListID listID;
  private final Nested2PartyIDsGroup nested2PartyIDsGroup;
  private final OrderQty orderQty;
  private final OrderAvgPx orderAvgPx;
  private final OrderBookingQty orderBookingQty;

  public OrdersGroup1Comp(AbstractMessage message) {
    super(message);
    clOrdID = new ClOrdID(message);
    orderID = new OrderID(message);
    secondaryOrderID = new SecondaryOrderID(message);
    secondaryClOrdID = new SecondaryClOrdID(message);
    listID = new ListID(message);
    nested2PartyIDsGroup = new Nested2PartyIDsGroup(message);
    orderQty = new OrderQty(message);
    orderAvgPx = new OrderAvgPx(message);
    orderBookingQty = new OrderBookingQty(message);
  }

  @Override
  public Field map(int tag, int fldBeg) {
    long version = message.version();
    byte[] bytes = message.bytes();
    return switch (tag) {
      case 11 -> clOrdID.map(version, bytes, fldBeg);
      case 37 -> orderID.map(version, bytes, fldBeg);
      case 198 -> secondaryOrderID.map(version, bytes, fldBeg);
      case 526 -> secondaryClOrdID.map(version, bytes, fldBeg);
      case 66 -> listID.map(version, bytes, fldBeg);
      case 756,757,758,806,759,807,760 -> 
          nested2PartyIDsGroup.map(tag, fldBeg);
      case 38 -> orderQty.map(version, bytes, fldBeg);
      case 799 -> orderAvgPx.map(version, bytes, fldBeg);
      case 800 -> orderBookingQty.map(version, bytes, fldBeg);
      default -> message.unknownField(fldBeg);
    };
  }

  @Override
  public Field field(Tag tag) {
    return switch (tag.tag()) {
      case 11 -> clOrdID;
      case 37 -> orderID;
      case 198 -> secondaryOrderID;
      case 526 -> secondaryClOrdID;
      case 66 -> listID;
      case 756,757,758,806,759,807,760 -> 
          nested2PartyIDsGroup.field(tag);
      case 38 -> orderQty;
      case 799 -> orderAvgPx;
      case 800 -> orderBookingQty;
      default -> null;
    };
  }
  @Override
  public int write (int valBeg) {
    valBeg = clOrdID.write(valBeg);
    valBeg = orderID.write(valBeg);
    valBeg = secondaryOrderID.write(valBeg);
    valBeg = secondaryClOrdID.write(valBeg);
    valBeg = listID.write(valBeg);
    valBeg = nested2PartyIDsGroup.write(valBeg);
    valBeg = orderQty.write(valBeg);
    valBeg = orderAvgPx.write(valBeg);
    valBeg = orderBookingQty.write(valBeg);
    return valBeg; 
  }
}