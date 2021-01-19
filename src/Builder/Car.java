package Builder;

/**
 * 车
 *
 * @author asus
 */
public class Car {

    private Tyre tyre;

    private Engine engine;

    private Chassis chassis;

    private CarBody carBody;

    private Electrical electrical;

    public Car(Tyre tyre, Engine engine, Chassis chassis, CarBody carBody, Electrical electrical) {
        this.tyre = tyre;
        this.engine = engine;
        this.chassis = chassis;
        this.carBody = carBody;
        this.electrical = electrical;
    }

    @Override
    public String toString() {
        return "Car{" +
                "tyre=" + tyre.getName() +
                ", engine=" + engine.getName() +
                ", chassis=" + chassis.getName() +
                ", carBody=" + carBody.getName() +
                ", electrical=" + electrical.getName() +
                '}';
    }
}
