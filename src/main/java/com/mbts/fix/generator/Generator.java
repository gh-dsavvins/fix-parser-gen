package com.mbts.fix.generator;

import com.mbts.fix.generator.cfg.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.cli.*;
import org.apache.commons.io.FileUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Slf4j
public class Generator {
  private static final Map<String, String> typeToSuperClassName = new HashMap<>();
  static {
    typeToSuperClassName.put("STRING", "StringRef");
    typeToSuperClassName.put("INT", "LongRef");
    typeToSuperClassName.put("NUMINGROUP", "LongRef");
    typeToSuperClassName.put("LENGTH", "LongRef");
    typeToSuperClassName.put("FLOAT", "DoubleRef");
    typeToSuperClassName.put("CHAR", "StringRef");
  }
  private static final String[] T = IntStream.range(0, 48)
      .filter(i -> (i & 1) == 0)
      .mapToObj(" "::repeat)
      .toArray(String[]::new);
  private static Option option(String longOpt, String desc) {
    return Option.builder().required(true).hasArg(true).longOpt(longOpt).desc(desc).build();
  }

  private static CommandLine parseOptions(String[] args) {
    Options options = new Options();
    options.addOption(option("fix", "Fix definition xml file absolute path"));
    options.addOption(option("version", "Begin string value"));
    options.addOption(option("output", "Output directory absolute path"));
    options.addOption(option("package", "Root package for generated java sources"));
    CommandLineParser parser = new DefaultParser();
    try {
      return parser.parse(options, args);
    } catch(Exception e) {
      log.error("parse - ", e);
      HelpFormatter formatter = new HelpFormatter();
      formatter.printHelp("generator", options);
      System.exit(1);
    }
    return null;
  }

  private static CommandLine options;
  private static String dirGenRoot;
  private static String dirGenField;
  private static String dirGenGroup;
  private static String dirGenMessage;
  private static String pkgGenRoot;
  private static String pkgGenField;
  private static String pkgGenGroup;
  private static String pkgGenMessage;
  private static Map<String, GroupCfg> groups;

  private static Element docElement;
  private static Map<String, FieldCfg> fields;
  private static List<MessageCfg> messages;
//  private static final Set<String> generatedGroups = new HashSet<>();
  private static CompCfg headerCfg;
  private static CompCfg trailerCfg;

  public static void main(String[] args) {
    options = parseOptions(args);
    parseOptions();
    groups = new HashMap<>();
    deleteDirs();
    createClearDirs();
    generate();
  }

  private static void deleteDirs() {
    String dir = dirGenRoot;
    File file = new File(dir);
    if(file.exists()) {
      log.info("deleteDirs - Directory {} exists, deleting", dir);
      try {
        FileUtils.deleteDirectory(file);
      } catch (Exception e) {
        log.error("deleteDirs - Could not delete directory: {}", dir, e);
      }
    }
  }

  private static void parseOptions() {
    pkgGenRoot = options.getOptionValue("package");
    pkgGenField = pkgGenRoot + ".field";
    pkgGenGroup = pkgGenRoot + ".group";
    pkgGenMessage = pkgGenRoot + ".message";
    dirGenRoot = options.getOptionValue("output") + "/" + pkgGenRoot.replaceAll("\\.", "/");
    dirGenField = dirGenRoot + "/field";
    dirGenGroup = dirGenRoot + "/group";
    dirGenMessage = dirGenRoot + "/message";
  }

  private static void createClearDirs() {
    log.info("Creating directories in root directory: {}", pkgGenRoot);
    mkdirs(dirGenField);
    mkdirs(dirGenGroup);
    mkdirs(dirGenMessage);
  }

  private static void mkdirs(String dir) {
    File file = new File(dir);
    if(file.exists()) {
      log.error("File: {} already exists.", dir);
      return;
    }
    if(!file.mkdirs()) {
      log.error("Could not create directory: {}", dir);
      System.exit(1);
    }
  }

  private static void generate() {
    genFixTag();
    genFields();
    genMessages();
    genDictionary();
  }

  private static void genDictionary() {
    StringBuilder b = new StringBuilder();
    b.append("package ").append(pkgGenRoot).append(";\n\n");
    b.append("import com.mbts.fix.Utils;\n");
    b.append("import com.mbts.fix.api.*;\n");
    b.append("import java.util.function.Function;\n");
    b.append("import ").append(pkgGenField).append(".MsgType;\n\n");
    b.append("public class DefaultFixDictionary implements FixDictionary {\n\n");
    b.append(T[1]).append("@Override\n");
    b.append(T[1]).append("public <M extends Message> M map(byte[] bytes, int offset, int length, Function<String, M> mFunc) {\n");
    b.append(T[2]).append("int mtValBeg = Utils.mtValBeg(bytes, offset);\n");
    b.append(T[2]).append("String mt = MsgType.value(bytes, mtValBeg);\n");
    b.append(T[2]).append("M message = mFunc.apply(mt);\n");
    b.append(T[2]).append("message.map(bytes, offset, length);\n");
    b.append(T[2]).append("return message;\n");
    b.append(T[1]).append("}\n");
    b.append("}");
    writeFile(b, dirGenRoot, "DefaultFixDictionary");
  }

