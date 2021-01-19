package Builder;

/**
 * 建造者模式用于组装复杂的实例
 *
 * @author asus
 */
public class Main {

    public static void main(String[] args) {
        CarDirector carDirector = new ConcreteCarDirector(new ConcreteCarBuilder());
        Car car = carDirector.buildCar();
        System.out.println(car.toString());
    }
}
