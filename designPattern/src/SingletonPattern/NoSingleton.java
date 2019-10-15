package SingletonPattern;

/**
 * @program: stuJava
 * @description: 不是单例模式的类
 * @author: zwy
 * @create: 2019-09-12 18:36
 **/
public class NoSingleton {
    private NoSingleton noSingleton;
    public NoSingleton getInstance() {
        if(noSingleton == null) {
            noSingleton = new NoSingleton();
        }
        return noSingleton;
    }
}
