package behaviourPatterns.statePattern.order;

public class OrderedState implements State {
    @Override
    public void prevState(Package state) {
        System.out.println("This is the initial state, can't go to prev");
    }

    @Override
    public void nextState(Package state) {
        state.setState(new DeliveredState());
    }

    @Override
    public void currentState() {
        System.out.println("Order is in the initial state");
    }
}
