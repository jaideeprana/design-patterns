package behaviourPatterns.observerPattern.messageSubscription;

public interface Subject {
    public void registerObserver(Observer observer);

    public void unRegisterObserver(Observer observer);

    public void notifyObservers(String message);
}
