package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class OrdersGroup extends AbstractGroup {

  public OrdersGroup(AbstractMessage message) {
    super(message, FixTag.noOrders, FixTag.clOrdID, OrdersGroupComp::new);
  }

  public LongRef noOrders() {
    return countField;
  }

  public OrdersGroupComp ordersGroupComp(int ix) {
    return (OrdersGroupComp) components[ix];
  }
}