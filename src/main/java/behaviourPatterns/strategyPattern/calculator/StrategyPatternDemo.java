package behaviourPatterns.strategyPattern.calculator;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        OperationAdd operationAdd = new OperationAdd();
        OperationMultiply operationMultiply = new OperationMultiply();

        Context context = new Context(operationAdd);
        System.out.println(context.executeStrategy(1, 2));

        Context contextTwo = new Context(operationMultiply);
        System.out.println(contextTwo.executeStrategy(1, 2));
    }
}
