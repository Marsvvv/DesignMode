package Factory.FactoryMethodMode;

/**
 * 工厂方法模式
 * 可以有多个类型的工厂
 * 与简单工厂模式不同的是，简单工厂模式只是对产品的分类
 * 工厂方法模式不但对产品进行分类，对工厂的类型也进行分类
 * 达到工厂产生的产品可以复用，新建工厂也可以复用
 */
public abstract class VehicleFactory {

    protected abstract Vehicle createVehicle(String item);

    public Vehicle orderVehicle(String size, String color) {
        Vehicle vehicle = createVehicle(size);
        vehicle.testVehicle();
        vehicle.setColor(color);
        return vehicle;
    }

}
