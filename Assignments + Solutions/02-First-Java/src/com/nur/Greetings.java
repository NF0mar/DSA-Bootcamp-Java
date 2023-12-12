package com.nur;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Mr " + name + ", welcome home");
    }
}
