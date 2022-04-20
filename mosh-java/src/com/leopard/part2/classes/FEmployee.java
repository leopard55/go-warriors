package com.leopard.part2.classes;

/**
 * @Title: Constructors, Method Overload, Static Members(fields, method)
 * @Description: 构造函数,初始化对象
 * @Author: lz
 * @CreateDate: 2022/4/16 14:36
 * @Version: 1.0
 */
public class FEmployee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public FEmployee(int baseSalary) {
        this(baseSalary, 0);

        //不用修改setHourlyRate方法了
//        setBaseSalary(baseSalary);
//        setHourlyRate(0);
    }

    public FEmployee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }

    public int calculateWage(int hourlyRate) {
        return baseSalary + (hourlyRate * hourlyRate);
    }

    public int calculateWage() {
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary) {
        if(baseSalary <= 0) {
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        }
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate connot be 0 or negative.");
        }
        this.hourlyRate = hourlyRate;
    }

    // 隐藏不必要的细节
    private int getHourlyRate() {
        return hourlyRate;
    }

}

// Classes、Encapsulation、Abstraction、Coupling
class Main5 {
    public static void main(String[] args) { // 为了Java运行时能够直接调用此方法，不用非创建一个新对象
        FEmployee employee = new FEmployee(50_000, 20);
        FEmployee.printNumberOfEmployees();
        int wage = employee.calculateWage(10);
        int wage1 = employee.calculateWage();
        System.out.println(wage);

        new FEmployee(10_000); // ctrl + p 查看方法参数
    }
}
