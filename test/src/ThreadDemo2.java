import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: stuJava
 * @description: 测试线程中存在的问题
 *              子演示了100个线程同时向一个银行账户中存入1元钱
 *
 *              方法1，使用同步方法 synchronized， 在没有同步的情况下，执行结果通常是显示账户余额在10元以下，出现这种状况的原因是，
 *              当一个线程A试图存入1元的时候，另外一个线程B也能够进入存款的方法中，线程B读取到的
 *              账户余额仍然是线程A存入1元钱之前的账户余额，因此也是在原来的余额0上面做了加1元的操作，
 *              同理线程C也会做类似的事情，所以最后100个线程执行结束时，本来期望账户余额为100元，
 *              但实际得到的通常在10元以下（很可能是1元哦）。解决这个问题的办法就是同步，
 *              当一个线程对银行账户存钱时，需要将此账户锁定，待其操作完成后才允许其他的线程进行操作，
 *              方法2，通过Java 5显示的锁机制，为每个银行账户创建一个锁对象，在存款操作进行加锁和解锁的操作
 * @author: zwy
 * @create: 2019-08-05 17:33
 **/
public class ThreadDemo2 {
    public static void main(String [] args) {
        Account account = new Account();
        //定义一个线程池，newFixedThreadPool创建一个固定大小的线程池
        ExecutorService service = Executors.newFixedThreadPool(100);
        for (int i = 1; i <= 100; i++) {
            service.execute(new AddMoneyThread(account, 1));
        }

        service.shutdown();
        //isTerminated当调用shutdown()方法后，并且所有提交的任务完成后返回为true;
        while (!service.isTerminated()){}
        System.out.println("账号余额：" + account.getBalance());
    }
}

class Account {
    private Lock accountLock = new ReentrantLock();
    private double balance;         //账户余额

    /**
     * 存款
     */
    public void deposit(double money) {
        accountLock.lock();
        try {
            double newBalance = balance + money;
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
            balance = newBalance;
        } finally {
            accountLock.unlock();
        }
    }

    /**
     * 获取账户余额
     * @return
     */
    public double getBalance() {
        return  balance;
    }
}

class AddMoneyThread implements Runnable {
    private Account account; //存入账户
    private double money;   //存入金额

    public AddMoneyThread(Account account, double money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
//        synchronized (account) {
            account.deposit(money);
//        }
    }
}


