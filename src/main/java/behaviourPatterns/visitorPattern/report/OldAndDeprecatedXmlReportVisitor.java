package behaviourPatterns.visitorPattern.report;

public class OldAndDeprecatedXmlReportVisitor implements XmlReportVisitor {
  @Override
  public String visit(JS js) {
    return "XML format for JS";
  }

  @Override
  public String visit(Html html) {
    return "XML format for HTML";
  }
}
