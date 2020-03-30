package creationalPatterns.factoryPattern.shape;

import static creationalPatterns.factoryPattern.shape.ShapeEnum.Rectangle;

public class ShapeFactory {
    public Shape createShape(ShapeEnum shapeName) {
        Shape shape;
        switch (shapeName) {
            case Rectangle:
                shape = new Reactangle();
                break;
            case Circle:
                shape = new Circle();
                break;
            default:
                shape = new Triangle();
        }

        return shape;
    }
}
