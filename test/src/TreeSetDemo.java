import java.util.Set;
import java.util.TreeSet;

/**
 * @program: stuJava
 * @description: TreeSet要求存放的对象所属的类必须实现Comparable接口
 * @author: zwy
 * @create: 2019-08-05 15:44
 **/
public class TreeSetDemo {
    public static void main(String [] args) {
        Set<Student> set = new TreeSet<>(); // Java 7 的砖石语法（构造函数后面的尖括号不需要写类型）
        set.add(new Student("Hao LUO", 33));
        set.add(new Student("XJ Wang", 32));
        set.add(new Student("ZENG a", 23));
        set.add(new Student("Bob YANG", 60));
        set.add(new Student("Bruce LEE", 22));

        for (Student i: set) {
            System.out.println(i);
        }
        System.out.println("Hello world!");
    }

}

class Student implements Comparable<Student> {
    private String name; // 姓名
    private int age;    //年龄

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name = " + name + ", age = " + age + "]";
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}

