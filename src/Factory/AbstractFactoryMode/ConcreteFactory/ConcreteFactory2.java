package Factory.AbstractFactoryMode.ConcreteFactory;

import Factory.AbstractFactoryMode.AbstractFactory;
import Factory.AbstractFactoryMode.ProductA.AbstractProductA;
import Factory.AbstractFactoryMode.ProductA.ProductA2;
import Factory.AbstractFactoryMode.ProductB.AbstractProductB;
import Factory.AbstractFactoryMode.ProductB.ProductB2;

public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
