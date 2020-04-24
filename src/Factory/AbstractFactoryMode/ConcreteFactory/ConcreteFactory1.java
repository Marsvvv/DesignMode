package Factory.AbstractFactoryMode.ConcreteFactory;

import Factory.AbstractFactoryMode.AbstractFactory;
import Factory.AbstractFactoryMode.ProductA.AbstractProductA;
import Factory.AbstractFactoryMode.ProductA.ProductA1;
import Factory.AbstractFactoryMode.ProductB.AbstractProductB;
import Factory.AbstractFactoryMode.ProductB.ProductB1;

public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
