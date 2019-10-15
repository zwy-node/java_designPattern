package AdapterPattern;

/**
 * @program: stuJava
 * @description: 手机类
 * @author: zwy
 * @create: 2019-09-20 15:40
 **/
public class Phone {
    //正常的电压是220v,是一个常量
    public static final int v = 220;

    private VoltageAdapter adapter;

    //充电
    public void charge() {
        adapter.changVoltage();
    }

    public void setAdapter(VoltageAdapter adapter) {
        this.adapter = adapter;
    }
}

//变压器
class VoltageAdapter {
    //改变电压的功能
    public void changVoltage() {
        System.out.println("正在充电...");
        System.out.println("原始电压：..." + Phone.v + "V");
        System.out.println("经过变压器转换之后的电压：..." + (Phone.v - 200) + "V");
    }
}
