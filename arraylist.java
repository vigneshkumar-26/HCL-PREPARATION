package com.vicky.kk_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        System.out.println("array list");
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int row = 0; row < 3; row++) {
            list.add(new ArrayList<>());

        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col <3; col++) {
                list.get(row).add(scan.nextInt());

            }

        }



        System.out.println(list);


//        list.add(3);
//        list.add(2);
//        list.add(2);
//        list.add(4);
//        list.add(6);
//        list.add(2);
//        list.add(4);
//        list.add(8);
//
//        System.out.println(list);
//
//        System.out.println(list.contains(8)); //if the list contains this number
//        list.set(2,5); //updating new list
//        list.remove(4); //revoming the list
//
//        System.out.println(list);
//
//        Scanner scan = new Scanner(System.in);
//
//        for (int i = 0;i<5;i++){
//            list.add(scan.nextInt());
//        }
//
//        for (int i = 0;i<5;i++){
//            System.out.print(list.get(i) +  " ");
//        }
//
//        System.out.println();
//
//        System.out.println(list);
//
//        list.set(2,5); //updating new list
//        list.remove(4); //revoming the list
//
//        System.out.println(list);





    }
}
