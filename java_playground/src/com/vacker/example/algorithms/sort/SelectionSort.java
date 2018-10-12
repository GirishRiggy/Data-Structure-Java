package com.vacker.example.algorithms.sort;

public class SelectionSort {


	public static void main(String[] args) {
		System.out.println("########################");
		System.out.println("#### SELECTION SORT ####");
		System.out.println("########################");
		int [] arr = {7, 5, 4, 2};
		display(arr);
		display(selectionSort(arr, arr.length));

	}


	public static int[] selectionSort(int[] arr, int arrSize) {

		int totalLoopingCount =  0;
		// reduces the effective size of the array by one in  each iteration
		for(int i = 0; i < arrSize; i++) {

			// temporary variable to store the position of minimum element
			// assuming the first element to be the minimum of the unsorted array
			int minimum = i;


			// gives the effective size of the unsorted  array
			for(int j = i+1; j < arrSize; j++ ) {
				totalLoopingCount++;
				//finds the minimum element
				if(arr[j] < arr[minimum])
					minimum = j;
			}

			// putting minimum element on its proper position.value with current index value.
			// swaping the minimum
			if(i != minimum){
				int temp = arr[i];
				arr[i] = arr[minimum];
				arr[minimum] = temp;
			}

			totalLoopingCount++;
		}
		System.out.println("Total looping count ::: "+totalLoopingCount);
		return arr;
	}
	
	public static void display(int [] arr) {
		for(int i = 0; i<= arr.length - 1; i++) {
			System.out.print(arr[i]);
		}
		System.out.println("");
	}

}
