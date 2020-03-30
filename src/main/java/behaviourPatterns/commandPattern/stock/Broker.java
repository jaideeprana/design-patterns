package behaviourPatterns.commandPattern.stock;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Command> orders;

    public Broker() {
        this.orders = new ArrayList<>();
    }

    public void takeOrder(Command order) {
        orders.add(order);
    }

    public void placeOrders(){
        orders.forEach(Command::execute);
        orders.clear();
    }
}
