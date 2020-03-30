package behaviourPatterns.chainOfResponnsibilityPattern.atmMachine;

public class Rs500Dispenser implements MoneyDispenser {
    public static final int RS_500_NOTE_VALUE = 500;
    private MoneyDispenser nextDispenser;

    @Override
    public void processRequest(int amountToBeDispensed) {
        if (amountToBeDispensed >= RS_500_NOTE_VALUE) {
            int totalRs500Notes = amountToBeDispensed / RS_500_NOTE_VALUE;
            System.out.println("Total Rs 500 notes dispensed: " + totalRs500Notes);

            handleRemainingAmount(amountToBeDispensed);
        }
        else{
           nextDispenser.processRequest(amountToBeDispensed);
        }
    }

    private void handleRemainingAmount(int amountToBeDispensed) {
        int amountRemaining = amountToBeDispensed % RS_500_NOTE_VALUE;
        if (amountRemaining != 0) {
            nextDispenser.processRequest(amountToBeDispensed);
        }
    }

    @Override
    public void setNextDispenser(MoneyDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }
}
