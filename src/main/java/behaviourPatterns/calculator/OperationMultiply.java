package behaviourPatterns.calculator;

public class OperationMultiply implements OperationStrategy {
    @Override
    public int doOperation(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
}
