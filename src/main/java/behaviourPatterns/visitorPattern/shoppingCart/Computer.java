package behaviourPatterns.visitorPattern.shoppingCart;

public class Computer implements Item {
  private final int cost;
  private final int serialNumber;

  public Computer(int cost, int serialNumber) {
    this.cost = cost;
    this.serialNumber = serialNumber;
  }

  public int getCost() {
    return cost;
  }

  public int getSerialNumber() {
    return serialNumber;
  }


  @Override
  public int accept(ShoppingCartVisitor shoppingCartVisitor) {
    return shoppingCartVisitor.visit(this);
  }
}