  private static void genMessages() {
    List<MessageCfg> messages = messages();
    genGroups();
    String fixVerion = options.getOptionValue("version");
    CompCfg headerCfg = listHeader();
    CompCfg trailerCfg = listTrailer();
    StringBuilder b = new StringBuilder();
    messages.forEach(msgCfg -> {
      b.setLength(0);
      String className = msgCfg.className();
      b.append("package ").append(pkgGenMessage).append(";\n\n");
      b.append("import ").append(pkgGenGroup).append(".*;\n");
      b.append("import com.mbts.fix.api.*;\n\n");
      b.append("import ").append(pkgGenRoot).append(".FixTag;\n");
      b.append("import ").append(pkgGenField).append(".*;\n");
      b.append("import java.util.function.BiFunction;\n");
      b.append("import lombok.Getter;\n");
      b.append("import com.mbts.fix.message.*; \n\n");
      b.append("@Getter\n");
      b.append ("@SuppressWarnings (\"unused\")\n");
      b.append ("public class ").append(msgCfg.className()).append(" extends AbstractMessage {\n\n");
      genMsgFieldDeclaration(b, headerCfg.elements());
      genMsgFieldDeclaration(b, msgCfg.elements());
      genMsgFieldDeclaration(b, trailerCfg.elements());
      b.append("\n");
      b.append(T[1]).append("public ").append(className).append("() {\n");
      b.append(T[2]).append("super();\n");
      b.append(T[2]).append("beginString.set(\"").append(fixVerion).append("\");\n");
      b.append(T[2]).append("bodyLength.set(999);\n");
      b.append(T[1]).append("}\n\n");
      b.append(T[1]).append("@Override\n");
      b.append(T[1]).append("protected AbstractField msgType() {\n");
      b.append(T[2]).append("return beginString;\n");
      b.append(T[1]).append("}\n\n");
      b.append(T[1]).append("@Override\n");
      b.append(T[1]).append("protected void writeUnmapped() {\n");
      b.append(T[2]).append("valBeg = 24;\n");
      b.append(T[2]).append("valLim = 24;\n");
      b.append(T[2]).append("int bodyBeg = 24;\n");
      msgCfg.elements().stream().filter(Generator::nonHeadTail).forEach(c -> b.append(T[2]).append("valLim = ").append(c.varName()).append(".write(valLim);\n"));
      b.append(T[2]).append("int bodyLim = valLim;\n");
      b.append(T[2]).append("writeUnmapped(bodyLength, bodyLim - bodyBeg, beginString, checkSum);\n");
      b.append(T[1]).append("}\n\n");
      b.append(T[1]).append("@Override\n");
      b.append(T[1]).append("protected Tag unknownTag() {\n");
      b.append(T[2]).append("return FixTag.unknown;\n");
      b.append(T[1]).append("}\n\n");
      b.append(T[1]).append("@Override\n");
      b.append(T[1]).append("protected int writeMapped() {\n");
      b.append(T[2]).append("int fldLim = super.writeMapped();\n");
      b.append(T[2]).append("calcAndWriteBodyLengthMapped(bodyLength, beginString);\n");
      b.append(T[2]).append("calcAndWriteCheckSum(checkSum);\n");
      b.append(T[2]).append("return fldLim;\n");
      b.append(T[1]).append("}\n\n");
      List<FieldCfg> allFieldCfgs = new ArrayList<>() ;
      msgCfg.elements().forEach(e -> {
        switch (e) {
          case FieldCfg f -> f.owner(null);
          case GroupCfg g -> g.owner(null);
          default -> {}
        }
      });
      flatMap(msgCfg.elements(), allFieldCfgs);
      flatMap(listHeader().elements(), allFieldCfgs);
      flatMap(listTrailer().elements(), allFieldCfgs);
      allFieldCfgs = allFieldCfgs.stream().sorted(Comparator.comparing(o -> String.valueOf(o.tag()))).collect(Collectors.toList());
      switch_each_char(b, className, allFieldCfgs); // timePerMessage:          4751.39
      b.append("}");
      writeFile(b, dirGenMessage, className);
    });
  }

  private static void switch_each_char(StringBuilder b, String className, List<FieldCfg> allFieldCfgs) {
    genFixTagSwitch(className, allFieldCfgs, b);
  }

