package behaviourPatterns.visitorPattern.shoppingCart;

public class Apple implements Item {
  private final int cost;

  public Apple(int cost) {
    this.cost = cost;
  }

  public int getCost() {
    return cost;
  }

  @Override
  public int accept(ShoppingCartVisitor shoppingCartVisitor) {
    return shoppingCartVisitor.visit(this);
  }
}
