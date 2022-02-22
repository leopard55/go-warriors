package com.leopard.dpgof.b_openclose.neagtive;

/**
 * @Title: AppTest
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2020/12/9 14:35
 * @Version: 1.0
 */
public class AppTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("奔驰");
        car.setColor("黑色");
        car.setLouyou(true);
        car.setPrice(666666);

        System.out.println(car);
        System.out.println(car.getPrice());
    }
    //变化来了，现在所有汽车，需要打8折
    //违反开闭原则的做法就是，直接打开Car的源代码，在getPrice上修改。
}
