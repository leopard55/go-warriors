package com.leopard;

import java.awt.*;
import java.util.Date;

public class aMain {

    public static void main(String[] args) {
        System.out.println("hello world");
        byte age = 30;
        int viewCount = 123_456_789;
        long viewsCount = 3_123_456_789L;
        double price = 10.99;
        float price1 = 10.99F;
        char letter = 'A';
        boolean isEligible = false;//是否有资格获得贷款

        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        String message = new String("hello world");
        String message1 = "hello world" + "!!";
        message1.endsWith("!!");
        message1.length();
        message1.indexOf('h');
        message1.replace("!","*");//不会修改原来的字符串，返回一个新的String对象，因为Java中字符串是不可变的
        message1.toUpperCase();
        message1.trim();
        System.out.println(message1);

        String message2 = "hello \"world\"";
        System.out.println(message2);

        String message3 = "c:\\Windows\\...";
        String message4 = "c:\nWindows\\...";
        String message5 = "c:\tWindows\\...";
    }
}
