package com.leopard.dpgof.b_openclose.positive;

/**
 * @Title: DiscountCar
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2020/12/9 15:08
 * @Version: 1.0
 */
public class DiscountCar extends Car {
    @Override
    public double getPrice() {
        return super.getPrice() *0.8;
    }
}
