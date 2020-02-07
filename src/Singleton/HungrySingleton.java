package Singleton;

/**
 * 饿汉式
 * 无论本单例是否使用，都提前创建，空间 < 时间 理论(减少运行时间牺牲内存空间)
 * 线程安全
 */
public class HungrySingleton {

    private HungrySingleton() { }

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }

}
