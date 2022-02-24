package com.leopard.dpgof.c_interfaceisolation.negative;

/**
 * @Title: Bird
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2020/12/9 15:47
 * @Version: 1.0
 */
public class Bird implements Animal{
    @Override
    public void eat() {
        System.out.println("鸟 吃");
    }

    @Override
    public void swim() {
        throw new RuntimeException("不会");
    }

    @Override
    public void fly() {
        System.out.println("niao fei ");
    }
}
