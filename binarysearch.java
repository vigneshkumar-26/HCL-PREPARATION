package com.vicky.kk_algorithms;

public class binarysearch {
    public static void main(String[] args) {
        System.out.println("This is binary search");

        int[] arr = {-1,-2,0,1,2,3,4,5,6,7,8,9};
        int target = 6;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int []arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start +(end -start) /2 ;
            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
