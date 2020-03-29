package behaviourPatterns.strategyPattern.payment;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        PayTM payTM = new PayTM();

        Context context = new Context(creditCard);
        context.executeStrategy();

        Context contextTwo = new Context(payTM);
        contextTwo.executeStrategy();
    }
}
