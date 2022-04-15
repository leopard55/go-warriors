package com.leopard;

import java.util.Scanner;

public class fReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);
    }

    public static void readString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.next();
        scanner.nextLine().trim();
        System.out.println("You are " + name);
    }
}