package structuralPatterns.bridgePattern.payment;

/*
 Implementor interface
*/
public interface IPaymentSystem {
  void processPayment(String paymentMethod);
}
