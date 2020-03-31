package creationalPatterns.facadePattern.car;

public class CarFacade {

    private final CoolingController coolingController;
    private final Radiator radiator;
    private final FuelSupplier fuelSupplier;

    public CarFacade() {
        coolingController = new CoolingController();
        radiator = new Radiator();
        fuelSupplier = new FuelSupplier();
    }

    public void startCar() {
        fuelSupplier.stopSupplyOfFuel();
       radiator.on();
       coolingController.coolTheEngine();
    }

    public void stopCar() {
        coolingController.stopCoolingTheEngine();
        radiator.off();
        fuelSupplier.stopSupplyOfFuel();
    }
}
