package behaviourPatterns.strategyPattern.streetFighter;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoryukenSpecialMoveStrategy shoryukenSpecialMoveStrategy = new ShoryukenSpecialMoveStrategy();
        TornadoKickSpecialMoveStrategy tornadoKickSpecialMoveStrategy = new TornadoKickSpecialMoveStrategy();

        Fighter fighter = new Ryu(shoryukenSpecialMoveStrategy);
        fighter.punch();
        fighter.kick();
        fighter.executeStrategy();

        Fighter fighterTwo = new ChunLi(tornadoKickSpecialMoveStrategy);
        fighterTwo.punch();
        fighterTwo.kick();
        fighterTwo.executeStrategy();

        Fighter normalFighter = new Fighter(null);
        normalFighter.punch();
        normalFighter.kick();
        normalFighter.executeStrategy();
    }
}
