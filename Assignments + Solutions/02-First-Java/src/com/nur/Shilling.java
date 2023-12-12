package com.nur;

import java.util.Scanner;

public class Shilling {
    public static void main(String[] args) {
        Scanner Converter= new Scanner(System.in);
        System.out.print("Enter Somali shillings: ");
        float Shs= Converter.nextFloat();
        float USD= Shs/27000;
        System.out.println("$"+ USD);
    }
}
