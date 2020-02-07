package Singleton;

/**
 * 静态内部类实现的单例模式
 * 静态的属性JVM只会再类初始化的时候创建一次，并且仅创建一次，通过JVM此特性实现
 */
public class StaticInnerClassSingleton {

    /**
     * 初始化StaticInnerClassSingleton类时不会加载此内部类
     * 当调用getStaticInnerClassSingleton方法时才会初始化本内部类，且只初始化一次
     */
    private static class SingletonHolder {

        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() { }

    public static StaticInnerClassSingleton getStaticInnerClassSingleton() {
        return SingletonHolder.staticInnerClassSingleton;
    }
}
