package behaviourPatterns.chainOfResponnsibilityPattern.numberProcessor;

public class ChainOfResponsiblityDemo {
    public static void main(String[] args) {
        PositiveNumberProcessor positiveNumberProcessor = new PositiveNumberProcessor();
        NegativeNumberProcessor negativeNumberProcessor = new NegativeNumberProcessor();
        ZeroNumberProcessor zeroNumberProcessor = new ZeroNumberProcessor();

        negativeNumberProcessor.setNextProcessor(zeroNumberProcessor);
        positiveNumberProcessor.setNextProcessor(negativeNumberProcessor);

        positiveNumberProcessor.processNumber(0);
        positiveNumberProcessor.processNumber(2);
        positiveNumberProcessor.processNumber(-2);
        positiveNumberProcessor.processNumber(34440);
    }
}
