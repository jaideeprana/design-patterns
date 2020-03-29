package structuralPatterns.decoraterPattern.car;

public class FlyCarDecorater extends CarDecorater {
    public FlyCarDecorater(ICar car) {
        super(car);
    }

    @Override
    public void getCapabilities() {
        super.getCapabilities();
        System.out.println("Can fly");
    }
}
