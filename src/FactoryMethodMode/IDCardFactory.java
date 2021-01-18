package FactoryMethodMode;

import java.util.ArrayList;
import java.util.List;

/**
 * 真实的工厂类
 * 实现创建的功能
 *
 * @author asus
 */
public class IDCardFactory extends Factory {

    private List<Object> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<Object> getOwners() {
        return owners;
    }
}
