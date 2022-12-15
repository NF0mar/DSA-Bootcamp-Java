package Assignments;

import java.util.Scanner;

public class Oddandeven {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1= input.nextInt();
        if(num1 % 2==0 ){
            System.out.println("Your number is Even");
        }
        else{
            System.out.println("Your number is Odd");
        }
    }
}
