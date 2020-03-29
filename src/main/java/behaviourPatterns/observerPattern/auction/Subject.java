package behaviourPatterns.observerPattern.auction;

public interface Subject {
    public void registerObserver(Observer observer);

    public void unRegisterObserver(Observer observer);

    public void notifyObservers(int newValue);
}
