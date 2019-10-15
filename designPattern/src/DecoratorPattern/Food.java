package DecoratorPattern;

/**
 * @program: stuJava
 * @description: 实物
 * @author: zwy
 * @create: 2019-09-20 10:11
 **/
public class Food {
    private String foodName;
    public Food() {}
    public Food(String foodName) {
        this.foodName = foodName;
    }

    public String make() {
        return foodName;
    }
}
