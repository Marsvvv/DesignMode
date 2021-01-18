package TemplateMethodMode;

/**
 * 模板模式：将具体实现交给子类
 * 在父类中定义处理流程的框架，在子类中实现具体处理的模式就称为模板模式
 * <p>
 * 特点：
 * 1.处理逻辑通用化：真正处理逻辑的是父类的代码，子类用于定义基本
 * 2.父类和子类协作性：父类和子类是共同工作的，子类实现父类中声明的抽象方法时，必须要理解这些抽象方法被调用的时机
 * <p>
 * 遵循了里氏替换原则（LSP）
 *
 * @author asus
 */
public class Main {

    public static void main(String[] args) {
        Display displayChar = new CharDisplay('H');

        Display displayString = new StringDisplay("Hello World");

        Display displayString2 = new StringDisplay("你好，世界。");

        displayChar.display();

        displayString.display();

        displayString2.display();
    }
}
