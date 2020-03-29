package structuralPatterns.decoraterPattern.car;

public abstract class CarDecorater implements ICar{
    private ICar car;

    public CarDecorater(ICar car) {
        this.car = car;
    }

    @Override
    public void getCapabilities() {
        car.getCapabilities();
    }
}
