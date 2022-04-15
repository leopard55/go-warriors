package com.leopard;

import java.util.Scanner;

public class lWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.endsWith("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
    
}
