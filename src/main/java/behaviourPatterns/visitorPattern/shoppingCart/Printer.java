package behaviourPatterns.visitorPattern.shoppingCart;

public class Printer implements Item {
  private final int priceOfCartrige;
  private final int noOfCartrige;
  private final String modelNumber;

  public Printer(int priceOfCartridge, int noOfCartridge, String modelNumber) {
    this.priceOfCartrige = priceOfCartridge;
    this.noOfCartrige = noOfCartridge;
    this.modelNumber = modelNumber;
  }

  public int getPriceOfCartrige() {
    return priceOfCartrige;
  }

  public int getNoOfCartrige() {
    return noOfCartrige;
  }

  public String getModelNumber() {
    return modelNumber;
  }

  @Override
  public int accept(ShoppingCartVisitor shoppingCartVisitor) {
    return shoppingCartVisitor.visit(this);
  }
}
