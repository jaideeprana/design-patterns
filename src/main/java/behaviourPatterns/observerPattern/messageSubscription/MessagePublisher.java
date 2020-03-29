package behaviourPatterns.observerPattern.messageSubscription;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
    public List<Observer> observers;

    public MessagePublisher() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}
