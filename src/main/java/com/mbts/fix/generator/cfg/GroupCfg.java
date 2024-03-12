package com.mbts.fix.generator.cfg;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Setter
@Getter
@ToString(of={"className","idTagField","noTagField"})
public class GroupCfg implements FieldOrGroup {
  private String className;
  private String varName;
  private FieldCfg noTagField;
  private FieldCfg idTagField;
  private List<FieldOrGroup> elements = new ArrayList<>();
  private boolean header, trailer, ownerSet;

  public void owner(GroupCfg g) {
    noTagField.owner(g);
    idTagField.owner(g);
    elements.forEach(c -> {
        switch (c) {
          case GroupCfg gc -> gc.owner(g);
          case FieldCfg fc -> fc.owner(g);
          default -> {}
        }
    });
    ownerSet = g != null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GroupCfg that = (GroupCfg) o;
    if(this.header != that.header) return false;
    if(this.trailer != that.trailer)  return false;
    if(!this.className.equals(that.className))  return false;
    if(!this.varName.equals(that.varName))  return false;
    if(!this.noTagField.equals(that.noTagField))  return false;
    if(!this.idTagField.equals(that.idTagField))  return false;
    if(that.elements.size() != this.elements.size()) return false;
    Map<String, FieldOrGroup> thisElements = this.elements.stream().collect(Collectors.toMap(FieldOrGroup::className, e -> e));
    Map<String, FieldOrGroup> thatElements = that.elements.stream().collect(Collectors.toMap(FieldOrGroup::className, e -> e));
    Set<String> keys = thisElements.keySet();
    for(String key: keys) {
      Cfg cfg = thatElements.get(key);
      if(cfg == null) return false;
      if(!cfg.equals(thisElements.get(key))) return false;
    }
    return true;
  }
}
