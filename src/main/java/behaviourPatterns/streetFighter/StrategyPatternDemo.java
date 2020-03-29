package behaviourPatterns.streetFighter;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Ryu ryu = new Ryu();
        ChunLi chunLi = new ChunLi();

        Context context = new Context(ryu);
        context.executeStrategy();

        Context contextTwo = new Context(chunLi);
        contextTwo.executeStrategy();
    }
}
