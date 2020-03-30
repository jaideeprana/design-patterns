package behaviourPatterns.chainOfResponnsibilityPattern.atmMachine;

public interface MoneyDispenser {
    public void processRequest(int amountToBeDispensed);

    public void setNextDispenser(MoneyDispenser nextDispenser);
}
