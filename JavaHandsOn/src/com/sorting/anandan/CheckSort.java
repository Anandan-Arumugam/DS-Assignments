package com.sorting.anandan;

public class CheckSort {

	public static void main(String[] args) {
		
		int []Array={3,2,1,6};
		Sort iSort = new Sort(Array);
		iSort.printArray();
		iSort.insertionSort();
		iSort.printArray();
	}

}
