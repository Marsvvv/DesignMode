package Factory.SimpleFactoryMode;

/**
 * 简单工厂模式
 * 作用：实现逻辑的封装(多态)
 * 通过公共的接口提供对象的实例化服务
 */
public class VehicleFactory {

    public enum VehicleType {
        Bike,Car,Truck;
    }

    public static Vehicle create(VehicleType type) {
        if(VehicleType.Bike.equals(type)) {
            return new Bike();
        } else if(VehicleType.Car.equals(type)) {
            return new Car();
        } else if(VehicleType.Truck.equals(type)) {
            return new Truck();
        } else {
            throw new IllegalArgumentException("create failed, type is not undefined");
        }
    }
}
