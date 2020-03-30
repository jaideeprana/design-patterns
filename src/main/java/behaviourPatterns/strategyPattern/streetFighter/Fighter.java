package behaviourPatterns.strategyPattern.streetFighter;

public class Fighter {
    public void punch() {
        System.out.println("Throw a normal punch");
    }

    public void kick() {
        System.out.println("Throw a normal kick");
    }

    private SpecialMoveStrategy specialMoveStrategy;

    public Fighter(SpecialMoveStrategy specialMoveStrategy) {
        this.specialMoveStrategy = specialMoveStrategy;
    }

    public void executeStrategy(){
        if (specialMoveStrategy != null) {
            specialMoveStrategy.performSpecialMove();
        } else {
            System.out.println("He/She is a mediocre fighter doesn't have any special move");
        }
    }
}
