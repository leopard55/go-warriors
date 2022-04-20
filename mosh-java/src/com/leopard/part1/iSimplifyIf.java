package com.leopard.part1;

public class iSimplifyIf {
    public static void main(String[] args) {
        int income = 120_000;
        boolean hasHighIncome;
        if(income > 100_000) {
            hasHighIncome = true;
        }else {
            hasHighIncome = false;
        }
        System.out.print(hasHighIncome);
    }

    public static void v1() {
        int income = 120_000;
        boolean hasHighIncome = false;
        if(income > 100_000) {
            hasHighIncome = true;
        }
        System.out.print(hasHighIncome);
    }

    public static void v2() {
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.print(hasHighIncome);
    }

    public static void ternaryOperator() {
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
    }
}