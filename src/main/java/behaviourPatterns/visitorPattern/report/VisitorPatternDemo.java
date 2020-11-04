package behaviourPatterns.visitorPattern.report;

public class VisitorPatternDemo {
  public static void main(String[] args) {
    JS js = new JS();
    String xmlFormatForJS = js.accept(new XmlReportVisitorIml());
    System.out.println(xmlFormatForJS);

    String optimizedJSFormat = js.accept(new OptimzedXmlReportVisitor());
    System.out.println(optimizedJSFormat);

    Html html = new Html();
    String xmlFormatForHtml = html.accept(new XmlReportVisitorIml());
    System.out.println(xmlFormatForHtml);
  }
}
