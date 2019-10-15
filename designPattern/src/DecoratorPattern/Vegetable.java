package DecoratorPattern;

/**
 * @program: stuJava
 * @description: 蔬菜类
 * @author: zwy
 * @create: 2019-09-20 11:26
 **/
public class Vegetable extends Food {
    private Food basicFood;

    public Vegetable(Food basicFood) {
        this.basicFood = basicFood;
    }

    public String make() {
        return basicFood.make() + "蔬菜";
    }
}
