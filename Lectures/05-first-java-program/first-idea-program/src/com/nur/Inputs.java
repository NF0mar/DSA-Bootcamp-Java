package com.nur;

import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.next();
        System.out.println("Your name is " + name);

        System.out.print("How much many do u have: ");
        float money = sc.nextFloat();
        System.out.println("You have $" +money+ " in your bank" );

        System.out.println("How old are you? ");
        int age = sc.nextInt();
        System.out.println(name+" you are " +age+ " years old");



    }
}
