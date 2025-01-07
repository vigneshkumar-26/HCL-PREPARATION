package com.vicky.kk_algorithms;

import java.util.Arrays;

public class cyclesort {
    public static void main(String[]args){
        System.out.println("this is the algorithm of cycle sort");
        int [] arr = {3,1,2,0};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycle(int[]arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[]arr,int i,int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

}
