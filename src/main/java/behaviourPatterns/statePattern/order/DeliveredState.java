package behaviourPatterns.statePattern.order;

public class DeliveredState implements State {
    @Override
    public void prevState(Package state) {
        state.setState(new OrderedState());
    }

    @Override
    public void nextState(Package state) {
        state.setState(new ReceivedState());
    }

    @Override
    public void currentState() {
        System.out.println("Order is in the delivering state");
    }
}
