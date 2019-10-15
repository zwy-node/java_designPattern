package DecoratorPattern;

/**
 * @program: stuJava
 * @description: 奶油类
 * @author: zwy
 * @create: 2019-09-20 11:23
 **/
public class Cream extends Food {
    private Food basicFood;

    public Cream(Food basicFood) {
        this.basicFood = basicFood;
    }

    public String make() {
        return basicFood.make() + "奶油";
    }
}
