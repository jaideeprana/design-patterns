package behaviourPatterns.visitorPattern.shoppingCart;

public interface Item {
  public int accept(ShoppingCartVisitor shoppingCartVisitor);
}
