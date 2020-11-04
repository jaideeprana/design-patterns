package behaviourPatterns.visitorPattern.report;

public interface XmlReportVisitable {
  String accept(XmlReportVisitor xmlReportVisitor);
}
