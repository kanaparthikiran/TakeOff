/**
 * 
 */
package com.datastructures.array;

import java.util.Arrays;

/**
 * @author kkanaparthi
 * 
 * This class merged two sorted Arrays with sizes m+n and n
 * 
 * The Arrays are Sorted to begin with, the merged Array should 
 * also be sorted in the end.
 *
 */
public class MergeTwoSortedArraysWithDifferentSizes_TBD {

	
	/**
	 * This method merges two sorted Arrays in to
	 * a single Array
	 * 
	 * @param m
	 * @param mn
	 * @return
	 */
	private int[] mergeSortedArrays(int []nElements, int[] mnElements,
			int m,int n) {
		int i = n;
		int j = 0;
		int k = 0;
		while(k< (m+n)) {
			if((i<(m+n)) && mnElements[i]<=nElements[j]
					|| (j==n)) {
				mnElements[k] = mnElements[i];
				k++;
				i++;
			} else {
				mnElements[k] = nElements[j];
				k++;
				j++;
			}
		}
		return mnElements;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MergeTwoSortedArraysWithDifferentSizes_TBD 
			mergeTwoSortedArraysWithDifferentSizes =
				new MergeTwoSortedArraysWithDifferentSizes_TBD();
		
		//n=3 m+n=7 makes  m=4
		int[] nElements = new int[]{1,5,8};
		int[] mnElements = new int[]{4,6,7,10,0,0,0};
		int n = 3;
		int m = 4;
		int[] mergedArrays =
				mergeTwoSortedArraysWithDifferentSizes.mergeSortedArrays(nElements, mnElements,m,n);
		
		System.out.println(" The merged final Array is "
				+ Arrays.toString(mergedArrays));
	}

}
