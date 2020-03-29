package behaviourPatterns.statePattern.order;

public interface State {
    public void prevState(Package state);

    public void nextState(Package state);

    public void currentState();
}
