package behaviourPatterns.commandPattern.stock;

public class BuyStock implements Command {
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
       stock.buyStock();
    }
}
