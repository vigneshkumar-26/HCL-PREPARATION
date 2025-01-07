package com.vicky.kk_algorithms;

import java.util.Arrays;

public class two_d_arrays_in__linearsearch {
    public static void main(String[]args){
        System.out.println("this is 2d array in linear search");
        int [][] arr = {
                        {1,2,3},
                        {4,5,6,44},
                        {7,8,9},
                        {10,11,12}
        };

        int target = 101;

        int [] ans = two_d_arry(arr,target);

        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    static int[] two_d_arry(int [][]arr,int target){
        if (arr.length == 0){
            return new int[]{0};
        }
        for(int row = 0;row<arr.length;row++){
            for(int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1};
    }

    //finding the maximum value

    static int max(int [][] arr){
        if(arr.length == 0){
            return 0;
        }
        int maxvalue = 0;
        for(int row = 0;row<arr.length;row++){
            for (int col =0;col<arr[row].length;col++){
                if(arr[row][col] > maxvalue){
                    maxvalue = arr[row][col];
                }
            }
        }
        return maxvalue;
    }

} // last bracket