  private static void genFixTagSwitch(String className, List<FieldCfg> tags, StringBuilder b) {
    b.append(T[1]).append("@Override\n");
    b.append(T[1]).append("public Field map(int fldBeg) {\n");
    b.append(T[2]).append("int beg = fldBeg;\n");
    printFieldSwitch(0, tags.size(), 2, 0, tags, b);
    b.append (T[2]).append ("return unknownField(fldBeg);\n");
    b.append (T[1]).append ("}\n");
  }

  private static void printFieldSwitch(int beg, int end, int tab, int ix, List<FieldCfg> tags, StringBuilder b) {
    boolean elseCase = false;
    FieldCfg firstNodeInGroup = tags.get(beg);
    String firstStringInGroup = String.valueOf(firstNodeInGroup.tag());
    if(firstStringInGroup.length() == ix) {
      beg++;
      b.append(T[tab]).append("if(bytes[fldBeg] == '=') {\n");
      b.append(T[tab + 1]).append("return ");
      boolean isGroupField = firstNodeInGroup.owner() != null;
      if(isGroupField) {
        b.append(firstNodeInGroup.owner().varName()).append(".map(").append(firstNodeInGroup.tag()).append(", beg); //");
      } else {
        b.append(firstNodeInGroup.varName()).append(".map(version, bytes, beg); //");
      }
      b.append(firstNodeInGroup.tag()).append("\n");
      b.append(T[tab]).append("}");
      if(beg == end) {
        b.append("\n");
        b.append(T[tab]).append("break;\n");
        return;
      }
      elseCase = true;
      b.append(" else {\n");
      tab++;
      firstNodeInGroup = tags.get(beg);
      firstStringInGroup = String.valueOf(firstNodeInGroup.tag());
    }
    int groupCount = end - beg;
    if(groupCount == 1) {
      b.append(T[tab]).append("if(bytes[fldBeg] == '").append(firstStringInGroup.charAt(ix++)).append("'");
      while(ix < firstStringInGroup.length()) {
        b.append(" && bytes[fldBeg++] == '").append(firstStringInGroup.charAt(ix)).append("'");
        ix++;
      }
      b.append(" && bytes[++fldBeg] == '=') {\n");
      b.append(T[tab + 1]).append("return ");
      boolean isGroupField = firstNodeInGroup.owner() != null;
      if(isGroupField) {
        b.append(firstNodeInGroup.owner().varName()).append(".map(").append(firstNodeInGroup.tag()).append(", beg); //");
      } else {
        b.append(firstNodeInGroup.varName()).append(".map(version, bytes, beg); //");
      }
      b.append(firstNodeInGroup.tag()).append("\n");


    } else {
      b.append(T[tab]).append("switch(bytes[fldBeg]) {\n");
      byte firstCharInGroup = (byte) firstStringInGroup.charAt(ix);
      int sameCharAtIxCount = 0;
      while(beg < end + 1) {
        FieldCfg aNodeInGroup = beg == end ? null : tags.get(beg);
        String aStringInGroup = beg == end ? null : String.valueOf(aNodeInGroup.tag());
        byte aCharInGroup = beg == end ? (byte) '\u0001' : (byte) aStringInGroup.charAt(ix);
        if(aCharInGroup == firstCharInGroup) {
          sameCharAtIxCount++;
          beg++;
        } else {
          b.append(T[tab + 1]).append("case '").append((char) firstCharInGroup).append("':\n");
          b.append(T[tab + 2]).append("fldBeg++;\n");
          printFieldSwitch(beg - sameCharAtIxCount, beg, tab + 2, ix + 1, tags, b);
          firstCharInGroup = aCharInGroup;
          sameCharAtIxCount = 0;
        }
      }
    }
    b.append(T[tab]).append("}\n");
    if(elseCase) {
      b.append(T[tab - 1]).append("}\n");
    }
    if(ix > 0) {
      b.append(T[tab - (elseCase ? 1 : 0)]).append("break;\n");
    }
  }

  private static void flatMap(List<FieldOrGroup> elements, List<FieldCfg> allFieldCfgs) {
    elements.forEach(c -> {
      switch (c) {
        case FieldCfg f -> allFieldCfgs.add(f);
        case GroupCfg g -> {
          if(!g.ownerSet()) {
            g.owner(g);
          }
          allFieldCfgs.add(g.noTagField());
          flatMap(g.elements(), allFieldCfgs);
        }
        default -> {}
      }
    });
  }

  private static boolean nonHeadTail(FieldOrGroup cfg) {
    return switch (cfg.className()) {
      case "BeginString", "BodyLength", "CheckSum"
          -> false;
      default -> true;
    };
  }

