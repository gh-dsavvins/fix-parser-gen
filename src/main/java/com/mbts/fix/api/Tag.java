package com.mbts.fix.api;

public interface Tag {
  byte[] bytes();
  int tag();
  String fixStringName();
}
