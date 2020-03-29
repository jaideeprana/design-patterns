package structuralPatterns.decoraterPattern.iceCream;

public class StrawberryIceCreamDecorator extends IceCreamDecorater {
    public StrawberryIceCreamDecorator(IIceCream iceCream) {
        super(iceCream);
    }

    @Override
    public int getCost() {
        return super.getCost() + 40;
    }
}
