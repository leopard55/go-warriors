package com.leopard.part2.refacotr;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator calculator;  // 声明成属性可以避免在两个方法中都new对象

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance : calculator.getRemainingBalances()) {
            System.out.println(balance);
        }
    }
}

class MortgageReport1 {

    private static MortgageCalculator calculator;  // 声明成属性可以避免在两个方法中都new对象

    public static void printMortgage(int principal, float annualInterest, byte years) {
//        MortgageCalculator calculator = new MortgageCalculator(principal, annualInterest, years);
        calculator = new MortgageCalculator(principal, annualInterest, years);
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
//        for (short month = 1; month <= years * MortgageCalculator.MONTHS_IN_YEAR; month++) {
        //double balance = MortgageCalculator.calculateBalance(month);
        //System.out.println(NumberFormat.getCurrencyInstance().format(balance));
//        }
    }
}