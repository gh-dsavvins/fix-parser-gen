package com.mbts.fix.api;

public interface Group extends Tagged {
  Component[] components();
  int componentCount();
  Field field(Tag tag);
  Field map(int tag, int fldBeg);
  Component newComponent();
  int write(int valBeg);
}
