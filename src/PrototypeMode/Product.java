package PrototypeMode;

/**
 * Prototype原型：定义用于复制现有实例来生成新实例的方法
 *
 * @author asus
 */
public interface Product extends Cloneable {

    /**
     * 实例的功能方法
     *
     * @param s s
     */
    void use(String s);

    /**
     * 生成新实例的方法
     *
     * @return Product
     */
    Product createClone();
}
