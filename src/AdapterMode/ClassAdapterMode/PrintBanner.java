package AdapterMode.ClassAdapterMode;

/**
 * 类适配器模式(使用继承的适配器模式)
 * 适配器模式
 * 打印横幅
 *
 * @author asus
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        this.showWithParen();
    }

    @Override
    public void printStrong() {
        this.showWithAster();
    }
}