  private static void genMsgFieldDeclaration(StringBuilder b, List<FieldOrGroup> fields) {
    fields.forEach(c ->
        b.append(T[1]).append("private final ").append(c.className()).append(" ").append(c.varName())
            .append(" = new ").append(c.className()).append("(this);\n"));
  }

  private static void genGroups() {
    groups.values().forEach(Generator::genGroup);
    listHeader().elements().stream()
        .filter(c -> c instanceof GroupCfg)
        .map(c -> (GroupCfg) c)
        .forEach(Generator::genGroup);
    listTrailer().elements().stream()
        .filter(c -> c instanceof GroupCfg)
        .map(c -> (GroupCfg) c)
        .forEach(Generator::genGroup);
  }

  private static void genGroup(GroupCfg groupCfg) {
    String className = groupCfg.className();
    String compClassName = className + "Comp";
    genGroupComp(groupCfg, compClassName);
    StringBuilder b = new StringBuilder();
    b.append("package ").append(pkgGenGroup).append(";\n\n");
    b.append("import com.mbts.fix.message.*; \n");
    b.append("import ").append(pkgGenRoot).append(".FixTag;\n\n");
    b.append ("@SuppressWarnings (\"unused\")\n");
    b.append ("public class ").append(groupCfg.className()).append(" extends AbstractGroup {\n\n");
    b.append(T[1]).append("public ").append(groupCfg.className()).append("(AbstractMessage message) {\n");
    b.append(T[2]).append("super(message, FixTag.")
        .append(groupCfg.noTagField().varName()).append(", FixTag.")
        .append(groupCfg.idTagField().varName()).append(", ")
        .append(compClassName).append("::new").append(");\n");
    b.append(T[1]).append("}\n\n");
    b.append(T[1]).append("public LongRef ").append(groupCfg.noTagField().varName()).append("() {\n");
    b.append(T[2]).append("return countField;\n");
    b.append(T[1]).append("}\n\n");
    b.append(T[1]).append("public ").append(compClassName).append(" ").append(toSmallFirstChar(compClassName)).append("(int ix) {\n");
    b.append(T[2]).append("return (").append(compClassName).append(") components[ix];\n");
    b.append(T[1]).append("}\n");
    b.append("}");
    writeFile(b, dirGenGroup, className);
  }

  private static void genGroupComp(GroupCfg groupCfg, String compClassName) {
    StringBuilder b = new StringBuilder();
    b.append("package ").append(pkgGenGroup).append(";\n\n");
    b.append("import com.mbts.fix.message.AbstractGroupComponent;\n");
    b.append("import com.mbts.fix.message.AbstractMessage;\n");
    b.append("import ").append(pkgGenField).append(".*;\n");
    b.append("import lombok.Getter;\n");
    b.append("import com.mbts.fix.api.*;\n\n");
    b.append("@Getter\n");
    b.append ("@SuppressWarnings (\"unused\")\n");
    b.append ("public class ").append(compClassName).append(" extends AbstractGroupComponent {\n\n");
    groupCfg.elements().forEach(c -> b.append(T[1]).append("private final ").append(c.className()).append(" ").append(c.varName()).append(";\n"));
    b.append("\n");
    b.append(T[1]).append("public ").append(compClassName).append("(AbstractMessage message) {\n");
    b.append(T[2]).append("super(message);\n");
    groupCfg.elements().forEach(c -> b.append(T[2]).append(c.varName()).append(" = new ").append(c.className()).append("(message);\n"));
    b.append(T[1]).append("}\n\n");
    b.append(T[1]).append("@Override\n");
    b.append(T[1]).append("public Field map(int tag, int fldBeg) {\n");
    b.append(T[2]).append("long version = message.version();\n");
    b.append(T[2]).append("byte[] bytes = message.bytes();\n");
    b.append(T[2]).append("return switch (tag) {\n");
    groupCfg.elements().forEach(c -> {
      b.append(T[3]);
      switch (c) {
        case FieldCfg fc -> b.append("case ").append(fc.tag()).append(" -> ").append(fc.varName()).append(".map(version, bytes, fldBeg);\n");
        case GroupCfg gc -> {
          String tags = tags(gc, new HashSet<>()).stream().map(i -> Integer.toString(i)).collect(Collectors.joining(","));
          b.append("case ").append(tags).append(" -> \n");
          b.append(T[5]).append(gc.varName()).append(".map(tag, fldBeg);\n");
        }
        default -> {}
      }
    });
    b.append(T[3]).append("default -> message.unknownField(fldBeg);\n");
    b.append(T[2]).append("};\n");
    b.append(T[1]).append("}\n\n");
    b.append(T[1]).append("@Override\n");
    b.append(T[1]).append("public Field field(Tag tag) {\n");
    b.append(T[2]).append("return switch (tag.tag()) {\n");
    groupCfg.elements().forEach(c -> {
      b.append(T[3]);
      switch (c) {
        case FieldCfg fc -> b.append("case ").append(fc.tag()).append(" -> ").append(fc.varName()).append(";\n");
        case GroupCfg gc -> {
          String tags = tags(gc, new HashSet<>()).stream().map(i -> Integer.toString(i)).collect(Collectors.joining(","));
          b.append("case ").append(tags).append(" -> \n");
          b.append(T[5]).append(gc.varName()).append(".field(tag);\n");
        }
        default -> {}
      }
    });
    b.append(T[3]).append("default -> null;\n");
    b.append(T[2]).append("};\n");
    b.append(T[1]).append("}\n");
    genWrite(b, groupCfg.elements());
    b.append("}");
    writeFile(b, dirGenGroup, compClassName);
  }

