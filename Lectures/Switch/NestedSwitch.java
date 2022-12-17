package Tests;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ID = input.nextInt();
        String animals = input.next();
        switch (ID) {
            case 1:
                System.out.println("Nur Farah");
                break;
            case 2:
                System.out.println("Zakaria Mohamed");
                break;
            case 3:
                System.out.println("What is your favourite animal");
                switch (animals) {
                    case "Goat":
                        System.out.println("You'll be a good farmer.");
                        break;
                    case "Sheep":
                        System.out.println("it's a good animal but it's so dirty.");
                        break;
                    case "Cow":
                        System.out.println("You'll own a farm in the future.");
                        break;
                    default:
                        System.out.println("enter only animal names.");
                        break;
                }
                break;
            default:
                System.out.println("enter a correct number.");
                break;
        }
    }
}
