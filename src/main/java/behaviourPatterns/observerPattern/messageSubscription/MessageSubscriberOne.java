package behaviourPatterns.observerPattern.messageSubscription;

public class MessageSubscriberOne implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Subscriber one recieved the message: " + message);
    }
}
