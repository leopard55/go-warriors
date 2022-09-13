package javabase.yang.demo;

import java.util.concurrent.*;

class MyThread  extends Thread{
    @Override
    public void run() {
        System.out.println("111");
    }
}

class MyThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("aaa");
    }
}

public class Demo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        MyThread1 myThread1 = new MyThread1();
        Thread thread = new Thread(myThread1);
        thread.start();

        ExecutorService executorService = new ThreadPoolExecutor(2, 5, 0, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
//                thread.setDaemon(true);
                return thread;
            }
        });

        executorService.execute(() -> {
            System.out.println("任务1@" + Thread.currentThread().getName());
            try{ TimeUnit.SECONDS.sleep(1); }catch (Exception e){ e.printStackTrace(); }
            System.out.println(1);
        });

        executorService.execute(() -> {
            System.out.println("任务2@" + Thread.currentThread().getName());
            try{ TimeUnit.SECONDS.sleep(3); }catch (Exception e){ e.printStackTrace(); }
            System.out.println(2);
        });

        executorService.execute(() -> {
            System.out.println("任务3@" + Thread.currentThread().getName());
            try{ TimeUnit.SECONDS.sleep(3); }catch (Exception e){ e.printStackTrace(); }
            System.out.println(3);
        });

        executorService.execute(() -> {
            System.out.println("任务4@" + Thread.currentThread().getName());
            try{ TimeUnit.SECONDS.sleep(3); }catch (Exception e){ e.printStackTrace(); }
            System.out.println(4);
        });

        executorService.shutdown();
    }
}
