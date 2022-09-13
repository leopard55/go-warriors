package javabase.concurrent;

/**
 * @Title: Signal
 * @Description: A,B线程交替打印1-100, volatile
 * @Author: lz
 * @CreateDate: 2020/10/12 15:39
 * @Version: 1.0
 */
public class Signal {
    private static volatile int signal = 1;
    private static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException{
        new Thread(() -> {
            while(signal <= 10){
                if(signal % 2 == 1){
                    System.out.println("Thread A " + signal);
                    synchronized(lock){
                        signal++;
                    }
                }
            }
        }).start();
        Thread.sleep(10);
        new Thread(() -> {
            while(signal <= 10){
                if(signal % 2 == 0){
                    System.out.println("Thread B " + signal);
                    synchronized(lock){
                        signal++;
                    }
                }
            }
        }).start();
    }
}
