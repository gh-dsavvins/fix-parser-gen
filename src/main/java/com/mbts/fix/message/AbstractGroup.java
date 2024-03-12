package com.mbts.fix.message;

import com.mbts.fix.api.*;

import java.lang.reflect.Array;
import java.util.function.Function;

public abstract class AbstractGroup implements Group {

  protected final LongRef countField;
  protected final Component[] components;

  final AbstractMessage message;
  final Tag noTag;
  final Tag idTag;

  int componentCount;

  public AbstractGroup(AbstractMessage message, Tag noTag, Tag idTag, Function<AbstractMessage, Component> gen) {
    this.message = message;
    this.noTag = noTag;
    this.idTag = idTag;
    this.countField = new LongRef(message, noTag);
    this.components = (Component[]) Array.newInstance(Component.class, 1 << 4);
    for(int i = 0; i < components.length; i++) {
      components[i] = gen.apply(message);
    }
  }

  public Component[] components() {
    return components;
  }

  public int componentCount() {
    return componentCount;
  }

  @Override
  public Field map(int tag, int fldBeg) {
    if(tag == this.noTag.tag()) {
      componentCount = 0;
      return countField.map(message.version, message.bytes, fldBeg);
    }
    if(countField.version != message.version) {
      return message.unknownField(fldBeg);
    }
    if(tag == idTag.tag()) {
      componentCount++;
    }
    Component component = components[componentCount - 1];
    return component.map(tag, fldBeg);
  }

  @Override
  public Component newComponent() {
    Component component = components[componentCount++];
    countField.set(componentCount);
    return component;
  }

  @Override
  public Tag tag() {
    return noTag;
  }

  @Override
  public Field field(Tag tag) {
    if(tag == noTag) {
      return countField;
    }
    return null;
  }

  @Override
  public int write(int valBeg) {
    int index = valBeg;
    index = countField.write(index);
    for(int i = 0; i < componentCount; i++) {
      index = components[i].write(index);
    }
    return index;
  }
}
