package creationalPatterns.facadePattern.car;

public class FacadePatternDemo {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();

        carFacade.startCar();

        carFacade.startCar();
    }
}
