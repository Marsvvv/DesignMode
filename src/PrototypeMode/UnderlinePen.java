package PrototypeMode;

import java.nio.charset.StandardCharsets;

/**
 * ConcretePrototype具体的原型：负责实现Prototype原型定义的方法
 *
 * @author asus
 */
public class UnderlinePen implements Product {

    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes(StandardCharsets.UTF_8).length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");

        for (int i = 0; i < length; i++) {
            System.out.print(ulChar);
        }

        System.out.println("");
    }

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
