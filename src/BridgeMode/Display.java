package BridgeMode;

/**
 * 本类为父类，作为功能层次结构的一部分
 *
 * @author asus
 */
public class Display {

    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    /**
     * 这里使用了模板模式，也使用了抽象工厂模式
     * 将具体的实现交给了子类，将实现的子类注入到类中编写实现
     */
    public final void display() {
        open();
        print();
        close();
    }
}
