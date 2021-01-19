package Builder;

/**
 * 实际各个组件的建造者
 */
public class ConcreteCarBuilder implements CarBuilder {

    @Override
    public Tyre buildTyre() {
        System.out.println("构建轮胎");
        return new Tyre("Audi的轮胎");
    }

    @Override
    public Engine buildEngine() {
        System.out.println("构建发动机");
        return new Engine("Audi的发动机");
    }

    @Override
    public Chassis buildChassis() {
        System.out.println("构建底盘");
        return new Chassis("Audi的底盘");
    }

    @Override
    public CarBody buildCarBody() {
        System.out.println("构建车身");
        return new CarBody("Audi的车身");
    }

    @Override
    public Electrical buildElectrical() {
        System.out.println("构建电器设备");
        return new Electrical("Audi的电器设备");
    }
}
