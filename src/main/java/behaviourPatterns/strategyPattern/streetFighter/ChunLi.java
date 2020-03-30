package behaviourPatterns.strategyPattern.streetFighter;

public class ChunLi extends Fighter {
    public ChunLi(SpecialMoveStrategy specialMoveStrategy) {
        super(specialMoveStrategy);
    }

    @Override
    public void kick() {
        System.out.println("Throw a question mark kick to the head of the opponent");
    }
}
