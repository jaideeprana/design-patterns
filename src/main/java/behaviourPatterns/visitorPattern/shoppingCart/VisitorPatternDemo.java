package behaviourPatterns.visitorPattern.shoppingCart;

public class VisitorPatternDemo {
  public static void main(String[] args) {
    ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();

    Computer computer = new Computer(1, 12);
    Printer printer = new Printer(10, 111, "some_printer_model");
    Apple apple = new Apple(42);

    ShoppingCart shoppingCart = new ShoppingCart(visitor);

    shoppingCart.add(computer)
                .add(printer)
                .add(apple);

    System.out.println("Total cost: " + shoppingCart.calculateTotalCost());
  }

}
