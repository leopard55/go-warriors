package javabase.yang.demo;

/**
* @Author:         lz
* @CreateDate:     2019-06-17 20:33
 *
 * 1、子线程运行执行 10 次后，主线程再运行 5 次。这样交替执行三遍
*/

public class test {
    public static void main(String[] args) {

//        Executor;
//        Executors;
//        ExecutorService;

        final Bussiness bussiness = new Bussiness();
        //子线程
        new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    bussiness.subMethod();
                }
        }).start();
        //主线程
        for (int i = 0; i < 3; i++) {
            bussiness.mainMethod();
        }
    }
}

class Bussiness {
    private boolean subFlag = true;
    public synchronized void mainMethod() {
        while (subFlag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : main thread running loop count -- " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        subFlag = true;
        notify();
    }
    public synchronized void subMethod() {
        while (!subFlag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 10; i++) {
            System.err.println(Thread.currentThread().getName()
                    + " : sub thread running loop count -- " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        subFlag = false;
        notify();
    }

}

