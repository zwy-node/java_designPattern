/**
 * @program: stuJava
 * @description: 线程示例
 *              没有同步方法，会导致通用的变量数据错乱
 * @author: zwy
 * @create: 2019-08-02 14:52
 **/
public class ThreadDemo {
    public static void main(String [] args) {
        // t1 t2 同时共享同一变量 trainCount
        ThreadTrain threadTrain = new ThreadTrain();
        Thread t1 = new Thread(threadTrain, "窗口1");
        Thread t2 = new Thread(threadTrain, "窗口2");
        t1.start();
        t2.start();
        System.out.println("Hello world!");
    }
}

class ThreadTrain implements Runnable {

    // 初始化火车票为100张
    private int trainCount = 100;

    @Override
    public void run() {
        while (trainCount > 0) {
            try {
                //休眠50秒
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //出售火车票
            sale();
        }
    }


    //售卖车票
    public void sale() {
        System.out.println(Thread.currentThread().getName() + "，出售第" + (100 - trainCount + 1) + "张票");
        trainCount --;
    }

}
