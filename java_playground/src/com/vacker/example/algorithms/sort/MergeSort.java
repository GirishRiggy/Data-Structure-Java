package com.vacker.example.algorithms.sort;

public class MergeSort {

    static int totalLoopingCount =  0;

    public static void main(String[] args) {
        System.out.println("########################");
        System.out.println("#### MERGE SORT ####");
        System.out.println("########################");
        int [] arr = {7, 5, 4, 2};
        display(arr);
        display(mergeSort(arr, 0, arr.length-1));
        System.out.println("Total looping count ::: "+totalLoopingCount);
    }

    public static int[] mergeSort(int[] arr, int start, int end) {
        totalLoopingCount++;

        if(start < end) {
            int mid = (start + end) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            arr = merge(arr, start, mid, end);
        }
        return arr;
    }

    public static int[] merge(int[] arr, int start, int mid, int end){

        int p = start, q = mid + 1,k =0;
        int arrTemp[]= new int[end-start+1];

        for(int i = start ;i <= end ;i++) {
            totalLoopingCount++;
            //checks if first part comes to an end or not .
            if(p > mid)
                arrTemp[ k++ ] = arr[ q++] ;

            //checks if second part comes to an end or not
            else if ( q > end)
                arrTemp[ k++ ] = arr[ p++ ];

            //checks which part has smaller element.
            else if( arr[ p ] < arr[ q ])
                arrTemp[ k++ ] = arr[ p++ ];

            else
                arrTemp[ k++ ] = arr[ q++];
        }

        /*
            Now the real array has elements in
            sorted manner including both parts.
        */
        for (int j=0; j < k; j++) {
            totalLoopingCount++;
            arr[ start++ ] = arrTemp[j] ;
        }

        return arr;
    }

    public static void display(int [] arr) {
        for(int i = 0; i<= arr.length - 1; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
    }

}
