package com.vicky.kk_algorithms;

public class soredmatrixof2dbinarysearch {
    public static void main(String[]args){
        System.out.println("this is the sorted matrix of 2d binary search");
    }

    static int [] binary2d(int[][] matrix,int row,int startcol,int endcol,int target){
        while(startcol<=endcol){
            int mid = startcol+(endcol-startcol)/2;
            if (matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(target<matrix[row][mid]){
                endcol = mid-1;
            }
            else {
                startcol = mid+1;

            }
        }

        return new int[]{-1,-1};

    }

    static int[] binary2dsearch(int[][] matrix,int target){
        int row = matrix.length;
        int col = matrix[0].length;

        return new int[0];
    }
}
