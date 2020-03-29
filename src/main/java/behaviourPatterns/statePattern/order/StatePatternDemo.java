package behaviourPatterns.statePattern.order;

public class StatePatternDemo {
    public static void main(String[] args) {
        Package packageState = new Package();

        packageState.currentState();
        packageState.nextState();
        packageState.currentState();
        packageState.prevState();
        packageState.currentState();
        packageState.nextState();
        packageState.currentState();
        packageState.nextState();
        packageState.currentState();
        packageState.nextState();
        packageState.currentState();
    }
}
