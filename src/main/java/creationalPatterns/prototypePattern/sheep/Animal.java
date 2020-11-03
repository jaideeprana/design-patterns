package creationalPatterns.prototypePattern.sheep;

// Very interesting, an interface extending another interface
public interface Animal extends Cloneable {
  Animal makeClone();
}
