package AbstractFactory.factory;

import java.util.ArrayList;

/**
 * 抽象托盘类，用于保存多个link
 *
 * @author asus
 */
public abstract class Tray extends Item {

    protected ArrayList<Object> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
