package behaviourPatterns.strategyPattern.payment;

public class PayTM implements PaymentStrategy {
    @Override
    public void makePayment() {
        System.out.println("Made payment via payTM");
    }
}
