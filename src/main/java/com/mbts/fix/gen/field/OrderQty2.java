package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class OrderQty2 extends StringRef {

  public OrderQty2(Message message) {
    super(message, FixTag.orderQty2);
  }
}