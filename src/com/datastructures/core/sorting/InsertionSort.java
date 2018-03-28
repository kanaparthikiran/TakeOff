/**
 * 
 */
package com.datastructures.core.sorting;

/**
 * @author kkanaparthi
 *
 */
public class InsertionSort {

	/**
	 * 
	 */
	public InsertionSort() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InsertionSort insertionSort  = new InsertionSort();
		int unsortedArray[] = new int[]{3,4,5,1,2,6,8,7,10,9};
		System.out.println("Array Elements Before Sorting ");
		for(int unsortedArrayElem : unsortedArray ) {
			System.out.print(unsortedArrayElem+" ");
		}
		unsortedArray = insertionSort.insertionSort(unsortedArray);
		
		System.out.println("Array Elements After Sorting ");
		for(int sortedArrayElem : unsortedArray ) {
			System.out.print(sortedArrayElem+" ");
		}
		System.out.println("The Array is Sorted In Main ");
		
	}

	public int[] insertionSort(int array[]) {
		
		int min = 0;
		int outerLoopCounter = 0;
		int innerLoopCounter = 0;
		int minIndex =0;
		
		for(int i=0;i<array.length;i++) {
			outerLoopCounter++;
			min = array[i];
			minIndex = 0; 
			for(int j=i;j<array.length;j++) {
				innerLoopCounter++;
				if(array[j]<min) {
					min = array[j] ;
					minIndex = j;
				}
			}
				System.out.println("*********************  Inner Loop Completed *********************");
				swapElements(array, min, minIndex, i);
		}
		System.out.println("Returning the Sorted Array as "+ array+"  outerLoopCounter "+outerLoopCounter
				+"  innerLoopCounter "+innerLoopCounter);
		return  array;
	}

	/**
	 * @param array
	 * @param min
	 * @param minIndex
	 * @param i
	 */
	private void swapElements(int[] array, int min, int minIndex, int i) {
		if(min<array[i]) {
			System.out.println("Swapping Operation is Started , Before Swap array[i]  "+array[i] +" min "+min);
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
			System.out.println("Swapping Operation is Completed , After Swap array[i]  "+array[i] +" min "+min );
		}
	}
}
