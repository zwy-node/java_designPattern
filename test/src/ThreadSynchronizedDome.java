/**
 * @program: stuJava
 * @description: 线程安全问题
 * @author: zwy
 * @create: 2019-08-02 15:20
 **/
public class ThreadSynchronizedDome {
    public static void main(String[] args) throws InterruptedException {
        //t1 t2同时共享同一变量trainCount
        ThreadTrainDome threadTrain = new ThreadTrainDome();
        Thread t1 = new Thread(threadTrain, "窗口1");
        Thread t2 = new Thread(threadTrain, "窗口2");
        t1.start();
        Thread.sleep(40);
        threadTrain.flg = false;
        t2.start();
        System.out.println("Hello World!");
    }
}

class ThreadTrainDome implements Runnable {
    // 初始化火车票为100
    private int trainCount = 100;
    public boolean flg = true;

//    @Override
    public void run() {
        if(flg) {
            while (trainCount > 0) {
                try {
                    //休眠50秒
                    Thread.sleep(50);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //执行同步代码this锁
                sale1();
            }
        } else {
            //执行同步函数
            while (trainCount > 0) {
                try {
                    //休眠50秒
                    Thread.sleep(50);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //执行同步函数
                sale();
            }

        }
    }

    //卖票方法 同步函数
    public synchronized void sale() {
        //同步代码块 synchronized 包裹需要要线程安全的问题
        if (trainCount > 0) {
            System.out.println(Thread.currentThread().getName() + ",出售第" + (100 - trainCount + 1) + "张票");
            trainCount--;
        }
    }

    //卖票方法
    public void sale1() {
        //同步代码块 synchronized 包裹需要要线程安全的问题。this锁
        synchronized (this) {
            if (trainCount > 0) {
                System.out.println(Thread.currentThread().getName() + ",出售第" + (100 - trainCount + 1) + "张票");
                trainCount--;
            }
        }
    }
}
