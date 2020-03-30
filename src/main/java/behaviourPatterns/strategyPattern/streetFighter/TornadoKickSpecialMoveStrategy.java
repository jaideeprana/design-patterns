package behaviourPatterns.strategyPattern.streetFighter;

public class TornadoKickSpecialMoveStrategy implements SpecialMoveStrategy {
    @Override
    public void performSpecialMove() {
        System.out.println("Tornado kick executed");
    }
}
