package Builder;

/**
 * 抽象建造者，抽象对各个部分的构造
 */
public interface CarBuilder {

    Tyre buildTyre();

    Engine buildEngine();

    Chassis buildChassis();

    CarBody buildCarBody();

    Electrical buildElectrical();
}
