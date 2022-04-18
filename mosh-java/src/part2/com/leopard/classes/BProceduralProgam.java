package com.leopard.classes;

/**
 * @Title: com.leopard.base.BProceduralProgam
 * @Description: procedural program 过程编程，没有类和对象，有一堆变量和函数（过程）.面向对象可以减少参数传递
 * @Author: lz
 * @CreateDate: 2022/4/16 14:26
 * @Version: 1.0
 */
public class BProceduralProgam {
    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;
        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);
    }

    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {  // 应该封装这些值，而不是传递这些值
        return baseSalary + (extraHours * hourlyRate);
    }
}
