package behaviourPatterns.chainOfResponnsibilityPattern.atmMachine;

public class Rs100Dispenser implements MoneyDispenser {
    public static final int RS_100_NOTE_VALUE = 100;
    private MoneyDispenser nextDispenser;

    @Override
    public void processRequest(int amountToBeDispensed) {
        if (amountToBeDispensed >= RS_100_NOTE_VALUE) {
            int totalRs100Notes = amountToBeDispensed / RS_100_NOTE_VALUE;
            System.out.println("Total Rs 100 notes dispensed: " + totalRs100Notes);

            handleRemainingAmount(amountToBeDispensed);
        }
        else {
            System.out.println("Amount can't be dispensed");
        }
    }

    private void handleRemainingAmount(int amountToBeDispensed) {
        int amountRemaining = amountToBeDispensed % RS_100_NOTE_VALUE;
        if (amountRemaining != 0) {
            nextDispenser.processRequest(amountToBeDispensed);
        }
    }

    @Override
    public void setNextDispenser(MoneyDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }
}
