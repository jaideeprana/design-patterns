package behaviourPatterns.observerPattern.auction;

public class PoorPerson implements Observer {
    private int newBidValue;

    @Override
    public void update(int newBidValue) {
        this.newBidValue = newBidValue;
    }

    public void isEligibleForNewBid(){
        System.out.println(newBidValue >= 100 ? "The poor person can't afford " + newBidValue : "The Poor person can afford " + newBidValue);
    }
}
