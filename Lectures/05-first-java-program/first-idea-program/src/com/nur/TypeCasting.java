package com.nur;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number");
//        float num = sc.nextFloat();
//        System.out.println(num);
//        int numb = (int) num;
//        System.out.println(numb);

//        // automatic type promotion in expressions
//
//        // when TypeCasting a byte the largest is 256
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);
//
//        byte k = 40;
//        byte z = 50;
//        byte c = 100;
//        int d = k * z / c;
//
//        System.out.println(d);

//        byte j = 30;
//        j = j*2;

        System.out.println("你在干什么");

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
