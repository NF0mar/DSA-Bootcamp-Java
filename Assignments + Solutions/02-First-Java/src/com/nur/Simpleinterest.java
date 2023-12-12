package com.nur;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner Simple= new Scanner(System.in);
        System.out.print("Enter a principle: ");
        float principle= Simple.nextFloat();
        System.out.print("Enter a Rate: ");
        float Rate= Simple.nextFloat();
        System.out.print("Enter a Time: ");
        float Time= Simple.nextFloat();
        float Result= principle* Rate* Time /100;
        System.out.print(Result);
    }
}
