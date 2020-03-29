package behaviourPatterns.streetFighter;

public class Ryu implements SpecialMoveStrategy {
    @Override
    public void performSpecialMove() {
        System.out.println("Shoryuken executed");
    }
}
