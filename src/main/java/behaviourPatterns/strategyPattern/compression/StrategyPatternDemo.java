package behaviourPatterns.strategyPattern.compression;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        WinRar winRar = new WinRar();
        WinZip winZip = new WinZip();

        Context context = new Context(winRar);
        context.executeStrategy("sample-file");

        Context contextTwo = new Context(winZip);
        contextTwo.executeStrategy("sample-file");
    }
}
