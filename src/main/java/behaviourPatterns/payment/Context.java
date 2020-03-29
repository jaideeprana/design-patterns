package behaviourPatterns.payment;

public class Context {
    private PaymentStrategy paymentStrategy;

    public Context(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

   public void executeStrategy(){
        paymentStrategy.makePayment();
   }
}
