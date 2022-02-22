package com.leopard.dpgof.b_openclose.positive;

/**
 * @Title: AppTest
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2020/12/9 14:35
 * @Version: 1.0
 */
public class AppTest {
    public static void main(String[] args) {
        Car car = new DiscountCar();
        car.setBrand("奔驰");
        car.setColor("黑色");
        car.setLouyou(true);
        car.setPrice(666666);

        System.out.println(car);
        System.out.println(car.getPrice());
    }
    //变化来了，现在所有汽车，需要打8折
    //符合闭原则的做法就是，始终保证Car的源代码不会被修改，我们可以这样做，
    //创建一个Car的子类，重写Car的getPrice()方法
}
