package behaviourPatterns.visitorPattern.report;

public class Html implements XmlReportVisitable {
  @Override
  public String accept(XmlReportVisitor xmlReportVisitor) {
    return xmlReportVisitor.visit(this);
  }
}
