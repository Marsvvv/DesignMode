package PrototypeMode;

import java.util.HashMap;

/**
 * Client：负责存放和读取所需的Prototype原型实例
 *
 * @author asus
 */
public class Manager {

    private HashMap showCase = new HashMap();

    public void register(String name, Product proto) {
        showCase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = (Product) showCase.get(protoName);
        return p;
    }

}
