package behaviourPatterns.strategyPattern.streetFighter;

public class Ryu extends Fighter {
    public Ryu(SpecialMoveStrategy specialMoveStrategy) {
        super(specialMoveStrategy);
    }

    @Override
    public void punch() {
        System.out.println("Throw a vicious and mean overhand right");
    }
}
