package behaviourPatterns.visitorPattern.report;

public class VisitorPatternDemo {
  public static void main(String[] args) {
    JS js = new JS();
    String xmlFormatForJS = js.accept(new OldAndDeprecatedXmlReportVisitor());
    System.out.println(xmlFormatForJS);

    String optimizedJSFormat = js.accept(new OptimzedXmlReportVisitor());
    System.out.println(optimizedJSFormat);

    Html html = new Html();
    String xmlFormatForHtml = html.accept(new OldAndDeprecatedXmlReportVisitor());
    System.out.println(xmlFormatForHtml);
  }
}
