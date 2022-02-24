package com.leopard.dpgof.practice;

/**
 * @Title: AppTest3
 * @Description: 交替打印12A34B56C...
 * @Author: lz
 * @CreateDate: 2020/12/21 15:15
 * @Version: 1.0
 */
class Fo {
    public int x = 1;
}

class T implements Runnable {
    private Fo fo;

    public T(Fo fo) {
        this.fo = fo;
    }

    @Override
    public void run() {
        synchronized (fo) {
            for (int i = 1; i <= 52; i++) {
                while(fo.x != 1) {
                    try {
                        fo.notify(); // 唤醒对方，自己睡
                        fo.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(i);
                if(i % 2 == 0) {
                    fo.x = 2;
                }
            }
        }
    }
}

class S implements Runnable {
    private Fo fo;

    public S(Fo fo) {
        this.fo = fo;
    }
    @Override
    public void run() {
        synchronized (fo) {
            for (int i = 'A'; i <= 'Z'; i++) {
                while(fo.x != 2) {
                    try {
                        fo.notify(); // 唤醒对方，自己睡
                        fo.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println((char)i);
                fo.x = 1;
            }
        }

    }
}

public class AppTest3 {
    public static void main(String[] args) {
        //如果只有一个Runnable，Runnable本身就作为共享对象。Runnable超过一个，就额外单独定义一个共享对象
        Fo fo = new Fo();

        T t = new T(fo);
        S s = new S(fo);

        Thread th = new Thread(t);
        Thread th2 = new Thread(s);

        th.start();
        th2.start();
    }
}