  private static void genWrite(StringBuilder b, List<FieldOrGroup> elements) {
    b.append(T[1]).append("@Override\n");
    b.append (T[1]).append("public int write (int valBeg) {\n");

    elements.forEach(c -> {
        b.append (T[2]).append("valBeg = ");
      switch (c) {
        case FieldCfg fc -> b.append(fc.varName());
        case GroupCfg gc -> b.append(gc.varName());
        default -> {}
      }
      b.append(".write(valBeg);\n");
    });
    b.append(T[2]).append("return valBeg; \n");
    b.append(T[1]).append("}\n");
  }

  private static Set<Integer> tags(GroupCfg gc, Set<Integer> out) {
    out.add(gc.noTagField().tag());
    out.add(gc.idTagField().tag());
    gc.elements().forEach(c -> {
      switch (c) {
        case FieldCfg f -> out.add(f.tag());
        case GroupCfg g -> tags(g, out);
        default -> {}
      }
    });
    return out;
  }

  private static List<MessageCfg> messages() {
    if(messages == null) {
      messages = new ArrayList<>();
      NodeList messageList = docElement().getElementsByTagName("messages").item(0).getChildNodes();
      for (int i = 0; i < messageList.getLength(); i++) {
        Node child = messageList.item(i);
        if (child instanceof Element e) {
          if (e.getAttributes().getLength() != 3) {
            log.error("Unexpected attribute count: {}", e.getAttributes().getLength());
          }
          MessageCfg messageCfg = new MessageCfg()
              .className(e.getAttribute("name"))
              .msgType(e.getAttribute("msgtype"));
          listMessageNode(e, messageCfg.elements());
          messages.add(messageCfg);
        }
      }
    }
    return messages;
  }

  private static CompCfg listHeader() {
    if(headerCfg == null) {
      headerCfg = new CompCfg();
      list(headerCfg, "header");
    }
    return headerCfg;
  }

  private static CompCfg listTrailer() {
    if(trailerCfg == null) {
      trailerCfg = new CompCfg();
      list(trailerCfg, "trailer");
    }
    return trailerCfg;
  }

  private static void list(CompCfg compCfg, String name) {
    NodeList componontList = docElement().getElementsByTagName(name).item(0).getChildNodes();
    for (int i = 0; i < componontList.getLength(); i++) {
      Node child = componontList.item(i);
      if (child instanceof Element e) {
        String tagName = e.getTagName();
        switch (tagName) {
          case "field" -> compCfg.elements().add(fields().get(e.getAttribute("name")));
          case "component" -> listCompNode(e, compCfg.elements(), !e.hasChildNodes(), null);
          case "group" -> listGroup(e, compCfg.elements());
        }
      }
    }
  }

  private static void listMessageNode(Element element, List<FieldOrGroup> elements) {
    NodeList childNodes = element.getChildNodes();
    for (int i = 0; i < childNodes.getLength(); i++) {
      Node child = childNodes.item(i);
      if (child instanceof Element e) {
        String tagName = e.getTagName();
        switch (tagName) {
          case "field" -> elements.add(fields().get(e.getAttribute("name")));
          case "component" -> listCompNode(e, elements, !e.hasChildNodes(), null);
          case "group" -> listGroup(e, elements);
        }
      }
    }
  }

  private static CompCfg globalComponent(String name, Cfg parent) {
    NodeList componontList = docElement().getElementsByTagName("components").item(0).getChildNodes();
    for (int i = 0; i < componontList.getLength(); i++) {
      Node child = componontList.item(i);
      if (child instanceof Element e) {
        if(e.getAttribute("name").equals(name)) {
          CompCfg compCfg = new CompCfg();
          listCompNode(e, compCfg.elements(), !e.hasChildNodes(), parent);
          return compCfg;
        }
      }
    }
    return null;
  }

