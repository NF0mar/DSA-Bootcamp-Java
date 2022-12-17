package Assignments;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner Greetings= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= Greetings.next();
        System.out.println("Welcome Mr/Mrs "+name);
    }
}
