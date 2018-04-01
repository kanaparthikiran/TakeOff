/**
 * 
 */
package com.algorithms.sorting;

/**
 * @author kkanaparthi
 * 
 * This class performs the sorting of the elements 
 * using QuickSort
 * 
 * QuickSort chooses a Pivot Element, and sorts the 
 * elements on both sides of the Pivot such that the
 * elements less than the pivot are on the left side, and
 * the elements greater than the pivot are to the right side
 *
 */
public class QuickSort {
	

	/**
	 * This method does the quick sort recursively
	 * 
	 * @return
	 */
	private int[] quickSort(int input[],int left,int right) {
		int index = partition(input,left,right);
		if(left<index-1) {
			//Sort left half of the Array
			quickSort(input, left, index-1);
		}
		if(index<right) {
			//Sort right half of the Array
			quickSort(input, index, right);
		}
		return input;
	}
	
	/**
	 * This method performs the Partition
	 * @return
	 */
	private int partition(int []array,int left,int right) {
		//pick a pivot element
		int pivot = array[(left+right)/2];
		while(left<=right) {
			//find element on left side that should be on the right side
			while(array[left]<pivot) {
				left++;
			}
			while(array[right]>pivot) {
				right--;
			}
			//swap the elements, and move the left and right indices
			if(left<=right) {
				swap(array,left,right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	/**
	 * This method performs the swapping of the elements
	 * 
	 * @param array
	 * @param left
	 * @param right
	 */
	private void swap(int[] array,int left,int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		QuickSort quickSort = new QuickSort();
		int[] input = new int[]{3,4,5,1,25,7,6,9};
		int [] results = quickSort.quickSort(input,0,input.length-1);
		
		if(results!=null && results.length>0) {
			for(int i : results) {
				System.out.print(" "+i);
			}
		}
		
		
	}

}
