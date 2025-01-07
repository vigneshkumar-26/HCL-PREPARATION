package com.vicky.kk_algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class array
{
    public static void main(String[]args)
    {
        System.out.println("passing function in arrays");

        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0 ; i<5 ; i++)
        {
           arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for(int i = 0 ; i<5 ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;


        change(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void change (int[] number)
    {
        number[4] = 4;
    }

}
































































//public class array
//{
//    public static void main(String[] args)
//    {
////        //datatype[] variable_name = new datatype[5];
////        //or directly
////        //datatype[] variable_name = {data, data, data, data,data}
////
//        System.out.println("array storing programing");
//        System.out.println();
//
//
//        int[] arr = new int[5];
//
////        arr[0]=1;
////        arr[1]=2;
////        arr[2]=3;
////        arr[3]=4;
////        arr[4]=5;
//
//        System.out.println("enter 5 number to store in the array");
//
//        Scanner scan = new Scanner(System.in);
//
//        for (int i = 0;i<arr.length;i++)
//        {
//            arr[i] = scan.nextInt(); // just for storing the arrays
//
//
//        }
//
//        System.out.println();
//
//        System.out.println("the number you have entered are ");
//
//        for (int i = 0;i<arr.length;i++)
//        {
//
//            System.out.println(arr[i]);// just for printint the stored values
//
//        }
//
//        System.out.println();
//
//
//        int sum_of_array = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
//
//        System.out.println("the sum of the array is " + sum_of_array);
//        System.out.println();
//
////        for (int i = 0;i<4;i++)
////        {
////            arr[i] = scan.nextInt();
////            System.out.print(arr[i] +" ");
////        }
//
////  ENHANCED FOR LOOP IN ARRAY :
//
//        System.out.println("these numbers are come from the enhanced for loop or foreach loop");
//
//        for(int num : arr)
//        {
//            System.out.println(num);
//        }
//
//        System.out.println();
//
//// easy way to print array the numbers in the array is come from the easy array printing method
//        System.out.println("easy way to print array");
//        System.out.println(Arrays.toString(arr));
//
//
//
////
////        // ARRAY IN STRINGS:
////        String[] str = new String[5];
////
////        Scanner scan = new Scanner(System.in);
////
////        for( int i = 0;i< str.length;i++)
////        {
////            str[i]=scan.next();//storing the array values
////        }
////        for( int i = 0;i< str.length;i++)
////        {
////            System.out.println(str[i]);//printing the array values
////        }
////
////        System.out.println(Arrays.toString(str)); // easy way to print arrays
//
//    }
//}
