package com.mbts.fix.generator.cfg;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString(of={"msgType","className"})
public class MessageCfg{
  private String className;
  private String varName;
  private String msgType;
  private List<FieldOrGroup> elements = new ArrayList<>();
}
