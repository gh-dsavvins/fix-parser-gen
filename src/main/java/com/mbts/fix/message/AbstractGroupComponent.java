package com.mbts.fix.message;

import com.mbts.fix.api.Component;
import com.mbts.fix.api.Message;

public abstract class AbstractGroupComponent implements Component {

  protected final Message message;

  public AbstractGroupComponent(Message message) {
    this.message = message;
  }
}
