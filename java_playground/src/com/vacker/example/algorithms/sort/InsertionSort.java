package com.vacker.example.algorithms.sort;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("########################");
		System.out.println("#### INSERTION SORT ####");
		System.out.println("########################");
		int [] arr = {7, 4, 5, 2};
		display(arr);
		display(insertionSort(arr, arr.length));

	}

	/*
	 Step 1 : 7 4 5 2
	 Step 2 : 7 4 5 2 ===> 4 7 5 2
	 Step 3 : 4 7 5 2 ===> 4 5 7 2
	 Step 4 : 4 5 7 2 ===> 4 5 2 7
	*/
	public static int[] insertionSort(int[] arr, int arrSize) {

		for(int i = 1; i < arrSize; i++) {

			int value = arr[i];
			int j = i;

			/* check whether the adjacent element in left side is greater or
            less than the current element.*/
			while(j > 0 && arr[j - 1] > value) {
				// moving the left side element to one position forward.
				arr[j] = arr[j - 1];
				j = j - 1;

			}

			// moving current element to its  correct position.
			arr[j] = value;
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
