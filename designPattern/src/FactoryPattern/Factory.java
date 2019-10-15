package FactoryPattern;

/**
 * @program: stuJava
 * @description: 工厂模式
 * 解释：
 * @author: zwy
 * @create: 2019-09-20 16:14
 **/
public class Factory {
    public Factory factory = null;
    private Integer a = 1;

    public Integer getA() {
        return a;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;

    }

    public Factory getFactory() {
        return factory;
    }
}

class Test {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.factory = factory;
        System.out.println(factory.factory.getA());

    }
}