package Factory.FactoryMethodMode;

public class CarFactory extends VehicleFactory {

    @Override
    protected Vehicle createVehicle(String size) {
        if("small".equals(size)) {
            return new SportCar();
        } else if("big".equals(size)) {
            return new SedanCar();
        } else {
            throw new IllegalArgumentException("create failed, size is not undefined");
        }
    }
}
