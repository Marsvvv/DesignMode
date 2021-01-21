package PrototypeMode;

import java.nio.charset.StandardCharsets;

/**
 * ConcretePrototype具体的原型：负责实现Prototype原型定义的方法
 *
 * @author asus
 */
public class MessageBox implements Product {

    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes(StandardCharsets.UTF_8).length;

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }

        System.out.println("");
        System.out.println(decoChar + " " + s + " " + decoChar);

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }

        System.out.println("");
    }

    /**
     * 这里使用clone进行创建新的对象
     *
     * @return Product
     */
    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
