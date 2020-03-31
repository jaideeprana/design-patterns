package creationalPatterns.abstractFatoryPattern;

public class RegularShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(ShapeType shapeType) {
        Shape shape;
        if (ShapeType.RECTANGLE.equals(shapeType)) {
            shape = new Reactangle();
        } else if (ShapeType.SQUARE.equals(shapeType)) {
            shape = new Square();
        } else {
            shape = null;
        }
        return shape;
    }
}
