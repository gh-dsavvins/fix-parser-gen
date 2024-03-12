package com.mbts.fix.gen.field;

import com.mbts.fix.gen.FixTag;
import com.mbts.fix.api.*;
import com.mbts.fix.message.*;

public class IssueDate extends StringRef {

  public IssueDate(Message message) {
    super(message, FixTag.issueDate);
  }
}