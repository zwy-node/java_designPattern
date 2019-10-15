package ObserverPatern;

/**
 * @program: stuJava
 * @description: 人类
 * @author: zwy
 * @create: 2019-09-19 15:19
 **/
public interface Person {
    //小王和小李通过这个接口可以接收到小美发过来的消息
    void getMessage(String s);
}
