package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class BenchmarkSecurityID extends StringRef {

  public BenchmarkSecurityID(Message message) {
    super(message, FixTag.benchmarkSecurityID);
  }
}