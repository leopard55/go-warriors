package javabase.yang.seven;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 题目：一个初始值为零的变量，两个线程对其交替操作，一个加1，一个减1，
 * 来5轮
 * 1    线程  操作  资源类
 * 2    判断  干活  通知
 * 3    防止虚假唤醒机制
 */
class ShareData{ //资源类
    public Boolean flag = false;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void increment()throws Exception{
        lock.lock();
        try{
            //1判断
            while (flag != false){
                condition.await(); //等待，不能生产
            }
            //2干活
            System.out.println(Thread.currentThread().getName()
                    +"\t"+"produce");
            //3通知唤醒
            flag = true;
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void decrement()throws Exception{
        lock.lock();
        try{
            //if (number == 0){
//在两个线程中正确，在多个线程中就有可能不正确，防止虚假唤醒机制
            //1判断
            while (flag != true){
                condition.await();//等待，不能生产
            }
            //2干活
            System.out.println(Thread.currentThread().getName()
                    +"\t"+"consumer");
            //3通知唤醒
            flag = false;
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public synchronized void decrement2()throws Exception{
        //1判断
        while (flag != true){
            //等待，不能消费
            this.wait();
        }
        //2干活
        System.out.println(Thread.currentThread().getName()+
                "\t"+"consumer");
        //3通知唤醒
        this.notify();
    }

    public synchronized void increment2()throws Exception{
        //1判断
        while (flag != false){
            //等待，不能生产
            this.wait();
        }
        //2干活
        System.out.println(Thread.currentThread().getName()+
                "\t"+"produce");
        //3通知唤醒
        this.notify();
    }

}

public class ProdConsumer_TraditionDemo {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();
        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    shareData.increment();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        },"AAA").start();

        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    shareData.decrement();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        },"BBB").start();

        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    shareData.increment();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        },"CCC").start();

        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    shareData.decrement();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        },"DDD").start();
    }
}
