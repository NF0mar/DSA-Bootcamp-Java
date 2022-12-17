package Tests;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nm = input.nextInt();
        int nm2 = input.nextInt();

        int sum = nm + nm2;
        System.out.println("your sum is: " + sum);
    }
}
