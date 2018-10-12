package com.vacker.example.algorithms.sort;
/*
    BUBBLE SORT (SINKING SORT)

    Time Complexity
        Best Case   : O(n), it is when list is already sorted
        Avg. Case   : O(n^2)
        Worst Case  : O(n^2)

    Space Complexity : O(1)

    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    KEY POINTS

    1. Even other О(n^2) sorting algorithms, such as insertion sort,
    generally run faster than bubble sort, and are no more complex.
       Therefore, bubble sort is not a practical sorting algorithm.

    2. The only significant advantage that bubble sort has over most other algorithms,
    even quick sort, but not insertion sort, is that the ability to detect that the list is
    sorted efficiently is built into the algorithm.
       When the list is already sorted (best-case), the complexity of bubble sort is only O(n).
       By contrast, most other algorithms, even those with better average-case complexity,
    perform their entire sorting process on the set and thus are more complex.
       However, not only does insertion sort share this advantage, but it also performs better
    on a list that is substantially sorted (having a small number of inversions).

    3. Bubble sort should be avoided in the case of large collections.
       It will not be efficient in the case of a reverse-ordered collection.

*/
public class BubbleSort {


    public static void main(String[] args) {
        System.out.println("########################");
        System.out.println("##### BUBBLE SORT ######");
        System.out.println("########################");
        int [] arr = {7, 4, 5, 2};
        display(arr);
        display(bubbleSort(arr));

    }

    public static int[] bubbleSort(final int[] arr) {
        int arrLength = arr.length;
        int i, j;

        for (i = 0; i< arrLength ; i++) {
            //optimize bubble sort - by introducing flag variable
            //flag is to monitor elements are getting swapped in inner loop
            boolean flag = false;

            for (j = 0; j < arrLength-i-1; j++) {

                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }

            }

            // if value of flag is false after all the iterations of inner loop
            // then break out
            if(!flag)
                break;
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
