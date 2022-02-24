package com.leopard.dpgof.practice;

/**
 * @Title: AppTest1
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2020/12/11 16:07
 * @Version: 1.0
 */
public class AppTest2 {
    public static void main(String[] args) {
        f1();
        //AppTest1.f1(); //引起类的加载（静态块先执行），调用了静态方法
    }
    static AppTest2 t = new AppTest2();
    static {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    AppTest2() {
        System.out.println("3");
        System.out.println("a=" + a + ",b=" + b);
    }
    public static void f1() {
        System.out.println("4");
    }
    int a = 110;
    static int b = 112;
}
