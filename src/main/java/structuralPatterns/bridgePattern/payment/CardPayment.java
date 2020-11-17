package structuralPatterns.bridgePattern.payment;

public class CardPayment extends Payment {
  public CardPayment(IPaymentSystem paymentSystem) {
    super(paymentSystem);
  }

  @Override
  void makePayment() {
    paymentSystem.processPayment("Card payment");
  }
}
