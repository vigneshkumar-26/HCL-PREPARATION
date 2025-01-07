package com.vicky.kk_algorithms;

import java.util.Arrays;

public class selectionsort {

    public static void main(String[]args){
        System.out.println("this is the algorithm of selection sort");
        int [] arr = {-78,7,0,-77,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxindex = getmaxindex(arr,0,last);
            swap(arr,maxindex,last);
        }
    }

    static int getmaxindex(int[] arr,int start,int last){
        int max = start;
        for (int i = start;i<=last;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int max,int last){
        int temp = arr[max];
        arr[max]= arr[last];
        arr[last] = temp;
    }
}

