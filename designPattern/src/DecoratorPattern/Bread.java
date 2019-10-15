package DecoratorPattern;

/**
 * @program: stuJava
 * @description: 面包类
 * @author: zwy
 * @create: 2019-09-20 10:58
 **/
public class Bread extends Food {
    private Food basicFood;
    public Bread(Food basicFood) {
        this.basicFood = basicFood;
    }

    public String make() {
        return basicFood.make() + "面包";
    }
}
