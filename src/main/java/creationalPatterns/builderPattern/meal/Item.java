package creationalPatterns.builderPattern.meal;

public interface Item {
  String name();
  Packing packing();
  float price();
}
