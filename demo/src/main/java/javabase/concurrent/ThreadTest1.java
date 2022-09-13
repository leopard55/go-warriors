package javabase.concurrent;

/**
 * @Title: ThreadTest1
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2020/10/12 15:58
 * @Version: 1.0
 */

public class ThreadTest1 implements Runnable {
    int i = 1;
    public static void main(String[] args) {
        ThreadTest1 t = new ThreadTest1();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                notify();
                System.out.println(Thread.currentThread().getName() + ":" + i);
                try {
                    wait(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}