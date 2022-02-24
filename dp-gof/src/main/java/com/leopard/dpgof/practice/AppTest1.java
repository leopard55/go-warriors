package com.leopard.dpgof.practice;

/**
 * @Title: AppTest
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2020/12/11 15:34
 * @Version: 1.0
 */

/*
    类的实例化顺序:
        1.执行静态块
        2.执行构造块
        3.执行构造器
    注意
        类中的实例成员，等价于构造代码块。也就是说，构造代码块该执行的时候，也就会执行实例成员的代码
        类中的静态成员，等价于静态块。也就是说，静态块该执行的时候，也就会执行静态成员的代码

*/
class Foo{

    //静态块在类被加载的时候就执行，在整个程序运行期间只执行一次
    static{
        System.out.println("1");
    }

    //构造代码块：总是随着构造器的执行而执行。
    {
        System.out.println("3");
    }

//    int a = 5;
//    static int b = 10;
    int a = f1();
    static int b = f2();

    public int f1(){
        System.out.println("4");
        return 5;
    }

    public static int f2(){
        System.out.println("2");
        return 10;
    }

    public Foo(){
        System.out.println("5");
    }
}

public class AppTest1 {

    public static void main(String[] args) {
        //Foo foo = null;  没有引起类的加载
        //引起类的加载：调用构造器，class.forName()，调静态字段（属性），调静态方法
        Foo foo = new Foo();
        new Foo();

        //静态本质：类的加载时才有空间（静态空间在方法去开辟的）
        //非静态本质：实例化时才有空间（实例化的时候引类的加载）
    }
}
