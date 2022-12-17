package Assignments;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner large=new Scanner(System.in);
        System.out.println("enter number1: ");
        int num1=large.nextInt();
        System.out.println("enter number2: ");
        int num2=large.nextInt();
        if(num1>num2){
            System.out.println(num1+ " Is greater than "+ num2);
        }
        else{
            System.out.println(num2+ " Is greater than "+ num1);
        }
    }
}
