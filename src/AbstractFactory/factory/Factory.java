package AbstractFactory.factory;

/**
 * 抽象工厂类
 *
 * @author asus
 */
public abstract class Factory {

    /**
     * 创建工厂
     *
     * @param className className
     * @return Factory
     */
    public static Factory getFactory(String className) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    /**
     * 创建Link
     *
     * @param caption caption
     * @param url     url
     * @return Link
     */
    public abstract Link createLink(String caption, String url);

    /**
     * 创建Tray
     *
     * @param caption caption
     * @return Tray
     */
    public abstract Tray createTray(String caption);

    /**
     * 创建page
     *
     * @param title  title
     * @param author author
     * @return Page
     */
    public abstract Page createPage(String title, String author);

}
