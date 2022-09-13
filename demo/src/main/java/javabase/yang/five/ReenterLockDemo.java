package javabase.yang.five;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 可重入锁（也叫递归锁）
 *
 * 指的是同一线程外层函数获得锁之后，内层递归函数仍然能获取该锁的代码
 * 在同一个线程在外层方法获取锁的时候，在进入内层方法会自动获取锁
 *
 * 也就是说，线程可以进入任何一个他已经拥有的锁所同步着的代码块
 *
 *case one Synchronized就是一个典型的可重入锁
 * t1 10	 invoked sendSMS()    10线程在外层方法获取锁的时候
 * t1 10	 #### invoked sendEmail()   10线程进入内层方法会自动获取锁
 * t2 11	 invoked sendSMS()
 * t2 11	 #### invoked sendEmail()
 *
 *case one ReentrantLock就是一个典型的可重入锁
 *
 */

//class Phone{
//    public synchronized void sendSMS()throws Exception{
//        System.out.println(Thread.currentThread().getId()+"\t invoked sendSMS()");
//        sendEmail();
//
//    }
//
//    public synchronized void sendEmail()throws Exception{
//        System.out.println(Thread.currentThread().getId()+"\t #### invoked sendEmail()");
//
//    }
//}

class Phone implements Runnable{
    public synchronized void sendSMS()throws Exception{
        System.out.println(Thread.currentThread().getId()+"\t invoked sendSMS()");
        sendEmail();

    }

    public synchronized void sendEmail()throws Exception{
        System.out.println(Thread.currentThread().getId()+"\t #### invoked sendEmail()");

    }

    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        get();
    }
    public void get(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+"\t invoked get()");
            set();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void set(){
        lock.lock();
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+"\t ### invoked set()");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
            //如果去掉一个会卡死，最后一把锁不匹配，导致t4进不来，程序没有出错
            //加两个编译能通过，程序能运行，工作中只加一个
            lock.unlock();
        }
    }
}

public class ReenterLockDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        new Thread(() ->{
            try{
                phone.sendSMS();
            }catch (Exception e){
                e.printStackTrace();
            }
        },"t1").start();

        new Thread(() ->{
            try{
                phone.sendSMS();
            }catch (Exception e){
                e.printStackTrace();
            }
        },"t2").start();
        Thread t3 = new Thread(phone,"t3");
        Thread t4 = new Thread(phone,"t4");
        t3.start();
        t4.start();
    }

}
