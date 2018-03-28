/**
 * 
 */
package com.datastructures.core.sorting;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author kkanaparthi
 *
 */
public class QuickSort {

	/**
	 * This method performs the Quick Sort and 
	 * returns the sorted elements
	 * 
	 * @return
	 */
	private int[] quickSort(int input[],int left,int right) {
		int pivot;
		if(left>right) {
			return input;
		} else {
			pivot = input[left+right/2];
			int index = partition(input,left,right,pivot);
			quickSort(input, left, index-1);
			quickSort(input, index, right);

		}
		
		return input;
	}
	
	  void swap(int arr[],int i,int j)
	    {
	        int t = arr[i];
	        arr[i] = arr[j];
	        arr[j] = t;
	    }
	  
	
	/**
	 * 
	 * @param input
	 * @param left
	 * @param right
	 * @param pivot
	 */
	private int partition(int[] input,int left,int right,int pivot) {
		
		while(left<=right) {
			while(input[left]<pivot) {
				left++;
			}
			while(input[right]>pivot) {
				right++;
			}
			if(left<=right) {
				swap(input,left,right);
					left++;
					right--;
				}
			}
		}
		return left;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QuickSort  quickSort = new QuickSort();
		int[] input = new int[]{3,9,8,1,4,2,6,7,10};
		
		int[] response = quickSort.quickSort(input,0,input.length);
		
		Collections.sort(list);
		Arrays.toString(response);
	}

}
