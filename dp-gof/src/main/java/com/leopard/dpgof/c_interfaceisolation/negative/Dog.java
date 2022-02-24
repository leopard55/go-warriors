package com.leopard.dpgof.c_interfaceisolation.negative;

/**
 * @Title: Dog
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2020/12/9 15:45
 * @Version: 1.0
 */
public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("狗啃狗头");
    }

    @Override
    public void swim() {
        System.out.println("狗游泳");
    }

    @Override
    public void fly() {
        throw new RuntimeException("你行你来，你来飞");
    }
}
