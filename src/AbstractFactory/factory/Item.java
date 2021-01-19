package AbstractFactory.factory;

/**
 * 抽象零件类
 *
 * @author asus
 */
public abstract class Item {

    /**
     * 标题
     */
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    /**
     * 返回HTML文件的内容，需要子类去实现
     *
     * @return String
     */
    public abstract String makeHTML();
}
