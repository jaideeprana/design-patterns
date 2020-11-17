package behaviourPatterns.visitorPattern.shoppingCart;

public interface ShoppingCartVisitor {
  int visit(Computer computer);
  int visit(Printer printer);
  int visit(Apple apple);
}
