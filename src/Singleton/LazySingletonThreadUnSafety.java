package Singleton;

/**
 * 懒汉式(线程安全)
 * 双重检验加锁
 */
public class LazySingletonThreadUnSafety {

    private LazySingletonThreadUnSafety() { }

    /**
     * @volatile 解决共享变量可见性问题，需要用volatile修饰(防止多线程下共享变量赋值冲突)
     * @可见性 线程访问对象是否是最新值
     */
    private volatile static LazySingletonThreadUnSafety lazySingletonThreadUnSafety = null;

    public static LazySingletonThreadUnSafety getLazySingletonThreadUnSafety() {
        if(lazySingletonThreadUnSafety == null) {
            /**
             * @synchronized 保证在同一时刻，只有一个线程执行某个方法或方法块
             * @synchronized 同时可以保证一个线程的变化可见(可见性)，可以代替volatile
             */
            synchronized (LazySingletonThreadUnSafety.class) {
                /**
                 * 为什么进入synchronized代码块后，还需要判断一次是否为null？
                 * 如果两个线程同时到达synchronized代码块，只放行一个线程进入，执行完成后
                 * 第二个线程进入代码块不进行判断直接new，会导致结果不是单例
                 */
                if(lazySingletonThreadUnSafety == null) {
                    lazySingletonThreadUnSafety = new LazySingletonThreadUnSafety();
                }
            }
        }
        return lazySingletonThreadUnSafety;
    }
}
