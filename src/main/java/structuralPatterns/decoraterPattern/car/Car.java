package structuralPatterns.decoraterPattern.car;

public class Car implements ICar {
    @Override
    public void getCapabilities() {
        System.out.println("Basic capabilities of a car");
    }
}
