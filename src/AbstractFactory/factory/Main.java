package AbstractFactory.factory;

/**
 * 抽象工厂模式：只关注接口，不关注零件的具体实现
 * <p>
 * 例子其实就是 一个Page页下有多个Tray，一个Tray下有多个Link，一个Link下有多Item
 * 使用这些抽象类组成一个页面，直接使用抽象类的方式组装实例，不去关心实例是如何实现的
 * <p>
 * 实现类是用继承的方式，实现父类的抽象方法，达到实现创建实例
 *
 * @author asus
 */
public class Main {

    public static void main(String[] args) {
        /*if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.listFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }*/
        Factory factory = Factory.getFactory("AbstractFactory.listfactory.LifeFactory");

        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.cn/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray tray_news = factory.createTray("日报");
        tray_news.add(people);
        tray_news.add(gmw);

        Tray tray_yahoo = factory.createTray("Yahoo!");
        tray_yahoo.add(us_yahoo);
        tray_yahoo.add(jp_yahoo);

        Tray tray_search = factory.createTray("检索引擎");
        tray_search.add(tray_yahoo);
        tray_search.add(excite);
        tray_search.add(google);

        Page page = factory.createPage("linkPage", "杨文轩");
        page.add(tray_news);
        page.add(tray_search);
        page.output();
    }
}