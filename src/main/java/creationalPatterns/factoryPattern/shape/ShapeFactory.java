package creationalPatterns.factoryPattern.shape;

import static creationalPatterns.factoryPattern.shape.ShapeEnum.Rectangle;

public class ShapeFactory {
    public Shape createShape(ShapeEnum shapeName) {
        Shape shape;

        /*The following code is hidden from the client code, as it need not to know how to create a shape
        * Client code is only interested in getting the shape to work upon. And we have decoupled the creation
        * implementation. Tomorrow if the creation implementation changes we only need to make changes in this file. */
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
