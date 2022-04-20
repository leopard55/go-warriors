package com.leopard.part1;

import java.text.NumberFormat;

public class eFormatNumbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result); // ￥1,234,567.89

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result1 = percent.format(0.1);
        System.out.println(result1); // %10

        String result2 = NumberFormat.getPercentInstance().format(0.1);

    }
}