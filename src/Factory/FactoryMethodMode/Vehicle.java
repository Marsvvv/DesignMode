package Factory.FactoryMethodMode;

public abstract class Vehicle {

    public String color;

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void testVehicle();

    @Override
    public String toString() {
        return "color:" + color;
    }
}
