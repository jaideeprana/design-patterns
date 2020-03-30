package behaviourPatterns.chainOfResponnsibilityPattern.numberProcessor;

public class PositiveNumberProcessor implements NumberProcessor {
    private NumberProcessor nextProcessor;

    @Override
    public void processNumber(int number) {
        if (number > 0) {
            System.out.println("The number is positive: " + number);
        }
        else {
            nextProcessor.processNumber(number);
        }
    }

    @Override
    public void setNextProcessor(NumberProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
}
