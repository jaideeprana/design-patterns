package behaviourPatterns.chainOfResponnsibilityPattern.numberProcessor;

public interface NumberProcessor {
    public void processNumber(int number);

    public void setNextProcessor(NumberProcessor nextProcessor);
}
