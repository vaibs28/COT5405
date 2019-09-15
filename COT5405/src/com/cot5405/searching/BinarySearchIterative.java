package com.cot5405.searching;

public class BinarySearchIterative {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int[] a = {1,3,5,7,9};
	int low = 0;
	int high = a.length;
	int key = 9;
	while(low<=high) {
	    int mid = (low+high)/2;
	    
	    if(key==a[mid]) {
		System.out.println("found at"+mid);
		System.exit(0);
	    }
	    else if(key<a[mid]) {
		high = mid-1;
	    }
	    else {
		low = mid+1;
	    }
	}
	System.out.println("Not found");
    }

}
