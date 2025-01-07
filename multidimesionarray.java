package com.vicky.kk_algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class multidimesionarray
{
    public static void main(String[] args)
    {
        System.out.println("the 2d arrays is");

        int[][] arr = new int[3][3];

        Scanner scan = new Scanner(System.in);

//the below is used for storing the arrays by the for loop
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {
                arr[row][col] = scan.nextInt();
            }
        }

//the below is used for printing the array in the for loop
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {
                System.out.print(arr[row][col]+" ");


            }
            System.out.println();
        }

// the below method is used for print the array by simple toString method
        for (int row = 0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

// the below method is used for print the array by the foreach loop or enhanced loop
        for(int[] array : arr){
            System.out.println(Arrays.toString(array));
        }



    }
}
