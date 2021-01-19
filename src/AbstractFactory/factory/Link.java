package AbstractFactory.factory;

/**
 * 超链接抽象类
 *
 * @author asus
 */
public abstract class Link extends Item {

    /**
     * url
     */
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
