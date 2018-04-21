/**
 * 
 */
package com.algorithms.sorting;

/**
 * @author Kiran Kanaparthi
 * 
 * This class Does the Insertion Sorting on the
 * Given Array.
 * 
 * The Array is traversed from left to right, at each step
 * one Key Value is chosen in the outer loop.
 * 
 * In the Inner Loop, Start Iterating from the Element at the 
 * Key Index, and compare the Key with Every Element in the 
 * Array up to index 0, If they are not in order, the consecutive
 * elements are swapped(key values does not change, and is used
 * for comparisons only)
 *
 */
public class InsertionSort {


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		InsertionSort insertionSort = new InsertionSort();
		
		System.out.println(" Before calling insertion sort");

		int[] elements = new int[]{5,4,1,3,2,7,0,5};
		insertionSort.insertionSort(elements);
		System.out.println(" The insertion sort elements are as follows ");
		
		if(elements!=null && elements.length>0) {
			for(int element: elements) {
				System.out.print(" "+element);
			}
		}
	}

	
	//5 4 1 3 2 7
	/**
	 * 
	 * @param input
	 * @return
	 */
	private int[] insertionSort(int[] input) {
		int temp=0,key=0;
		if(input!=null && input.length>0) {
			for(int i=1;i<input.length;i++) {
				int j = i-1;
				key = input[i];
				while(j>=0 && key<input[j]) {
					temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
					j--;
				}
			}
		}
		return input;
	}
}
