package SingletonMode;

/**
 * 单例模式：程序中只存在一个实例
 *
 * @author asus
 */
public class Singleton {

    /**
     * 单例类的构造器是private修饰
     * 防止外部调用构造函数new出实例
     */
    private Singleton() {
    }

    /**
     * 被static修饰，在加载类的时候就创建此对象
     */
    private static Singleton singleton = new Singleton();

    /**
     * 向外界暴露方法，获取单例的实例
     *
     * @return
     */
    public Singleton getSingleton() {
        return singleton;
    }
}
