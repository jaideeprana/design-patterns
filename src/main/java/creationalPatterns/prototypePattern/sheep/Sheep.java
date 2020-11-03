package creationalPatterns.prototypePattern.sheep;

public class Sheep implements Animal {
  public Sheep() {
    System.out.println("Sheep is made");
  }

  @Override
  public Animal makeClone() {
    System.out.println("Sheep is BEING made");
    Sheep aSheep = null;

    try {
      aSheep = (Sheep) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    return aSheep;
  }

  @Override
  public String toString() {
    return "A great sheep";
  }
}
