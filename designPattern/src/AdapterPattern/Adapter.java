package AdapterPattern;

/**
 * @program: stuJava
 * @description: 适配器模式
 * @author: zwy
 * @create: 2019-09-20 15:36
 **/
public class Adapter {
    public static void main(String[] args) {
        Phone phone = new Phone();
        VoltageAdapter adapter = new VoltageAdapter();
        phone.setAdapter(adapter);
        phone.charge();
    }
}
