package structuralPatterns.decoraterPattern.iceCream;

public class DecoraterPatternDemo {
    public static void main(String[] args) {
        IceCream iceCream = new IceCream();
        ChocolateIceCreamDecorater chocolateIceCreamDecorater = new ChocolateIceCreamDecorater(iceCream);
        System.out.println(chocolateIceCreamDecorater.getCost());

        StrawberryIceCreamDecorator strawberryIceCreamDecorator = new StrawberryIceCreamDecorator(iceCream);
        System.out.println(strawberryIceCreamDecorator.getCost());
    }
}
