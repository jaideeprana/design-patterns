package structuralPatterns.decoraterPattern.car;

public class DecoraterPatternDemo {
    public static void main(String[] args) {
        Car car = new Car();
        SportsCarDecorater sportsCarDecorater = new SportsCarDecorater(car);
        sportsCarDecorater.getCapabilities();

        FlyCarDecorater flyCarDecorater = new FlyCarDecorater(car);
        flyCarDecorater.getCapabilities();

        CarDecorater speedyFlyingCar = new FlyCarDecorater(new SportsCarDecorater(new Car()));
        speedyFlyingCar.getCapabilities();
    }
}
