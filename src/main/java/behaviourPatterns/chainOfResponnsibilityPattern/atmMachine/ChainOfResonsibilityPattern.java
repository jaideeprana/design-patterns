package behaviourPatterns.chainOfResponnsibilityPattern.atmMachine;

public class ChainOfResonsibilityPattern {
    public static void main(String[] args) {
        AtmMachine atmMachine = new AtmMachine();

        System.out.println("Request for Rs 2000");
        atmMachine.amountToBeDispensed(2000);

        System.out.println("Request for Rs 2500");
        atmMachine.amountToBeDispensed(2500);

        System.out.println("Request for Rs 500");
        atmMachine.amountToBeDispensed(500);

        System.out.println("Request for Rs 100");
        atmMachine.amountToBeDispensed(100);

        System.out.println("Request for Re 1");
        atmMachine.amountToBeDispensed(1);
    }
}
