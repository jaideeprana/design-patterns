package behaviourPatterns.statePattern.order;

public class ReceivedState implements State {
    @Override
    public void prevState(Package state) {
        state.setState(new DeliveredState());
    }

    @Override
    public void nextState(Package state) {
        System.out.println("Ordered has been received by client");
    }

    @Override
    public void currentState() {
        System.out.println("Order is in the received state");
    }
}
