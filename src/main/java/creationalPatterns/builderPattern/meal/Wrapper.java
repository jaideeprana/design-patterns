package creationalPatterns.builderPattern.meal;

public class Wrapper implements Packing {

  @Override
  public String pack() {
    return "Wrapper";
  }
}
