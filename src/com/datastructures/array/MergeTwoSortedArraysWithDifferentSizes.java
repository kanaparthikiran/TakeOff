/**
 * 
 */
package com.datastructures.array;

import java.util.Arrays;

/**
 * @author kkanaparthi
 * 
 *         This class merged two sorted Arrays with sizes m+n and n
 * 
 *         The Arrays are Sorted to begin with, the merged Array should also be
 *         sorted in the end.
 *
 */
public class MergeTwoSortedArraysWithDifferentSizes {

	/**
	 * This method merges two sorted Arrays in to a single Array
	 * 
	 * @param m
	 * @param mn
	 * @return
	 */
	private int[] mergeSortedArrays(int[] firstData, int[] secondData, int m, int n) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] mergedElements = new int[firstData.length + secondData.length];
		while (i <= m && j <= n) {
			if (firstData[i] < secondData[j]) {
				mergedElements[k] = firstData[i];
				i++;
				k++;
			} else if (firstData[i] > secondData[j]) {
				mergedElements[k] = secondData[j];
				j++;
				k++;
			} else {
				mergedElements[k] = firstData[i];
				i++;
				j++;
				k++;
			}
		}
		while (i <= m) {
			mergedElements[k] = firstData[i];
			i++;
		}
		while (j <= n) {
			mergedElements[k] = secondData[j];
			j++;
		}
		return mergedElements;
	}

	private static int[] mergeSortedArrays(int[] first, int[] second) {
		if(first==null && second==null) {
			return null;
		}
		if(first==null) {
			return second;
		}
		if(second==null) {
			return first;
		}
		int firstLength = first.length;
		int secondLength = second.length;
		int mergedLength = first.length+second.length;
		int merged[] = new int[mergedLength];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<firstLength && j<secondLength) {
			if(first[i]<=second[j]) {
				merged[k]= first[i];
				i++;
				k++;
			} else {
				merged[k]= second[j];
				j++;
				k++;	
			}
		}
		
		System.out.println(" i "+i+" j"+j+" k "+k);
		
		if(i<firstLength) {
			for(int c=i;c<firstLength;c++) {
				merged[k]= first[c];
				k++;
			}
		}
		if(j<secondLength) {
			for(int c=j;c<secondLength;c++) {
				merged[k]= second[c];
				k++;
			}
		}
		return merged;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MergeTwoSortedArraysWithDifferentSizes mergeTwoSortedArraysWithDifferentSizes =
				new MergeTwoSortedArraysWithDifferentSizes();

		// n=3 m+n=7 makes m=4
		int[] firstData = new int[] { 1, 5, 8 };
		int[] secondData = new int[] { 4, 6, 7, 9, 10 };
		
		System.out.println(" After Merge Array is "+ 
				Arrays.toString(mergeSortedArrays(firstData, secondData)));
		
//		int n = 3;
//		int m = 2;
//		int[] mergedArrays = mergeTwoSortedArraysWithDifferentSizes.mergeSortedArrays(firstData, secondData, m, n);
//
//		System.out.println(" The merged final Array is " + Arrays.toString(mergedArrays));
	}

}
