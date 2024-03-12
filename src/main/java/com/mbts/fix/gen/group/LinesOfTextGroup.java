package com.mbts.fix.gen.group;

import com.mbts.fix.message.*; 
import com.mbts.fix.gen.FixTag;

@SuppressWarnings ("unused")
public class LinesOfTextGroup extends AbstractGroup {

  public LinesOfTextGroup(AbstractMessage message) {
    super(message, FixTag.noLinesOfText, FixTag.text, LinesOfTextGroupComp::new);
  }

  public LongRef noLinesOfText() {
    return countField;
  }

  public LinesOfTextGroupComp linesOfTextGroupComp(int ix) {
    return (LinesOfTextGroupComp) components[ix];
  }
}