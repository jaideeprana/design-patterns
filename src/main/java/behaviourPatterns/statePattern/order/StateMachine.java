package behaviourPatterns.statePattern.order;

public interface StateMachine {
    public void setState(State state);

    public void prevState();

    public void nextState();

    public void currentState();
}
