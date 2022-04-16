package com.leopard;

import java.util.Scanner;

public class lLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        //while(!input.equals("quit")) {
        while(true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }
    }

    public static void forEachLoop() {
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
    
}
