package behaviourPatterns.observerPattern.auction;

public class AveragePerson implements Observer {
    private int newBidValue;

    @Override
    public void update(int newBidValue) {
        this.newBidValue = newBidValue;
    }

    public void isEligibleForNewBid() {
        System.out.println(newBidValue >= 5000 ? "The average person can't afford " + newBidValue : "The average " +
                "person can afford " + newBidValue);
    }
}
