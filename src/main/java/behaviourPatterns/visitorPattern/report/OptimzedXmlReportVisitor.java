package behaviourPatterns.visitorPattern.report;

public class OptimzedXmlReportVisitor implements XmlReportVisitor {
  @Override
  public String visit(JS js) {
    return "Optimzed format for JS";
  }

  @Override
  public String visit(Html html) {
    return "Optimzed format for HTML";
  }
}
