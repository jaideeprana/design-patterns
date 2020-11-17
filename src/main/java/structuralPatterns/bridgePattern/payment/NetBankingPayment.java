package structuralPatterns.bridgePattern.payment;

public class NetBankingPayment extends Payment {
  public NetBankingPayment(IPaymentSystem paymentSystem) {
    super(paymentSystem);
  }

  @Override
  void makePayment() {
    paymentSystem.processPayment("Net banking payment");
  }
}
