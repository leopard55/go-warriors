package com.leopard.classes;

/**
 * @Title: Encapsulation
 * @Description: Encapsulation封装，将数据和方法捆绑在一起
 * @Author: lz
 * @CreateDate: 2022/4/16 14:36
 * @Version: 1.0
 */
public class CEmployee {
    public int baseSalary;
    public int hourlyRate;

    public int calculateWage(int hourlyRate) {
        return baseSalary + (hourlyRate * hourlyRate);
    }
}

class Main {
    public static void main(String[] args) {
        CEmployee employee = new CEmployee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
