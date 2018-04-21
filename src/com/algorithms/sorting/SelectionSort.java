/**
 * 
 */
package com.algorithms.sorting;

import java.util.Arrays;

/**
 * @author Kiran Kanaparthi
 * 
 * This class performs Selection Sort.
 * It starts with the one element in the 
 * outer loop is chosen as a current Minimum.
 * Then in the Inner loop compare the currentMinimum
 * with every other element, if there is a lesser element
 * that the current minimum, mark that as the element
 * as the current minimum.
 * For each iteration of the outer loop, 
 * After the inner loop is completed, compare if the updated 
 * current minimum is the same as the initially chosen currentMinimum
 * , if they are not the same swap the two elements.
 *
 */
public class SelectionSort {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		int[] input = new int[]{3,4,1,5,10,9,8};
//		input = selectionSort.selectionSort(input);
//		
//		System.out.println(" After Sorting of the Elements is ");
//
//		if(input!=null) {
//			for(int elem : input) {
//				System.out.print(" "+ elem);
//			}
//		}
		
		System.out.println(" After Sorting of the Elements Again is ");

		input = selectionSort.makeSelectionSort(input);
		System.out.println("Array Elements "+ Arrays.toString(input));
	}

	/**
	 * This method makes the selection sort 
	 * of the elements
	 * 
	 * @param input
	 * @return
	 */
	private int[] makeSelectionSort(int input[]) {
		
		if(input!=null) {
			System.out.println("  input.length  "+input.length);
			for(int i=0;i<input.length;i++) {
				int minIndex = i; 
				int minValue = input[minIndex];
				// 3 4 1 5 10 9 8
				for(int j=i;j<input.length;j++) {
					if(input[j]<input[minIndex]) {
						minValue = input[j];
						minIndex = j;
					}
				}
				//After each iteration of the loop, if the minValue is not the
				//same as first minElement, swap the elements.
				if(minValue<input[i]) {
					int temp = input[i];
					input[i] = input[minIndex];
					input[minIndex] = temp;
				}
			}
		}
		return input;
	}
	
	
	
}
