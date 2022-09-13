package javabase.concurrent;

/**
 * @Title: ObjectLock
 * @Description: A,B 两个线程交替打印1-100, 通知/机制
 * @Author: lz
 * @CreateDate: 2020/10/12 15:21
 * @Version: 1.0
 */
public class ObjectLock {

    private static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            synchronized(lock){
                for (int i = 0; i < 5; i++) {
                    try{
                        System.out.println("Thread A " + i);
                        lock.notify();
                        lock.wait(10);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        Thread.sleep(10);
        new Thread(() -> {
            synchronized(lock){
                for (int i = 0; i < 5; i++) {
                    try{
                        System.out.println("Thraed B " + i);
                        lock.notify();
                        lock.wait(10);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
