package com.mbts.fix.api;

import java.util.function.Function;

public interface FixDict {
  <M extends Message> M map(byte[] bytes, int offset, int length, Function<String, M> mt_message);
}
