package FactoryMethodMode;

/**
 * 真实的产品类： IdCard
 * 实现功能方法
 *
 * @author asus
 */
public class IDCard extends Product {

    private String owner;

    public IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }
}
