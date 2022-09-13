package javabase.yang.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(String[] args) {
        // 创建线程池

        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        int i = 0;
        while(i<100) {

            threadPool.execute(new Runnable() { // 提交多个线程任务，并执行

                @Override

                public void run() {

                    System.out.println(Thread.currentThread().getName() + " is running ..");

                    try {

                        Thread.sleep(3000);

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                }

            });
            i++;
            System.out.println("i: "+i);

        }



    }


}

