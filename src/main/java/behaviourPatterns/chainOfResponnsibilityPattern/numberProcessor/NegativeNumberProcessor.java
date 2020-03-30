package behaviourPatterns.chainOfResponnsibilityPattern.numberProcessor;

public class NegativeNumberProcessor implements NumberProcessor {
    private NumberProcessor nextProcessor;

    @Override
    public void processNumber(int number) {
        if (number < 0) {
            System.out.println("The number is negative: " + number);
        } else {
            nextProcessor.processNumber(number);
        }
    }

    @Override
    public void setNextProcessor(NumberProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
}
