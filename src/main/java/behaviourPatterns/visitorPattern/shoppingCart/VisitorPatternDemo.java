package behaviourPatterns.visitorPattern.shoppingCart;

public class VisitorPatternDemo {
  public static void main(String[] args) {
    ShoppingCartVisitor visitor = new ShoppingCartImpl();

    Computer computer = new Computer(1, 12);
    Printer printer = new Printer(10, 111, "some_printer_model");
    Apple apple = new Apple(42);

    System.out.println("Total cost: " + calculateTotalCost(visitor, computer, printer, apple));
  }

  private static int calculateTotalCost(ShoppingCartVisitor visitor, Computer computer, Printer printer, Apple apple) {
    int computerFinalCost = computer.accept(visitor);
    int printerFinalCost = printer.accept(visitor);
    int appleFinalCost = apple.accept(visitor);

    return computerFinalCost + printerFinalCost + appleFinalCost;
  }
}
