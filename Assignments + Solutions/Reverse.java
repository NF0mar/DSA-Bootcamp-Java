package Assignments;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter at-least 8 digits: ");
        int number= in.nextInt();
        int reverse=0;
        while(number!=0){
            int remainder=number%10;
            reverse=reverse*10+remainder;
            System.out.println(reverse);
        }
    }
}
