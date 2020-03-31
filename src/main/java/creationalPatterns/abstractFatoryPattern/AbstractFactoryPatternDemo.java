package creationalPatterns.abstractFatoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory(true);
        Shape shape = factory.getShape(ShapeType.ROUNDED_RECTANGLE);
        shape.draw();

        factory = FactoryProducer.getFactory(false);
        Shape shapeTwo = factory.getShape(ShapeType.SQUARE);
        shapeTwo.draw();
    }
}
