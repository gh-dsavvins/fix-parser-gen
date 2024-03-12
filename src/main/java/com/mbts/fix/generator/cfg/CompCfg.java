package com.mbts.fix.generator.cfg;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class CompCfg implements Cfg {
  private Cfg firstElement;
  private List<FieldOrGroup> elements = new ArrayList<>();
}
