package creationalPatterns.prototypePattern.sheep;

public class prototypePatternDemo {
  public static void main(String[] args) {
    Sheep sillySheep = new Sheep();

    CloneFactory cloneFactory = new CloneFactory();
    Sheep clonedSillySheep = (Sheep) cloneFactory.getClone(sillySheep);

    System.out.println(sillySheep);
    System.out.println(sillySheep);

    System.out.println("Original sub-class: " + sillySheep.hashCode());
    System.out.println("Original sub-class: " + clonedSillySheep.hashCode());
  }
}
