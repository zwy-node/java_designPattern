package SingletonPattern;

/**
 * @program: stuJava
 * @description: 单例模式类，写法与实现
 * @author: zwy
 * @create: 2019-09-12 18:23
 **/
public class Singleton {
    // 懒汉式写法，线程安全的
    private static Singleton singleton;
    private Singleton() {}
    static synchronized Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    //饿汉式写法
    private static Singleton singleton1 = new Singleton();
    //private Singleton() {}
    public static Singleton getInstance2() {
        return  singleton1;
    }

    //静态内部类
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    //private Singleton() {}
    public static Singleton getInstance3() {
        return SingletonHolder.INSTANCE;
    }


    //双重校验
    private volatile static Singleton singleton4;
    //private Singleton () {}
    public static Singleton getSingleton(){
        if(singleton4 == null) {
            synchronized (Singleton.class) {
                if(singleton4 == null) {
                    singleton4 = new Singleton();
                }
            }
        }
        return singleton4;
    }
}
