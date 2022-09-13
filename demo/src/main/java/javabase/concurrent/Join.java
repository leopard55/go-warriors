package javabase.concurrent;

/**
 * @Title: Join
 * @Description: Join方法
 * @Author: lz
 * @CreateDate: 2020/10/12 15:52
 * @Version: 1.0
 */
public class Join {
    static class ThreadA implements Runnable{
        @Override
        public void run(){
            try{
                System.out.println("子线程开始");
                Thread.sleep(100);
                System.out.println("子线程结束");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ThreadA());
        thread.start();
        thread.join();
        System.out.println("子线程执行结束，主线程开始执行");
    }
}
