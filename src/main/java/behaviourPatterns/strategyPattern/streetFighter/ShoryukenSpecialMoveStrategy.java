package behaviourPatterns.strategyPattern.streetFighter;

public class ShoryukenSpecialMoveStrategy implements SpecialMoveStrategy {
    @Override
    public void performSpecialMove() {
        System.out.println("Shoryuken executed");
    }
}
