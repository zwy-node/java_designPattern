import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: stuJava
 * @description: Collections工具类
 *              Collections工具类的sort方法有两种重载的形式，
 *              第一种要求传入的待排序容器中存放的对象比较实现Comparable接口以实现元素的比较；
 *              第二种不强制性的要求容器中的元素必须可比较，但是要求传入第二个参数，
 *              参数是Comparator接口的子类型（需要重写compare方法实现元素的比较），
 *              相当于一个临时定义的排序规则，其实就是通过接口注入比较元素大小的算法，
 *              也是对回调模式的应用（Java中对函数式编程的支持）。
 * @author: zwy
 * @create: 2019-08-05 16:09
 **/
public class CollectionsDome {
    public static void main(String [] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1("HAO LUO", 33));
        list.add(new Student1("AJ SS", 32));
        list.add(new Student1("XIASO a", 50));
        list.add(new Student1("Bob asd", 33));
        list.add(new Student1("AJ", 22));

        // 通过sort方法的第二个参数传入一个Comparator接口对象
        // 相当于是传入一个比较对象大小的算法到sort方法中
        // 由于Java中没有函数指针、仿函数、委托这样的概念
        // 因此要将一个算法传入一个方法中唯一的选择就是通过接口回调
        Collections.sort(list, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                //比较学生名称
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Student1 i: list) {
            System.out.println(i);
        }

        System.out.println("Hello world!");
    }
}

class Student1 {
    private String name;    //姓名
    private int age;        //年龄

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student [name = " + name + ", age = " + age + "]";
    }
}
