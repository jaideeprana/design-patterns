package behaviourPatterns.visitorPattern.report;

public class JS implements XmlReportVisitable {
  @Override
  public String accept(XmlReportVisitor xmlReportVisitor) {
    return xmlReportVisitor.visit(this);
  }
}
