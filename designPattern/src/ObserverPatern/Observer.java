package ObserverPatern;

/**
 * @program: stuJava
 * @description: 观察者模式
 * 解释： 对象间一对多的依赖关系，当一个对象的状态发送改变时，所有的依赖于它的对象都得到通知并被自动更新
 *
 * @author: zwy
 * @create: 2019-09-19 15:10
 **/
public class Observer {
    public static void main(String args[]) {
        XiaoMei xiaoMei = new XiaoMei();
        LaoWang laoWang = new LaoWang();
        LaoLi laoList = new LaoLi();

        //小王和小李在小美那里都注册一下
        xiaoMei.addPerson(laoWang);
        xiaoMei.addPerson(laoList);

        //小美向小王和小李发送通知
        xiaoMei.notifyPerson();
    }
}

