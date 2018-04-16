/**
 * 
 */
package com.algorithms.sorting;

/**
 * @author Kiran Kanaparthi
 *
 */
public class SelectionSort {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		int[] input = new int[]{3,4,1,5,10,9,8};
		input = selectionSort.selectionSort(input);
		
		System.out.println(" After Sorting of the Elements is ");

		if(input!=null) {
			for(int elem : input) {
				System.out.print(" "+ elem);
			}
		}
	}

	
	/**
	 * This method makes the selection sort 
	 * of the elements
	 * 
	 * @param input
	 * @return
	 */
	private int[] selectionSort(int input[]) {
		
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
