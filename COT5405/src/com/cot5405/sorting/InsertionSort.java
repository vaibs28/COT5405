package com.cot5405.sorting;

public class InsertionSort {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int[] arr = { 5, 2, 4, 7, 9, 10 };
	insertionSort(arr, 0);

	System.out.println("Sorting in Ascending order");
	for (int i = 0; i < arr.length; i++)
	    System.out.println(arr[i]);

	insertionSort(arr, 1);

	System.out.println("Sorting in descending order");
	for (int i = 0; i < arr.length; i++) {
	    System.out.println(arr[i]);

	}
    }

    private static void insertionSort(int[] arr, int flag) {
	int n = arr.length;
	// keeping the first element in sorted half
	for (int i = 1; i < n; i++) {
	    // key to be exhanged
	    int key = arr[i];
	    int j = i - 1;

	    if (flag == 0) {
		while (j >= 0 && arr[j] > key) {
		    // shift the existing elements in sorted half
		    arr[j + 1] = arr[j];
		    j = j - 1;
		}
	    }
	    else {
		while (j >= 0 && arr[j] < key) {
		    // shift the existing elements in sorted half
		    arr[j + 1] = arr[j];
		    j = j - 1;
		}
	    }
	    // put the key at the sorted place
	    arr[j + 1] = key;
	}
    }

}
