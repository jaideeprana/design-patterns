package behaviourPatterns.chainOfResponnsibilityPattern.atmMachine;

public class Rs2000Dispenser implements MoneyDispenser {
    public static final int RS_2000_NOTE_VALUE = 2000;
    private MoneyDispenser nextDispenser;

    @Override
    public void processRequest(int amountToBeDispensed) {
        if (amountToBeDispensed >= RS_2000_NOTE_VALUE) {
            int totalRs2000Notes = amountToBeDispensed / RS_2000_NOTE_VALUE;
            System.out.println("Total Rs 2000 notes dispensed: " + totalRs2000Notes);

            handleRemainingAmount(amountToBeDispensed);
        }
        else {
            nextDispenser.processRequest(amountToBeDispensed);
        }
    }

    private void handleRemainingAmount(int amountToBeDispensed) {
        int amountRemaining = amountToBeDispensed % RS_2000_NOTE_VALUE;
        if (amountRemaining != 0) {
            nextDispenser.processRequest(amountToBeDispensed);
        }
    }

    @Override
    public void setNextDispenser(MoneyDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }
}
