package BridgeMode;

import java.nio.charset.StandardCharsets;

/**
 * 实现层次结构，实现父类的抽象方法
 *
 * @author asus
 */
public class StringDisplayImpl extends DisplayImpl {

    private String string;

    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes(StandardCharsets.UTF_8).length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    public void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
