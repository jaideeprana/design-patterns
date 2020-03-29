package structuralPatterns.decoraterPattern.iceCream;

public class ChocolateIceCreamDecorater extends IceCreamDecorater {
    public ChocolateIceCreamDecorater(IIceCream iceCream) {
        super(iceCream);
    }

    @Override
    public int getCost() {
        return super.getCost() + 90;
    }
}
