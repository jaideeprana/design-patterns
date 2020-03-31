package creationalPatterns.abstractFatoryPattern;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(ShapeType shapeType) {
        Shape shape;
        if (ShapeType.ROUNDED_RECTANGLE.equals(shapeType)) {
            shape = new RoundedRectangle();
        } else if (ShapeType.ROUNDED_SQUARE.equals(shapeType)) {
            shape = new RoundedSquare();
        } else {
            shape = null;
        }
        return shape;
    }
}
