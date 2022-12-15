package Tests;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
//        String myfriends[] = {"Ahmed","Jamac","geedi","osman"};
//        String bestfriends[]={"hassan","hussein","ayuub","zaki"};
//        System.out.println("ani waxaan jeclahay "+ bestfriends[2]);

        String[] myfriendz={"Ahmed","Jamac","geedi","osman"};
//        System.out.println("en sevdigim arkadas " +myfriendz[3]+"dir");
//        System.out.println(Arrays.toString(myfriendz));
//        myfriendz[1] ="zakaria";
//        System.out.println(Arrays.toString(myfriendz));
//        for (String i : myfriendz){
//            System.out.println(i);
//        }
//        for(int i=0; i < myfriendz.length; i++) {
//            System.out.println(myfriendz[i]);
//        }
//        int [][] numbers={{1,2,3,4,5},{6,7,8,9}};
////        System.out.println(numbers[1][3]);
////        numbers[1][3]= 11;
////        System.out.println(numbers[1][3]);
//        for (int i = 0; i < numbers.length; i++) {
////            System.out.println(Arrays.toString(numbers[i]));
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.println(numbers[i][j]);
//            }
//        }
        ArrayList<String> names= new ArrayList<String>();
        names.add("Farah");
        names.add("Nuur");
        names.add("Ahmed");
        names.add("Reyaan");
        names.add("jamac");
//        System.out.println(names);
//        System.out.println(names.get(2));

//        names.set(2,"Farhan");
//        System.out.println(names);

//        names.remove(4);
//        System.out.println(names);

//        names.clear();

//        System.out.println(names.size());

//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
//        for (String i:names) {
//            System.out.println(i);
//        }

//        Collections.sort(names);
//        System.out.println(names);
//
//        for (String i:names) {
//            System.out.println(i);
//        }

        ArrayList <Integer> numbers= new ArrayList<Integer>();
        numbers.add(9);
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);
        numbers.add(3);
//        for (int i: numbers) {
//            System.out.println(i);
//        }
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(i);
//        }

        Collections.sort(numbers);
        System.out.println(numbers);
        for (int i:numbers) {
            System.out.println(i);
        }
    }

}
