package javabase.yang.eight;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
* @Author:         lz
* @CreateDate:     2019-04-28 09:55
 *
 * java
 * 多线程中，第3中获得多线程得方式
*/

class MyThread2 implements Runnable{
    @Override
    public void run() {

    }
}

class MyThread implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        System.out.println("***come in Callable");
        return 1024;
    }
}

public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        //两个线程，一个main主线程，一个是AAfutureTask

        //FutureTask(Callable<V> callable)
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());

        Thread t1 = new Thread(futureTask,"AA");
        t1.start();

        new Thread(futureTask,"BB").start();//同样的只进去一次
//        new Thread(futureTask2,"BB").start();//算两次，共用一个futureTask，则只算一次

        int result01 = 100;

//        while (!futureTask.isDone()){
//
//        }

        int result02 = futureTask.get();//建议放在最后，要求获得Callable线程的计算结果，如果没有计算完成就要去强求，会导致阻塞，直到计算完成
        System.out.println("***result:"+futureTask.get());
        System.out.println("***result:"+(result02+result01));


    }
}
