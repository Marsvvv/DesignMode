package Singleton;

/**
 * 懒汉式(线程不安全)
 * 判断是否拥有实例，没有再创建实例，空间 > 时间 理论(减少占用内存空间牺牲运行时间)
 */
public class LazySingletonThreadSafety {

    /**
     * 将构造函数私有化，访问修饰符导致除本类外不能new
     */
    private LazySingletonThreadSafety() { }

    /**
     * 初始化单例
     * 私有属性保证外界不允许直接获取和修改
     * 静态保证所有实例都可以共享使用
     */
    private static LazySingletonThreadSafety lazySingletonThreadSafety = null;

    public static LazySingletonThreadSafety getLazySingleton() {
        if(lazySingletonThreadSafety == null) {
            lazySingletonThreadSafety = new LazySingletonThreadSafety();
        }
        return lazySingletonThreadSafety;
    }
}
