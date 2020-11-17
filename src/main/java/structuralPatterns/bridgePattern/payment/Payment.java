package structuralPatterns.bridgePattern.payment;

/*
 Abstraction
*/
public abstract class Payment {
  IPaymentSystem paymentSystem;

  public Payment(IPaymentSystem paymentSystem) {
    this.paymentSystem = paymentSystem;
  }

  abstract void makePayment();
}
