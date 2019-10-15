

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @program: stuJava
 * @description: Callable 类，实现线程同步
 * @author: zwy
 * @create: 2019-08-05 18:23
 **/
public class CallableDome {
    public static void main(String [] args) throws ExecutionException, InterruptedException {
        List<Future<Integer>> list = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(10);
        for(int i = 0; i < 10; i++) {
            list.add(service.submit(new MyTask(10)));
        }

        int sum = 0;
        for (Future<Integer> future: list) {
            sum += future.get();
        }
        System.out.println(sum);
        System.out.println("Hello world!");
    }
}

class MyTask implements Callable<Integer> {
    private int upperBounds;
    public MyTask(int upperBounds) {
        this.upperBounds = upperBounds;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
//        for (int i = 1; i <= upperBounds; i++) {
//            sum += i;
//        }
        return sum + upperBounds;
    }
}

