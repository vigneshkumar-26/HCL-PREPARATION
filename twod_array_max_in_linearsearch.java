package com.vicky.kk_algorithms;

import java.util.Arrays;

public class twod_array_max_in_linearsearch {
    public static void main(String[]args){
        System.out.println("this is find the maximum number of 2 d array in linear search");
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,1126}
        };

        int [] ans = max(arr);

        System.out.println(Arrays.toString(ans));
    }

    static int[] max(int [][] arr){
        if(arr.length == 0){
            return new int []{0};
        }
        int maxvalue = 0;
        for(int row = 0;row<arr.length;row++){
            for (int col =0;col<arr[row].length;col++){
                if(arr[row][col] > maxvalue){
                    maxvalue = arr[row][col];
                }
            }
        }
        return new int[]{maxvalue};
    }
}
