package behaviourPatterns.calculator;

public class Context {
    private OperationStrategy strategy;

    public Context(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int numberOne, int numberTwo){
        return strategy.doOperation(numberOne, numberTwo);
    }
}
