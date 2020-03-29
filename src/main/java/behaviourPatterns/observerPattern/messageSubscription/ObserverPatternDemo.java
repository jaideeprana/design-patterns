package behaviourPatterns.observerPattern.messageSubscription;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        MessageSubscriberOne messageSubscriberOne = new MessageSubscriberOne();
        MessageSubscriberTwo messageSubscriberTwo = new MessageSubscriberTwo();
        MessagePublisher messagePublisher = new MessagePublisher();

        messagePublisher.registerObserver(messageSubscriberOne);
        messagePublisher.registerObserver(messageSubscriberTwo);

        messagePublisher.notifyObservers("New message one");

        messagePublisher.unRegisterObserver(messageSubscriberTwo);
        messagePublisher.notifyObservers("New message one");
    }
}
