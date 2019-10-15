import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: stuJava
 * @description: 测试启动文件
 * @author: zwy
 * @create: 2019-07-18 11:57
 **/
public class Appliction {

    public static void main(String [] args) throws UnsupportedEncodingException {
        Integer a = new Integer(3);
        Integer b = 3;
        System.out.println(a == b); // "==" 表示比较引用，equals 比较的是值
        int c = 3; // a自动拆箱成int类型再和c比较
        System.out.println(a == c);
        System.out.println("===============================");

        Integer f1 = 100, f2 = 100, f3 = 128, f4 = 128;
        System.out.println(f1 == f2); //如果整型字面量的值在-128到127之间，那么不会new新的Integer对象,所有未true
        System.out.println(f3 == f4); //f3==f4的结果是false。
        System.out.println("===============================");

        A ab = new B();
        ab = new B();

        System.out.println("\n===============================");
        String str = "ABCDE";
        String newStr = reverse(str);
        System.out.print(newStr);
        System.out.println("\n===============================");
        String s1 = "你好";
        //将GB2312编码换位ISO-8859-1编码的字符串
        String s2 = new String(s1.getBytes("GB2312"), StandardCharsets.ISO_8859_1);
        System.out.println(s2);
        System.out.println("\n===============================");
        //获取年月日，小时分钟秒
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

        //Java 8 时间方法
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("---Java 8 时间方法");
        System.out.println(dt.getYear());
        System.out.println(dt.getMonthValue());
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());
        System.out.println(dt.getSecond());

        System.out.println("---Java 获取毫秒数");
        System.out.println(Calendar.getInstance().getTimeInMillis());
        System.out.println(System.currentTimeMillis());
        //java 8
        System.out.println(Clock.systemDefaultZone().millis());
        System.out.println("---Java 获取一个月的最后一天");
        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("---Java 时间格式化");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = new Date();
        System.out.println(df.format(date1));
        System.out.println("---Java 8时间格式化");
        DateTimeFormatter nf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date2 = LocalDate.now();
        System.out.println(date2.format(nf));
        System.out.println("---Java 获取昨天当前时刻");
        cal.add(Calendar.DATE, -1);
        System.out.println(cal.getTime());
        System.out.println("---Java 8获取昨天当前时刻");
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime yesterday = today.minusDays(1);
        System.out.println(yesterday);
        System.out.println("\n===============================");
        function();
    }

    //字符串反转
    public static String reverse(String str) {
        if(str == null || str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }


    public static void function() {
        HashMap<Penson, String> map = new HashMap<> ();
        map.put(new Penson("a", 20), "里约5热内陆");
        map.put(new Penson("b", 18), "索马里");
        map.put(new Penson("b", 18), "索马里");
        for (Penson key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key + "..." + value);
        }

        ConcurrentHashMap<Penson, String> cMap = new ConcurrentHashMap<> ();
        cMap.put(new Penson("a", 21), "哈哈");
        for (Penson key: cMap.keySet()) {
            String value = map.get(key);
            System.out.println(key + "..." + value);
        }
    }
}
class A {
    static{
        System.out.print("1");
    }

    public A() {
        System.out.print("2");
    }
}

class B extends A{
    public static void st() {
        System.out.print("a");
    }

    public B() {
        System.out.print("b");
    }
}

