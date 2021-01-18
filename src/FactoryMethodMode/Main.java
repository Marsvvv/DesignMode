package FactoryMethodMode;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product product1 = factory.createProduct("小明");
        Product product2 = factory.createProduct("小红");
        Product product3 = factory.createProduct("小刚");
        product1.use();
        product2.use();
        product3.use();
    }
}
