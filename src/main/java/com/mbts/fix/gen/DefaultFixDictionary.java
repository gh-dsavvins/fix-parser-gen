package com.mbts.fix.gen;

import com.mbts.fix.Utils;
import com.mbts.fix.api.*;
import java.util.function.Function;
import com.mbts.fix.gen.field.MsgType;

public class DefaultFixDictionary implements FixDictionary {

  @Override
  public <M extends Message> M map(byte[] bytes, int offset, int length, Function<String, M> mFunc) {
    int mtValBeg = Utils.mtValBeg(bytes, offset);
    String mt = MsgType.value(bytes, mtValBeg);
    M message = mFunc.apply(mt);
    message.map(bytes, offset, length);
    return message;
  }
}