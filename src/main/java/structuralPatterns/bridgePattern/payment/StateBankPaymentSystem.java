package structuralPatterns.bridgePattern.payment;

/*
 Concrete implementor
*/
public class StateBankPaymentSystem implements IPaymentSystem {
  @Override
  public void processPayment(String paymentMethod) {
    System.out.println("Processing the payment using State bank payment system for " + paymentMethod);
  }
}
