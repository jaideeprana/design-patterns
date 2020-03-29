package behaviourPatterns.statePattern.order;

public class Package implements StateMachine {
    private State packageState = new OrderedState();

    @Override
    public void setState(State state) {
        packageState = state;
    }

    @Override
    public void prevState() {
        packageState.prevState(this);
    }

    @Override
    public void nextState() {
        packageState.nextState(this);
    }

    @Override
    public void currentState() {
        packageState.currentState();
    }
}
