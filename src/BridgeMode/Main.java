package BridgeMode;

/**
 * Bridge Mode 桥接模式：将类的功能层次结构与实现层次结构分离
 * 把实现层次结构的类注入到功能层次结构的类中，进行实现，这就是桥接模式
 * 一边是功能层次结构，一边是实现层次结构，搭建沟通的桥梁，使得功能和实现均实现
 * <p>
 * 什么是功能层次结构：当我们需要扩展A类的功能，那么我们会创建一个继承A类的子类B类，这就被称为新增了功能层次结构
 * 通常来说，类的功能层次机构不应当过深
 * <p>
 * 什么是实现层次结构：父类声明抽象方法来定义接口，子类继承父类实现抽象方法，这就被称为新增了实现层次结构
 *
 * @author asus
 */
public class Main {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe"));

        d1.display();
        d2.display();
        d3.display();
        d3.mutiDisplay(5);
    }
}
