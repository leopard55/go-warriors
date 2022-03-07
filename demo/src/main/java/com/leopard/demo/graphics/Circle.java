package com.leopard.demo.graphics;

import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Descriptoin: TODO
 * @Author: leopard
 * @CreateDate: 2022-03-04 10:33
 */
public class Circle extends Shape {
    //中心点
    private Point center;
    //半径
    private double r;

    public Circle(Point center,double r) {
        this.center = center;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("draw circle at " +center.toString()+" with r "+r
                +", using color : "+getColor());
    }

    public double area() {
        return Math.PI*r*r;
    }

    public static void main(String[] args) {
        Point center = new Point(2, 3);
        Circle circle = new Circle(center, 2);
        circle.draw();
        System.out.println(circle.area());
    }
}