  private static void listCompNode(Element element, List<FieldOrGroup> elements, boolean isGlobal, Cfg parent) {
    if(isGlobal) {
      String name = element.getAttribute("name");
      CompCfg compCfg = globalComponent(name, parent);
      elements.addAll(Objects.requireNonNull(compCfg).elements());
    } else {
      NodeList childNodes = element.getChildNodes();
      for (int i = 0; i < childNodes.getLength(); i++) {
        Node child = childNodes.item(i);
        if (child instanceof Element e) {
          String tagName = e.getTagName();
          switch (tagName) {
            case "field" -> {
              FieldCfg fieldCfg = fields().get(e.getAttribute("name"));
              if(parent instanceof GroupCfg g) {
                if(g.idTagField() == null) {
                  parent = null;
                  g.idTagField(fieldCfg);
                }
              } else {
                parent = null;
              }
              elements.add(fieldCfg);
            }
            case "component" -> listCompNode(e, elements, !e.hasChildNodes(), parent);
            case "group" -> listGroup(e, elements);
          }
        }
      }
    }
  }

  private static GroupCfg group(GroupCfg newGroupCfg) {
   return group(newGroupCfg, 0);
  }

  private static GroupCfg group(GroupCfg newGroupCfg, int depth) {
    if(depth > 9) {
      throw new RuntimeException("group");
    } else {
      if(depth > 0) {
        int i = depth > 1 ? 1 : 0;
        newGroupCfg.className(newGroupCfg.className().substring(0, newGroupCfg.className().length() - i) + depth);
        newGroupCfg.varName(newGroupCfg.varName().substring(0, newGroupCfg.varName().length() - i) + depth);
      }
      GroupCfg group = groups.get(newGroupCfg.className());
      if (group != null) {
        if(!newGroupCfg.equals(group)) {
          return group(newGroupCfg, depth + 1);
        } else {
          return group;
        }
      } else {
        groups.put(newGroupCfg.className(), newGroupCfg);
        return newGroupCfg;
      }
    }
  }

  private static void listGroup(Element element, List<FieldOrGroup> elements) {
    String name = element.getAttribute("name");
    String groupName = name.substring(2) + "Group";
    GroupCfg groupCfg = new GroupCfg()
        .className(groupName)
        .varName(toSmallFirstChar(groupName))
        .noTagField(fields().get(name));
    NodeList childNodes = element.getChildNodes();
    for (int i = 0; i < childNodes.getLength(); i++) {
      Node child = childNodes.item(i);
      if (child instanceof Element e) {
        String tagName = e.getTagName();
        switch (tagName) {
          case "field" -> {
            FieldCfg fieldCfg = fields().get(e.getAttribute("name"));
            if(groupCfg.idTagField() == null) {
              groupCfg.idTagField(fieldCfg);
            }
            groupCfg.elements().add(fieldCfg);
          }
          case "component" -> listCompNode(e, groupCfg.elements(), !e.hasChildNodes(), groupCfg);
          case "group" -> listGroup(e, groupCfg.elements());
        }
      }
    }
    groupCfg = group(groupCfg);
    elements.add(groupCfg);
  }

  private static void genFields() {
    StringBuilder b = new StringBuilder();
    fields().forEach((className, cfg) -> {
      b.append("package ").append(pkgGenField).append(";\n\n");
      b.append("import ").append(pkgGenRoot).append(".FixTag;\n");
      b.append("import ").append("com.mbts.fix.api.*;\n");
      b.append("import ").append("com.mbts.fix.message.*;\n\n");
      b.append("public class ").append(className).append(" extends ").append(cfg.superClassName()).append(" {\n\n");
      boolean enumField = cfg.values() != null;
      if(enumField) {
        cfg.values().forEach((k, v) -> {
          String fixValue = v.value();
          String desc = v.desc();
          if(Character.isDigit(desc.charAt(0))) {
            log.warn("Field: {}, value: {} has numeric description first char: {}", className, fixValue, desc);
            desc = "_" + desc;
          }
          b.append(T[1]).append("public static final ");
          switch (cfg.superClassName()) {
            case "StringRef" -> b.append("String ").append(desc).append(" = \"").append(fixValue).append("\";\n");
            case "LongRef" -> b.append("long ").append(desc).append(" = ").append(fixValue).append(";\n");
            case "BooleanRef" -> b.append("Boolean ").append(desc).append(" = ").append(fixValue).append(";\n");
          }
        });
        b.append("\n");
      }
      b.append(T[1]).append("public ").append(className).append("(Message message) {\n");
      b.append(T[2]).append("super(message, FixTag.").append(cfg.varName()).append(");\n");
      if(cfg.header()) {
        b.append(T[2]).append("this.header = true;\n");
      }
      b.append(T[1]).append("}\n");
      if(cfg.values() != null) {
        b.append("\n");
        genParseMultiStringField(b, cfg);
      }
      b.append("}");
      writeFile(b, dirGenField, className);
      b.setLength(0);
    });
  }

