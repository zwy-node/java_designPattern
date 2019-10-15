import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @program: stuJava
 * @description: 对文件目录的操作，列出一个目录下所有的文件
 * @author: zwy
 * @create: 2019-07-26 17:11
 **/
public class FileTest {
    public static void main(String[] args) throws IOException {
        System.out.println("===================================");
        System.out.println("对文件目录的操作，列出一个目录下所有的文件");
        //1、new File(".")构建的是当前目录的路径
        File f = new File("/Users/mac/Desktop/stuJava/test");
        //f.list() 返回文件夹名和文件名字符串数组，
        System.out.println("-- 文件夹名和文件名");
        for (String str: f.list()) {
            System.out.println(str);
        }

        System.out.println("-- listFiles()方法返回的是一个File类的引用，它具有类的所有属性和方法");
        //listFiles()方法返回的是一个File类的引用，它具有类的所有属性和方法
        for (File temp : f.listFiles()) {
            if(temp.isFile()) {
                System.out.println(temp.getName());
            }
        }

        System.out.println("===================================");
        System.out.println("如果需要对文件夹继续展开");
        Test2.showDirectory(f);

        System.out.println("===================================");
        System.out.println("在Java 7中可以使用NIO.2的API来做同样的事情");
        Test3 test3 = new Test3();
        Path initParh = Paths.get("/Users/mac/Desktop/stuJava/test");
        Files.walkFileTree(initParh, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attr) throws IOException {
                System.out.println(file.getFileName().toString());
                return FileVisitResult.CONTINUE;
            }
        });

        System.out.println("Hello Word!");
    }

}
class Test2 {
    public static void showDirectory(File f) {
        walkDirectory(f, 0);
    }

    private static void walkDirectory(File f, int level) {
        if(f.isDirectory()) {
            for (File temp: f.listFiles()) {
                walkDirectory(temp, level + 1);
            }
        } else {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("\t");
            }
            System.out.println(f.getName());
        }
    }
}

class Test3 {
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) throws IOException {
        System.out.println(file.getFileName().toString());
        return FileVisitResult.CONTINUE;
    }
}


