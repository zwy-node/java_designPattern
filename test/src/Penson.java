/**
 * @program: stuJava
 * @description: 自定义人类
 * @author: zwy
 * @create: 2019-07-18 11:59
 **/
public class Penson {
    private String name;
    private int age;

    @Override
    public int hashCode() { //重写hashCode()方法
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass()) //要获取类的信息 首先要获取类的类类型,传递的是哪个子类的对象
            return false;
        Penson other = (Penson) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int setAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Penson(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public Penson () {
        super();
    }

    @Override
    public String toString() {
        return "Penson" + name + "。。。。" + age;
    }
}
