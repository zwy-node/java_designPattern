package ObserverPatern;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: stuJava
 * @description: 被观察者，即为监听者
 * @author: zwy
 * @create: 2019-09-19 15:28
 **/
public class XiaoMei {
    List<Person> list = new ArrayList<>();
    public XiaoMei() {}

    public void addPerson(Person person) {
        list.add(person);
    }

    //遍历list，把自己的通知发送给所有暗恋自己的人
    public void notifyPerson() {
        for (Person person: list) {
            person.getMessage("你们过来吧，谁先过来就能陪我玩游戏！");
        }
    }
}
