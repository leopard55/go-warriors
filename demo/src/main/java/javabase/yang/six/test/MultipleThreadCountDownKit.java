package javabase.yang.six.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class MultipleThreadCountDownKit {
    /**
     * 计数器
     */
    private AtomicInteger counter;

    /**
     * 通知对象
     */
    private Object notify ;

    private Notify notifyListen ;

    public MultipleThreadCountDownKit(int number){
        if (number < 0) {
            throw new IllegalArgumentException("counter < 0");
        }
        counter = new AtomicInteger(number) ;
        notify = new Object() ;
    }

    /**
     * 设置回调接口
     * @param notify
     */
    public void setNotify(Notify notify){
        notifyListen = notify ;
    }


    /**
     * 线程完成后计数 -1
     */
    public void countDown(){

        if (counter.get() <= 0){
            return;
        }
        int count = this.counter.decrementAndGet();
        if (count < 0){
            throw new RuntimeException("concurrent error") ;
        }
        if (count == 0){
            synchronized (notify){
                notify.notify();
            }
        }
    }

    /**
     * 等待所有的线程完成
     * @throws InterruptedException
     */
    public void await() throws InterruptedException {
        synchronized (notify){
            while (counter.get() > 0){
                notify.wait();
            }

            if (notifyListen != null){
                notifyListen.notifyListen();
            }

        }
    }

    public static void main(String[] args) throws InterruptedException{
        MultipleThreadCountDownKit multipleThreadCountDownKit = new MultipleThreadCountDownKit(3);

        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                try {
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println(Thread.currentThread().getName()+"\t 线程");
                    multipleThreadCountDownKit.countDown();
                }catch (Exception e){

                }

            },String.valueOf(i)).start();
        }

        multipleThreadCountDownKit.await();
        System.out.println("+++++");
    }
}
