package com.leopard.part1;

public class jSwitch { 
    public static void main(String[] args) {
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("Yor're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }
    }
}