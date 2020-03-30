package creationalPatterns.factoryPattern.shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("It's a triangle");
    }
}
