/**
 * @program: stuJava
 * @description: String、StringBuilder、StringBuffer区别
 * @author: zwy
 * @create: 2019-10-11 10:14
 **/
public class StringAndStringBuilderAndStringBuff {
    /**
     * String、StringBuilder、StringBuffer区别
     * 1.数据可变与不可变
     *      (1)String 底层是一个不可变的字符数组，private final char value[]; 所以内容不可变
     *      (2)StringBuilder 和StringBuffer 都是继承了 AbstractStringBuilder 底层使用的是可变字符数组： char[] value;
     * 2.线程安全
     *      (1) StringBuilder 是线程不安全的，效率较高
     *      (2) StringBuffer 是线程安全的，效率更低
     * 3.相同点
     *      StringBuilder 和StringBuffer 都是继承了 AbstractStringBuilder,
     *
     */

    public static void main(String args[]) {

        //验证数据可变与不可变
        String a = "A";
        System.out.println("第一个a：" + System.identityHashCode(a));
        a = a + "B";
        System.out.println("第二个a：" + System.identityHashCode(a));

        StringBuilder s = new StringBuilder("A");
        System.out.println("第一个s：" + System.identityHashCode(s));
        s.append("B");

        System.out.println("第一个s：" + System.identityHashCode(s));
    }

}
