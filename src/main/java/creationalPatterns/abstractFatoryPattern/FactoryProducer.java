package creationalPatterns.abstractFatoryPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        AbstractFactory factory;
        if (rounded) {
            factory = new RoundedShapeFactory();
        } else {
           factory = new RegularShapeFactory();
        }
        return factory;
    }
}
