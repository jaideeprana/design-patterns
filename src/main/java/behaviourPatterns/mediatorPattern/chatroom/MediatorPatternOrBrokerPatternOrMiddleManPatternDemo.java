package behaviourPatterns.mediatorPattern.chatroom;

/*
 Reduces the communication complexity b/w various objects.
 The pattern provides a mediator that handles all the communication b/w various classes.
*/
public class MediatorPatternOrBrokerPatternOrMiddleManPatternDemo {
  public static void main(String[] args) {
   ChatMediator mediator = new ChatMediatorImpl();
    User user1 = new UserImpl(mediator, "Pankaj");
    User user2 = new UserImpl(mediator, "Lisa");
    User user3 = new UserImpl(mediator, "Saurabh");
    User user4 = new UserImpl(mediator, "David");
    mediator.addUser(user1);
    mediator.addUser(user2);
    mediator.addUser(user3);
    mediator.addUser(user4);

    user1.send("Hi All");

  }
}
