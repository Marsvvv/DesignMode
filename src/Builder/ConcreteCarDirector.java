package Builder;

/**
 * 监工实现类
 *
 * @author asus
 */
public class ConcreteCarDirector implements CarDirector {

    private CarBuilder carBuilder;

    public ConcreteCarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    @Override
    public Car buildCar() {
        CarBody carBody = carBuilder.buildCarBody();
        Engine engine = carBuilder.buildEngine();
        Chassis chassis = carBuilder.buildChassis();
        Tyre tyre = carBuilder.buildTyre();
        Electrical electrical = carBuilder.buildElectrical();
        return new Car(tyre, engine, chassis, carBody, electrical);
    }
}
