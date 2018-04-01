/**
 * 
 */
package com.algorithms.sorting;

/**
 * @author kkanaparthi
 *
 */
public class SelectionSort {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		int[] input = new int[]{3,4,1,5,10,9,8};
		input = selectionSort.makeSelectionSort(input);
		
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
	private int[] makeSelectionSort(int input[]) {
		
		if(input!=null) {
			System.out.println("  input.length  "+input.length);
			for(int i=0;i<input.length;i++) {
				int minIndex = i; 
				// 3 4 1 5 10 9 8
				for(int j=i+1;j<input.length;j++) {
					if(input[j]<input[minIndex]) {
						System.out.println(" Before j "+j+" minIndex "+minIndex
								+" input[j] "+input[j]+" input[minIndex] "+input[minIndex]);
						int temp = input[j];
						input[j] = input[minIndex];
						input[minIndex] = temp;
						
						System.out.println(" After j "+j+" minIndex "+minIndex
								+" input[j] "+input[j]+" input[minIndex] "+input[minIndex]);

						minIndex = j;

					}
				}
			}
		}
		
		return input;
	}
}
