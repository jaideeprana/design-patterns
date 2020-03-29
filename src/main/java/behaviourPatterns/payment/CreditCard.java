package behaviourPatterns.payment;

public class CreditCard implements PaymentStrategy {
    @Override
    public void makePayment() {
        System.out.println("Made payment via credit card");
    }
}
