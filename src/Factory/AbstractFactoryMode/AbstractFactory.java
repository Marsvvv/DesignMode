package Factory.AbstractFactoryMode;

import Factory.AbstractFactoryMode.ProductA.AbstractProductA;
import Factory.AbstractFactoryMode.ProductB.AbstractProductB;

public abstract class AbstractFactory {

    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
