package behaviourPatterns.commandPattern.stock;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();

        Broker broker = new Broker();
        broker.takeOrder(new BuyStock(stock));
        broker.takeOrder(new BuyStock(new Stock()));
        broker.takeOrder(new SellStock(new Stock()));

        broker.placeOrders();

        System.out.println("--- Fresh orders ---");
        broker.takeOrder(new SellStock(stock));
        broker.placeOrders();
    }
}
