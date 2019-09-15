package com.cot5405.searching;

public class BinarySearchRecursive {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] a = {5,7,8,12,15,19,22};
	int low = 0;
	int high = a.length;
	int key = 15;
	int pos = binarySearchRecursive(a,key,low,high);
	System.out.println("Found at pos"+pos);
    }
    
    static int binarySearchRecursive(int[] a,int key, int low, int high) {
	if(low<=high) {
	    int mid = (low+high)/2;
	    if(a[mid]==key)
		return mid;
	    else if(key<a[mid])
		return binarySearchRecursive(a, key, low, mid-1);
	    else
		return binarySearchRecursive(a, key, mid+1, high);
	}
	return -1;
    }

}
