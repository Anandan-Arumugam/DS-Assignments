package com.sorting.anandan;

public class Sort {
	private int[] numArray;
	
	public Sort(int [] array){
		setNumArray(array);
	}
	public void resetArray(int [] array) {
		setNumArray(array);
	}
	public void insertionSort(){
		for (int i=1;i<numArray.length;i++){
			int thisElement=numArray[i];
			int j=i;
			
			//creates space at j if the element in j is larger than thisElement
			
			while(j>0 && numArray[j-1]>thisElement){
				numArray[j]=numArray[j-1];
				j--;
			}
			numArray[j]=thisElement;
		}
	}
	public void printArray(){
		System.out.print("[");
		for(int i=0;i<numArray.length;i++){
			System.out.print(numArray[i]+" ");
		}
		System.out.println("]");
	}
	public int[] getNumArray() {
		return numArray;
	}
	public void setNumArray(int[] numArray) {
		this.numArray = numArray;
	}
}
