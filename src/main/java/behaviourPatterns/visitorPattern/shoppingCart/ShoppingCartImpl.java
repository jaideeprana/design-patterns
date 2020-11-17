package behaviourPatterns.visitorPattern.shoppingCart;

public class ShoppingCartImpl implements ShoppingCartVisitor {
  @Override
  public int visit(Computer computer) {
    if (computer.getCost() > 100) {
      System.out.println("Discount applied for computer");
      return computer.getCost() - 50;
    }
    return computer.getCost();
  }

  @Override
  public int visit(Printer printer) {
    int cost = printer.getNoOfCartrige() * printer.getNoOfCartrige();
    System.out.println("Cost for model number: " + printer.getModelNumber() + " is " + cost);

    return cost;
  }

  @Override
  public int visit(Apple apple) {
    if (apple.getCost() > 10) {
      System.out.println("Discount applied for apple");
      return apple.getCost() - 2;
    }
    return apple.getCost();
  }
}
