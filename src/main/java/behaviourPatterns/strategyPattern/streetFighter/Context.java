package behaviourPatterns.strategyPattern.streetFighter;

public class Context {
    private SpecialMoveStrategy specialMoveStrategy;

    public Context(SpecialMoveStrategy specialMoveStrategy) {
        this.specialMoveStrategy = specialMoveStrategy;
    }

    public void executeStrategy(){
        specialMoveStrategy.performSpecialMove();
    }
}
