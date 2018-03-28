/**
 * 
 */
package com.datastructures.sorting;

/**
 * @author kkanaparthi
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
		System.out.println("  input.length "+input.length);
		if(input!=null && input.length>0) {
			for(int i=1;i<input.length;i++) {
				key = input[i];
				for(int j=i-1;j>=0;j--) {
					System.out.println(" j "+j+" key "+key);
					if(key<input[j]) {
						temp = input[j];
						input[j] = input[j+1];
						input[j+1] = temp;						
					} 
				}
			}
			
		}
		
		return input;
	}
}
