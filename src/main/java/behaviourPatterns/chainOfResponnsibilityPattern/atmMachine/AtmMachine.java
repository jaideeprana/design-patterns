package behaviourPatterns.chainOfResponnsibilityPattern.atmMachine;

public class AtmMachine {
    private MoneyDispenser moneyDispenser;

    public AtmMachine() {
        Rs2000Dispenser rs2000Dispenser = new Rs2000Dispenser();
        Rs500Dispenser rs500Dispenser = new Rs500Dispenser();
        Rs100Dispenser rs100Dispenser = new Rs100Dispenser();

        rs500Dispenser.setNextDispenser(rs100Dispenser);
        rs2000Dispenser.setNextDispenser(rs500Dispenser);

        moneyDispenser = rs2000Dispenser;
    }

    public void amountToBeDispensed(int value) {
        moneyDispenser.processRequest(value);
    }
}
