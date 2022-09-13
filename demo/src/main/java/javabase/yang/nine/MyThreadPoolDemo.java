package javabase.yang.nine;

import java.util.concurrent.*;

/**
* @Author:         lz
* @CreateDate:     2019-04-29 20:28
 *
 *
 * *第4种获得/使用java多线程的方式，通过线程池
 * （其他三种是：继承Thread类；实现Runnable接口，但是Runnable没有返回值，不抛异常；
 * 实现Callable接口，有返回值，会跑出异常）
 *
*/

public class MyThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService threadPool = new ThreadPoolExecutor(2,
                5,
                1L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardPolicy());

        try{
            for(int i=1;i<=11;i++){
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"\t 办理业务");
                });
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            threadPool.shutdown();
        }
    }

    private static void threadPoolInit() {
        System.out.println(Runtime.getRuntime().availableProcessors());

        //Array  Arrays
        //Collection(接口) Collections
        //Executor Executor
        //List<String> list = Arrays.asList("a","b","c");

//        ExecutorService threadPool = Executors.newFixedThreadPool(5);//一池5个处理线程
//        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        ExecutorService threadPool = Executors.newCachedThreadPool();//一池n线程

        try{
            //模拟10个用户来办理业务，每个用户就是一个来自外部的请求线程
            for (int i = 0; i < 10; i++) {
                threadPool.execute(() ->{
                    System.out.println(Thread.currentThread().getName()+"\t办理业务");
                });
                // threadPool.submit(Runable task)
                // threadPool.submit(Callable<T> task)
                // threadPool.submit(Runable task, T result)
//                try { TimeUnit.MICROSECONDS.sleep( 200 ); } catch (InterruptedException e) { e.printStackTrace();}
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally{
            threadPool.shutdown();
        }
    }
}
