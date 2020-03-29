package behaviourPatterns.observerPattern.auction;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        PoorPerson poorPerson = new PoorPerson();
        AveragePerson averagePerson = new AveragePerson();
        Auctioner auctioner = new Auctioner();

        auctioner.registerObserver(poorPerson);
        auctioner.registerObserver(averagePerson);

        auctioner.notifyObservers(5);
        poorPerson.isEligibleForNewBid();
        averagePerson.isEligibleForNewBid();

        auctioner.notifyObservers(100);
        poorPerson.isEligibleForNewBid();
        averagePerson.isEligibleForNewBid();

        auctioner.unRegisterObserver(poorPerson);

        auctioner.notifyObservers(19999);
        poorPerson.isEligibleForNewBid();
        averagePerson.isEligibleForNewBid();
    }
}
