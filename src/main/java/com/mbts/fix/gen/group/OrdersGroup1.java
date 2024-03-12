package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class OrdersGroup1 extends AbstractGroup {

  public OrdersGroup1(AbstractMessage message) {
    super(message, FixTag.noOrders, FixTag.clOrdID, OrdersGroup1Comp::new);
  }

  public LongRef noOrders() {
    return countField;
  }

  public OrdersGroup1Comp ordersGroup1Comp(int ix) {
    return (OrdersGroup1Comp) components[ix];
  }
}