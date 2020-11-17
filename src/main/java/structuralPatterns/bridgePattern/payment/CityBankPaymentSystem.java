package structuralPatterns.bridgePattern.payment;

/*
 Concrete implementor
*/
public class CityBankPaymentSystem implements IPaymentSystem {
  @Override
  public void processPayment(String paymentMethod) {
    System.out.println("Processing the payment using City bank payment system for " + paymentMethod);
  }
}
