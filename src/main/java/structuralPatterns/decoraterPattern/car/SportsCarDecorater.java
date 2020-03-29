package structuralPatterns.decoraterPattern.car;

public class SportsCarDecorater extends CarDecorater {
    public SportsCarDecorater(ICar car) {
        super(car);
    }

    @Override
    public void getCapabilities() {
        super.getCapabilities();
        System.out.println("Is very fast");
    }
}
