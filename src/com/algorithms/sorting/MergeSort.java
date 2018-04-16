/**
 * 
 */
package com.algorithms.sorting;

/**
 * @author Kiran Kanaparthi
 * 
 *  This class sorts the input data using
 *  mergeSort of the Input Data
 *  Merge sort uses Divide and Conquer strategy to
 *  divide the Initial Array into one element of each, sorts them 
 *  before merging them back to the array
 * 
 */
public class MergeSort {

	/**
	 * This method performs the mergeSort
	 * of the input data recursively
	 * 
	 * @param input
	 * @return
	 */
	private int[] mergeSort(int[] input,int low,int high) {
		int middle = (low+high)/2;
		if(low<high) {
			mergeSort(input, low, middle);
			mergeSort(input, middle+1, high);
			merge(input, low,middle,high);
		}
		return input;
	}

	/**
	 * This method does the merge Step of merging 
	 * the sub arrays
	 * 
	 */
	private void merge(int array[], int low,int middle,int high) {
		
		//find size of two arrays to be merged
		int n1 = middle-low+1;
		int n2 = high-middle;
		
		//create temp arrays with the size
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		
		//Copy the Data to the Temp Arrays
		for(int i=0;i<n1;++i) {
			leftArray[i] = array[low+i];
		}
		
		for(int j=0;j<n2;++j) {
			rightArray[j] = array[middle+1+j];
		}
		
		//Merge the Temp Arrays
		
		//Initial Index of the first and second sub Arrays
		int i=0,j=0;
		//Initial Index of the merged SubArray
		int  k = low;
		while(i<n1 && j<n2) {
			if(leftArray[i]<=rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			//either case increase the index of k, as the element gets copied any way
			k++;
		}
		
		//copy the remaining elements of leftArray
		while(i<n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		
		//copy the remaining elements of rightArray
		while(j<n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
		
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		int[] input = new int[]{3,4,5,1,2,7,6,8};
		int[] result = mergeSort.mergeSort(input,0,input.length-1);
		if(result!=null && result.length>0) {
			for(int elem : result) {
				System.out.print("  "+elem);
			}
		}
	}

}
