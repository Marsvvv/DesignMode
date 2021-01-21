package BridgeMode;

/**
 * 功能层次结构，拓展了Display的功能
 *
 * @author asus
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void mutiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
