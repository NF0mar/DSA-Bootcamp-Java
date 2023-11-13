package Assignments;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner operators= new Scanner(System.in);
        System.out.println("Enter number1: ");
        float num1=operators.nextFloat();
        System.out.println("Enter your operator: ");
        char op=operators.next().charAt(0);
        System.out.println("Enter number2: ");
        float num2=operators.nextFloat();
        if(op=='+'){
            //float sum= num1 + num2;
            System.out.println(num1 + num2);
        }
        else if(op=='-'){
            System.out.println(num1 - num2);
        }
        else if(op=='*'){
            System.out.println(num1 * num2);
        }
        else if(op=='/'){
            System.out.println(num1 / num2);
        }
        else if(op=='%'){
            System.out.println(num1 % num2);
        }
        else{
            System.out.println("Try Again");
        }
    }
}
