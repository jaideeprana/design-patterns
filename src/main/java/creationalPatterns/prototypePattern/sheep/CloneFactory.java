package creationalPatterns.prototypePattern.sheep;

public class CloneFactory {
  public Animal getClone(Animal anAnimal) {
    return anAnimal.makeClone();
  }
}
