package com.mbts.fix.generator.cfg;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;
import java.util.Set;

@Setter
@Getter
@ToString(of={"tag","className"})
public class FieldCfg implements FieldOrGroup {
  GroupCfg owner;
  private String className, varName, superClassName;
  private Map<String, ValueCfg> values;
  private int tag;
  private boolean header, trailer;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FieldCfg fieldCfg = (FieldCfg) o;
    if(tag != fieldCfg.tag) return false;
    if(!className.equals(fieldCfg.className)) return false;
    if(!varName.equals(fieldCfg.varName)) return false;
    if(!superClassName.equals(fieldCfg.superClassName)) return false;
    if(this.values == null && fieldCfg.values != null) return false;
    if(fieldCfg.values == null && this.values != null) return false;
    if(this.values != null) {
      if(fieldCfg.values.size() != this.values.size()) return false;
      Set<String> keys = this.values.keySet();
      for(String key: keys) {
        ValueCfg valueCfg = fieldCfg.values.get(key);
        if(valueCfg == null) return false;
        if(!valueCfg.equals(this.values.get(key))) return false;
      }
    }
    return true;
  }
}
