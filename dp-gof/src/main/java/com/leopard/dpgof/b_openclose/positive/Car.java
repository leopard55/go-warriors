package com.leopard.dpgof.b_openclose.positive;

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
        return price;
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
