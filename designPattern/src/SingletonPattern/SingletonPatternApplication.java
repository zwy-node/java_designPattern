package SingletonPattern;

/**
 * @program: stuJava
 * @description: 单例模式
 * @author: zwy
 * @create: 2019-09-12 18:22
 **/
public class SingletonPatternApplication {
    public static void main(String args[]) {
        //静态内部类
        Singleton s1 = Singleton.getInstance3();
        Singleton s2 = Singleton.getInstance3();
        if(s1 == s2) {
            System.out.println("s1:" +s1+ " s2:" + s2);
            System.out.println("是单例模式");
        } else {
            System.out.println("不是是单例模式");
        }

        //双重校验，单例模式
        Singleton s4 = Singleton.getSingleton();
        Singleton s5 = Singleton.getSingleton();
        if(s4 == s5) {
            System.out.println("s4:" +s4+ " s5:" + s5);
            System.out.println("是单例模式");
        } else {
            System.out.println("不是是单例模式");
        }

        NoSingleton n1 = new NoSingleton().getInstance();
        NoSingleton n2 = new NoSingleton().getInstance();
        if(n1 == n2) {
            System.out.println("是单例模式");
        } else {
            System.out.println("n1:" +n1+ " n2:" + n2);
            System.out.println("不是是单例模式");
        }
    }
}
