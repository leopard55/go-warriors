package com.leopard.dpgof.c_interfaceisolation.positive;

/**
 * @Title: Dog
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2020/12/9 15:51
 * @Version: 1.0
 */
public class Dog implements Swimable, Eatable {
    @Override
    public void eat() {
        System.out.println("gou chi ");
    }

    @Override
    public void swim() {
        System.out.println("gou you yong");
    }
}
