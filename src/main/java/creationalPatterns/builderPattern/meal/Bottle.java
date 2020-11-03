package creationalPatterns.builderPattern.meal;

public class Bottle implements Packing {
  @Override
  public String pack() {
    return "Bottle";
  }
}
