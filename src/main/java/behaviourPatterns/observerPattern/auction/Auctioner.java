package behaviourPatterns.observerPattern.auction;

import java.util.ArrayList;
import java.util.List;

public class Auctioner implements Subject {
    private List<Observer> bidders;

    public Auctioner() {
        bidders = new ArrayList<>();
    }

    public void registerObserver(Observer bidder){
        bidders.add(bidder);
    }

    @Override
    public void unRegisterObserver(Observer bidder) {
        bidders.remove(bidder);
    }

    public void notifyObservers(int newBid){
        bidders.forEach(observer -> observer.update(newBid));
    }
}
