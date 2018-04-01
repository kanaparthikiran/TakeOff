/**
 * 
 */
package com.algorithms.sorting;

/**
 * @author kkanaparthi
 * 
 * This class sorts the input using BubbleSort
 * We start the beginning of the array, and  swap the 
 * first two elements, if the first is greater than the 
 * second, Then We go the next pair, and make swaps as needed
 * until the Array is sorted.
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] input = new int[]{3,5,7,2,8,9,1};
		
		System.out.println(" Before Sorting the Elements are ");
		if(input!=null) {
			for(int inputElemenet : input) {
				System.out.print(" "+ inputElemenet);
			}
		}

		input = bubbleSort.bubbleSortElements(input);
		
		System.out.println("\n\n\n After Sorting the Elements are ");
		if(input!=null) {
			for(int inputElemenet : input) {
				System.out.print(" "+ inputElemenet);
			}
		}
	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	private int[] bubbleSortElements(int input[]) {
		if(input!=null) {
			for(int i=0;i<input.length-1;i++) {
				for(int j=0;j<input.length-1-i;j++) {
//					System.out.println("\n input[j] "+ input[j]
//							+"  input[j+1] "+input[j+1]+"  j "+j);
					if(input[j]>input[j+1]) {
						int temp = input[j+1];
						input[j+1] = input[j];
						input[j] = temp;
					}
				}
				System.out.println("\n After Each Iteration, the Elements are ");

				if(input!=null) {
					for(int inputElemenet : input) {
						System.out.print(" "+ inputElemenet);
					}
				}
			}
		}
		return input;
	}


}