  private static void genParseMultiStringField(StringBuilder b, FieldCfg cfg) {
    Map<String, ValueCfg> values = cfg.values();
    List<String> sortedCodes = values.values().stream().map(ValueCfg::value).sorted().toList();
    Map<String, String> valueToDesc = values.values().stream().collect(Collectors.toMap(ValueCfg::value, ValueCfg::desc));
    b.append(T[1]).append("public static ").append(toUnderlying(cfg)).append(" value(byte[] bytes, int valBeg) {\n");
    printMultiStringFieldSwitch(0, sortedCodes.size(), 2, 0, sortedCodes, valueToDesc, b);
    b.append(T[1]).append("}\n");
  }

  private static void printMultiStringFieldSwitch(int beg, int end, int tab, int ix, List<String> sortedCodes, Map<String, String> codeToName, StringBuilder b) {
    b.append(T[tab]).append(ix == 0 ? "return " : "").append("switch(").append("bytes[valBeg").append(ix == 0 ? "" : " + ").append(ix == 0 ? "" : ix).append("]) {\n");
    String firstStringInGroup = sortedCodes.get(beg);
    if(firstStringInGroup.length() == ix) {
      b.append(T[tab + 1]).append("case '").append("\u0001").append("' -> ");
      appendMultiStringFieldSet(b, codeToName, firstStringInGroup);
      beg++;
      firstStringInGroup = sortedCodes.get(beg);
    }
    byte firstCharInGroup = (byte) firstStringInGroup.charAt(ix);
    int sameCharAtIxCount = 1;
    for(int i = beg + 1; beg < end && i < end; i++) {
      String aString = sortedCodes.get(i);
      byte aChar = aString.length() == ix ? (byte) '\u0001' : (byte) aString.charAt(ix);
      if(aChar == firstCharInGroup) {
        sameCharAtIxCount++;
      } else {
        b.append(T[tab + 1]).append("case '").append(firstCharInGroup == '\u0001' ? "\u0001" : (char) firstCharInGroup).append("' -> ");
        if (sameCharAtIxCount == 1) {
          appendMultiStringFieldSet(b, codeToName, firstStringInGroup);
        } else {
          b.append("\n");
          printMultiStringFieldSwitch(beg, beg + sameCharAtIxCount, tab + 1, ix + 1, sortedCodes, codeToName, b);
        }
        beg += sameCharAtIxCount;
        firstStringInGroup = aString;
        firstCharInGroup = aChar;
        sameCharAtIxCount = 1;
      }
    }
    b.append(T[tab + 1]).append("case '").append(firstCharInGroup == '\u0001' ? "\u0001" : (char) firstCharInGroup).append("' -> ");
    if(sameCharAtIxCount == 1) {
      appendMultiStringFieldSet(b, codeToName, firstStringInGroup);
    } else {
      b.append("\n");
      printMultiStringFieldSwitch(beg, beg + sameCharAtIxCount, tab + 1, ix + 1, sortedCodes, codeToName, b);
    }
    b.append(T[tab + 1]).append("default -> throw new RuntimeException(\"value\");\n");
    b.append(T[tab]).append("};\n");
  }

  private static void appendMultiStringFieldSet(StringBuilder b, Map<String, String> codeToName, String firstStringInGroup) {
    String desc = codeToName.get(firstStringInGroup);
    if(Character.isDigit(desc.charAt(0))) {
      desc = "_" + desc;
    }
    b.append(desc).append(";\n");
  }

  private static String toUnderlying(FieldCfg cfg) {
    return switch (cfg.superClassName()) {
      case "StringRef" -> "String";
      case "BooleanRef" -> "boolean";
      case "LongRef" -> "long";
      default -> throw new RuntimeException("Unexpected superclass name: " + cfg.superClassName());
    };
  }

