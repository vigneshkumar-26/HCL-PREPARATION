package com.vicky.kk_algorithms;

public class minvalue_linearsearch {
    public static void main(String[] args) {
        System.out.println("this is minimum value in the linear search");
        int[] arr = {33,44,22,11,55,77,88};
        System.out.println(min_number_in_linearsearch(arr));

    }

    static int min_number_in_linearsearch(int[]arr){
        if(arr.length == 0){
            return 0;
        }
        int min = arr[0];
        for(int i = 1 ;i<arr.length;i++){
            if( arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }


}
