package Singleton;

/**
 * 枚举式
 * JVM实现线程安全和实例单一
 */
public enum EnumSingleton {

    uniqueInstance;

    public void doSomething() {
        System.out.println("doSomething");
    }
}
