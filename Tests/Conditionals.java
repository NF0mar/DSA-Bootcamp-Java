package Tests;

public class Conditionals {
    public static void main(String[] args) {
        int n = 987;
//        if (n > 900){
//            n +=100;
//            System.out.println(n);
//        }
//        else{
//            n += 50;
//            System.out.println(n);
//        }
        //Multiple if-else
        if (n < 900){
            n +=100;
            System.out.println(n);
        }
        else if (n==987) {
            n -= 500;
            System.out.println(n);
        } else{
            n += 50;
            System.out.println(n);
        }
    }
}
