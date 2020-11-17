package creationalPatterns.prototypePattern.sheep;

/*
 No need to create repetitive objects for manipulation simply create clones of your desired object.
 or
 If the object or some of the values are coming from DB why create again from DB.
*/
public class prototypePatternDemo {
  public static void main(String[] args) {
    Sheep sillySheep = new Sheep();

    CloneFactory cloneFactory = new CloneFactory();
    Sheep clonedSillySheep = (Sheep) cloneFactory.getClone(sillySheep);

    System.out.println(sillySheep);
    System.out.println(sillySheep);

    System.out.println("Original sub-class: " + sillySheep.hashCode());
    System.out.println("Cloned sub-class: " + clonedSillySheep.hashCode());
  }
}
