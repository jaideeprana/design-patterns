package structuralPatterns.proxyPattern.internet;

public class ProxyPatternDemo {
  public static void main(String[] args) {
    OfficeInternetAccess access = new ProxyInternetAccess("Jaideep Rana");
    access.grantInternetAccess();
  }
}
