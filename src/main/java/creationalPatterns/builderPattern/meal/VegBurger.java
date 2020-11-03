package creationalPatterns.builderPattern.meal;

public class VegBurger extends Burger {
  @Override
  public String name() {
    return "Veg burger";
  }

  @Override
  public float price() {
    return 2;
  }
}
