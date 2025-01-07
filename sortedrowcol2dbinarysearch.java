package com.vicky.kk_algorithms;

import java.util.Arrays;

public class sortedrowcol2dbinarysearch {
    public static void main (String[]args){
        System.out.println("this is sorted of row and col 2d binary search");
        int[][] arr = {
                {10,20,30,30},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println((Arrays.toString(sortedsearch(arr,37))));
    }
    static int[] sortedsearch(int[][] matrix,int target){
        int row = 0;
        int col = matrix.length-1;

        while (row< matrix.length && col >= 0)
        {
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }

            if (matrix[row][col] > target){
                col--;
            }

            else{ //(matrix[row][col]<target)
                row++;
            }

        }

        return new int[]{-1,-1};
    }
}
