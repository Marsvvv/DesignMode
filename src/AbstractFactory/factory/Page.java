package AbstractFactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * 抽象产品类
 *
 * @author asus
 */
public abstract class Page {

    /**
     * 标题
     */
    protected String title;

    /**
     * 作者
     */
    protected String author;

    /**
     * 内容
     */
    protected ArrayList<Object> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * 向页面种添加Item
     *
     * @param item item
     */
    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String fileName = title + ".html";

            Writer writer = new FileWriter(fileName);

            writer.write(this.makeHTML());

            writer.close();

            System.out.println(fileName + "编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
