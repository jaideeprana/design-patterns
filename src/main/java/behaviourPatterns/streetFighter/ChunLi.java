package behaviourPatterns.streetFighter;

public class ChunLi implements SpecialMoveStrategy {
    @Override
    public void performSpecialMove() {
        System.out.println("Tornado kick executed");
    }
}
