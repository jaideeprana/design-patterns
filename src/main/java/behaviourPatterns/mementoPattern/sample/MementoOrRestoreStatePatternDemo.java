package behaviourPatterns.mementoPattern.sample;

public class MementoOrRestoreStatePatternDemo {
  public static void main(String[] args) {
/*
    originator : the object for which the state is to be saved. It creates the memento and uses it in future to undo.
    memento : the object that is going to maintain the state of originator. Its just a POJO.
    caretaker : the object that keeps track of multiple memento. Like maintaining savepoints.
*/

    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();

    originator.setState("State #1");
    originator.setState("State #2");
    careTaker.add(originator.saveStateToMemento());

    originator.setState("State #3");
    careTaker.add(originator.saveStateToMemento());

    originator.setState("State #4");
    System.out.println("Current State: " + originator.getState());

    originator.getStateFromMemento(careTaker.get(0));
    System.out.println("First saved State: " + originator.getState());
    originator.getStateFromMemento(careTaker.get(1));
    System.out.println("Second saved State: " + originator.getState());
  }
}
