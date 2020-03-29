package structuralPatterns.decoraterPattern.iceCream;

public abstract class IceCreamDecorater implements IIceCream {
    private IIceCream iIceCream;

    public IceCreamDecorater(IIceCream iceCream) {
        this.iIceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iIceCream.getCost();
    }
}
