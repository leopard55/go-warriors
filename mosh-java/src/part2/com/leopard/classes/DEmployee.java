package com.leopard.classes;

/**
 * @Title: Abstraction 抽象，隐藏实现细节
 * @Description: Encapsulation封装，将数据和方法捆绑在一起
 * @Author: lz
 * @CreateDate: 2022/4/16 14:36
 * @Version: 1.0
 */
public class DEmployee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int hourlyRate) {
        return baseSalary + (hourlyRate * hourlyRate);
    }

    public void setBaseSalary(int baseSalary) {
        if(baseSalary <= 0) {
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        }
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly rate connot be 0 or negative.");
        }
        this.hourlyRate = hourlyRate;
    }

    // 隐藏不必要的细节
    private int getHourlyRate() {
        return hourlyRate;
    }

}

class Main3 {
    public static void main(String[] args) {
        //下面4句为4个耦合点
        DEmployee employee = new DEmployee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
