package creationalPatterns.factoryPattern.shape;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.createShape(ShapeEnum.Circle);
        circle.draw();

        Shape rectangle = shapeFactory.createShape(ShapeEnum.Rectangle);
        rectangle.draw();

        Shape triangle = shapeFactory.createShape(ShapeEnum.Triangle);
        triangle.draw();
    }
}
