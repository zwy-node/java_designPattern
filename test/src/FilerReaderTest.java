import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @program: stuJava
 * @description: 文件操作，输入一个文件名和一个字符串，统计这个字符串在这个文件中出现的次数。
 * @author: zwy
 * @create: 2019-07-26 16:26
 **/
public class FilerReaderTest {
    //工具类中的方法都是静态方式的因此将构造器私有不允许创建对象
    private FilerReaderTest() {
        throw new AssertionError();
    }

    public static void main(String [] args) {
        int count = countWordInFile("/Users/mac/Desktop/stuJava/test/src/Appliction.java", "public");
        System.out.println(count);
        System.out.println("Hello World!");
    }

    public static int countWordInFile(String fileName, String word) {
        int counter = 0;
        try(FileReader fr = new FileReader(fileName)) {
            try(BufferedReader br = new BufferedReader(fr)) {
                String line = null;
                while ((line = br.readLine()) != null) {
                    int index = -1;
                    while (line.length() >= word.length() && (index = line.indexOf(word)) >= 0) {
                        counter ++;
                        line = line.substring(index + word.length());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return counter;
    }

}
