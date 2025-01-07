package com.vicky.kk_algorithms;

public class orderagnosticBinarysearch {
    public static void main (String[]args){
        System.out.println("This is order agnostic binary search");
        int []arr ={1,2,3,4,5,6,7,8,9};
        int target = 22;
        int ans = orderagnosticbs(arr,target);
        System.out.println(ans);
    }
    static int orderagnosticbs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isascending;
        if(arr[start]<arr[end]){
            isascending =true;
        }
        else{
            isascending = false;
        }
        while(start <= end ) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isascending) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            else{
                if (target>arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
