package javabase.yang.demo;

/**
* @Author:         lz
* @CreateDate:     2019-06-24 17:13
*/

class Counter{
    private volatile int count = 0;
     public synchronized  void inc(){
        try{
            Thread.sleep(3);
        }catch (Exception e){
            e.printStackTrace();
        }

        count++;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "count=" + count +
                '}';
    }
}

public class VolatileTest {

    public static void main(String[] args) {
        final Counter counter = new Counter();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                counter.inc();
            }).start();
        }
        //需要等待上面20个线程都全部计算完成后，再用main线程取得最终的结果值看是多少
        while (Thread.activeCount() > 2){
            Thread.yield();
        }
        System.out.println(counter);
    }
}
