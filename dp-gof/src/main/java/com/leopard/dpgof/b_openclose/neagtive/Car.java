package com.leopard.dpgof.b_openclose.neagtive;

/**
 * @Title: Car
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2020/12/9 11:20
 * @Version: 1.0
 */
public class Car {
    private String brand;
    private String color;
    private double price;
    private boolean louyou;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        //这是反例，违反了开闭原则，因为这里修改了源代码
        return price * 0.8;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isLouyou() {
        return louyou;
    }

    public void setLouyou(boolean louyou) {
        this.louyou = louyou;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", louyou=" + louyou +
                '}';
    }
}
