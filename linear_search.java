package com.vicky.kk_algorithms;

public class linear_search {
    public static void main(String[] args) {
        System.out.println("this is linearsearch of numbers");
        int[] arr = {55, 2, 3, 4, 5, 6};
        int target = 6;
        int ans = linearsearch(arr, target);
        System.out.println(ans);
        System.out.println();

        System.out.println("this the linear search of strings");
        String name = "vicky";
        char targetletter = 'i';
        System.out.println(linearsearch(name,targetletter));
        System.out.println();

        System.out.println("this is linear search of char strings in foreach loop or enhanced loop ");
        String nameofchar = "vicky";
        char charactertargetletter = 'i';
        System.out.println(linearsearch1(nameofchar,charactertargetletter));
        System.out.println();

        System.out.println("search in range");
        int [] arr_range = {2,5,9,6,4,7};
        int target_in_range = 6;
        int start = 0;
        int end = arr_range.length-1;
        System.out.println(linearsearch(arr_range,target_in_range,start,end));
        System.out.println();




    }

    //

    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (target == arr[index]) {
                return index;
            }
        }
        return -1;

    }


    //
    static boolean linearsearch(String name, char targetletter) {

        if (name.length() == 0) {
            return false;

        }

        for ( int  i = 0; i< name.length();i++) {
            if(targetletter == name.charAt(i)) {
                return true;

            }

        }

        return false;
    }

    //

    static boolean linearsearch1(String nameofchar, char charactertargetletter){
        for(char character :nameofchar.toCharArray()){
            if(character == charactertargetletter){
                return true;
            }
        }
        return false;
    }

    //

    static int linearsearch(int []arr_range,int target_in_range,int start,int end){
        if(arr_range.length == 0){
            return 0;
        }
        for(int i = start;i<=end;i++){
            if(target_in_range==arr_range[i]){
                return i;
            }
        }
        return -1;
    }


} //main class close paraenthesis