  private static void genFixTag() {
    Map<String, FieldCfg> fields = fields();
    List<FieldCfg> tags = new ArrayList<>(fields.values());
    tags.sort(Comparator.comparingInt(FieldCfg::tag));
    StringBuilder b = new StringBuilder();

    b.append("package ").append(pkgGenRoot).append(";\n\n");
    b.append("import com.mbts.fix.api.*;\n\n");
    b.append("@SuppressWarnings(\"unused\")\n");
    b.append("public class FixTag implements Tag {\n\n");
    tags.forEach(c -> b.append(T[1]).append("public static final Tag ").append(c.varName())
            .append(" = new FixTag(").append(c.tag()).append(", \"").append(c.varName()).append("\");\n"));
    b.append(T[1]).append("public static final Tag unknown = new FixTag(-1, \"unknown\");\n\n");
    b.append(T[1]).append("private final int tag;\n");
    b.append(T[1]).append("private final String fixStringName;\n");
    b.append(T[1]).append("private final byte[] bytes;\n\n");
    b.append(T[1]).append("private FixTag(int tag, String fixStringName) {\n");
    b.append(T[2]).append("this.tag = tag;\n");
    b.append(T[2]).append("this.fixStringName = fixStringName;\n");
    b.append(T[2]).append("this.bytes = (tag + \"=\").getBytes();\n");
    b.append(T[1]).append("}\n\n");
    b.append(T[1]).append("@Override\n");
    b.append(T[1]).append("public int tag() {\n");
    b.append(T[2]).append("return tag;\n");
    b.append(T[1]).append("}\n\n");
    b.append(T[1]).append("@Override\n");
    b.append(T[1]).append("public byte[] bytes() {\n");
    b.append(T[2]).append("return bytes;\n");
    b.append(T[1]).append("}\n\n");
    b.append(T[1]).append("@Override\n");
    b.append(T[1]).append("public String fixStringName() {\n");
    b.append(T[2]).append("return fixStringName;\n");
    b.append(T[1]).append("}\n\n");
    b.append(T[1]).append("@Override\n");
    b.append(T[1]).append("public String toString() {\n");
    b.append(T[2]).append("return new String(bytes);\n");
    b.append(T[1]).append("}\n\n");
    b.append("}");
    writeFile(b, dirGenRoot, "FixTag");
  }

  private static void writeFile(StringBuilder b, String dir, String name) {
    try {
      String fileName = dir + "/" + name + ".java";
      File fieldFile = new File(fileName);
      if(fieldFile.createNewFile()) {
        PrintWriter pw = new PrintWriter(fieldFile);
        pw.write(b.toString());
        pw.close();
      } else {
        throw new RuntimeException("Could not create file: " + fileName);
      }
    } catch (Exception e) {
      log.error("writeFile -", e);
      System.exit(1);
    }
  }

  private static Map<String, FieldCfg> fields() {
    if(fields == null) {
      fields = new HashMap<>();
      NodeList fieldList = docElement().getElementsByTagName("fields").item(0).getChildNodes();
      for(int i = 0; i < fieldList.getLength(); i++) {
        Node child = fieldList.item(i);
        if (child instanceof Element e) {
          if(e.getAttributes().getLength() != 3) {
            log.error("Unexpected attribute count: {}", e.getAttributes().getLength());
          }
          FieldCfg fieldCfg = new FieldCfg()
              .tag(Integer.parseInt(e.getAttribute("number")))
              .className(e.getAttribute("name"))
              .varName(toSmallFirstChar(e.getAttribute("name")))
              .superClassName(toSuper(e.getAttribute("type")));
          NodeList fieldChildNodes = e.getChildNodes();
          if(fieldChildNodes.getLength() > 0) {
            addValues(fieldCfg, fieldChildNodes);
          }
          fields.put(fieldCfg.className(), fieldCfg);
        }
      }
    }
    return fields;
  }

  private static String toSuper(String type) {
    String sup = typeToSuperClassName.get(type);
    if(sup == null) {
      log.error("super not mapped for type: {}", type);
      sup = "StringRef";
    }
    return sup;
  }

  private static String toSmallFirstChar(String str) {
    return Character.toLowerCase(str.charAt(0)) + str.substring(1);
  }

  private static void addValues(FieldCfg fieldCfg, NodeList fieldChildNodes) {
    Map<String, ValueCfg> values = new HashMap<>();
    for(int i = 0; i < fieldChildNodes.getLength(); i++) {
      Node child = fieldChildNodes.item(i);
      if (child instanceof Element e) {
        ValueCfg valueCfg = new ValueCfg()
            .value(e.getAttribute("enum"))
            .desc(e.getAttribute("description"));
        values.put(valueCfg.value() + valueCfg.desc(), valueCfg);
      }
    }
    fieldCfg.values(values);
  }

  private static Element docElement() {
    if(docElement == null) {
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      factory.setValidating(false);
      factory.setIgnoringElementContentWhitespace(true);
      Document doc = null;
      try {
        doc = factory.newDocumentBuilder().parse(defFile());
      } catch (Exception e) {
        log.error("docElement - ", e);
      }
      if(doc == null) {
        log.error("Could not parse xml file: {}", defFile());
        System.exit(1);
      }
      docElement = doc.getDocumentElement();
    }
    return docElement;
  }

  private static File defFile() {
    String xml = options.getOptionValue("fix");
    return new File(xml);
  }
}