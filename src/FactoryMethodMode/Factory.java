package FactoryMethodMode;

/**
 * 工厂抽象类，用于声明工厂生成实例的接口
 * 本类可以是接口，在工厂模式接口的实现中加入了Template Method Mode
 *
 * @author asus
 * @method create() 此方法是Template Method Mode的重要组成部分，此类给予子类产品接口的简单实现，并且使用一个不可继承的方法进行全体产品的逻辑业务
 */
public abstract class Factory {

    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    //  ==========  生成实例的实现方式   ==========

    //  ==========  1.创建接口由子类实现 ==========

    /**
     * 创建产品接口
     *
     * @param owner owner
     * @return Product
     */
    protected abstract Product createProduct(String owner);

    //  ==========  2.如果子类未实现，进行默认处理    ==========

    /**
     * 子类继承此方法进行重写，如果不重写则此方法为默认处理方法
     *
     * @param owner owner
     * @return Product
     */
    protected Product defaultCreateProduct(String owner) {
        return new IDCard("error");
    }

    //  ==========  3.如果工厂抽象类为接口时，可以使用default关键字进行默认处理    ==========

    /*default Product defaultCreateProduct(String owner) {
        return new IDCard("error");
    }*/

    //  ==========  4.默认处理可以为抛出异常    ==========

    protected Product defaultCreateProductException(String owner) throws Exception {
        throw new Exception();
    }

    /**
     * 注册产品接口
     *
     * @param product product
     */
    protected abstract void registerProduct(Product product);
}
