package AdapterMode.ObjectAdapterMode;

/**
 * 以对象属性的方式进行调用
 * 用来填补"现有的程序"和”所需的程序“之间差异的设计模式就是适配器模式 Adapter Mode
 *
 * @author asus
 */
public class Main {

    public static void main(String[] args) {
        Banner banner = new Banner("Hello");
        Print print = new PrintBanner(banner);
        print.printWeak();
        print.printStrong();
    }
}
