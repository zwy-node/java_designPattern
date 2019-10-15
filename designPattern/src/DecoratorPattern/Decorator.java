package DecoratorPattern;

/**
 * @program: stuJava
 * @description: 装饰着模式
 * 解释： 对已有的业务逻辑进一步的封装，使其增加额外的功能。
 * @author: zwy
 * @create: 2019-09-20 10:08
 **/
public class Decorator {
    public static void main (String [] args) {
        Food food = new Bread(new Vegetable(new Cream(new Food("香肠"))));
        System.out.println(food.make());
    }
}
