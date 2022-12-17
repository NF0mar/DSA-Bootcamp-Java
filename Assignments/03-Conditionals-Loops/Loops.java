package Assignments;

import java.util.Map;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner Area= new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int radius= Area.nextInt();
        double area =Math.PI*radius*radius;
        System.out.print("Area of circle is: ");
        System.out.println(area);

        Scanner factorial= new Scanner(System.in);
        System.out.print("enter a number: ");
        int num=factorial.nextInt();
        int i=1;
        int fact=1;
        for (i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+ num +" is= "+fact);
    }
}
