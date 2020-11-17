package behaviourPatterns.visitorPattern.shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
  private final List<Item> items;
  private final ShoppingCartVisitor visitor;

  public ShoppingCart(ShoppingCartVisitor visitor) {
    this.visitor = visitor;
    this.items = new ArrayList<>();
  }

  public ShoppingCart add(Item item) {
    items.add(item);

    return this;
  }

  public int calculateTotalCost() {
    return items.stream()
      .mapToInt(item -> item.accept(visitor)).sum();
  }
}
