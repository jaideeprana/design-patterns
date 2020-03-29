package behaviourPatterns.observerPattern.messageSubscription;

public class MessageSubscriberTwo implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Subscriber two recieved the message: " + message);
    }
}
