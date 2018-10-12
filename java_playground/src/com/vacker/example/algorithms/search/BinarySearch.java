package com.vacker.example.algorithms.search;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    BINARY SEARCH

    Time Complexity
        Best Case   : O(1)
        Avg. Case   : O(log n)
        Worst Case  : O(log n)
*/
public class BinarySearch {


    public static int binarySearch(int[] numbers, int num,
            int low, int high) {

        while (low <= high) {
            int mid = (low + high) / 2;

            if (numbers[mid] < num) {
                low = mid + 1;
            }

            else if (numbers[mid] > num) {
                high = mid - 1;
            }

            else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Enter the number to be searched ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int searchElement = Integer.valueOf(br.readLine());

        int[] arr = {2, 4, 6, 8, 10};

        int index = binarySearch(arr, searchElement, 0, 5);
        System.out.println("Number found at index number :::: "+index);
    }
}
