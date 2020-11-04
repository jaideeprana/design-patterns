package behaviourPatterns.visitorPattern.report;

public interface XmlReportVisitor {
  String visit(JS js);
  String visit(Html html);
}
