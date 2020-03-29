package behaviourPatterns.calculator;

public class OperationAdd implements OperationStrategy{
    @Override
    public int doOperation(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
}
