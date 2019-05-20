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
public class MergeTwoSortedArraysWithDifferentSizes {

	
	/**
	 * This method merges two sorted Arrays in to
	 * a single Array
	 * 
	 * @param m
	 * @param mn
	 * @return
	 */
	private int[] mergeSortedArrays(int []firstData, int[] secondData,
			int m,int n) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[]mergedElements = new int[firstData.length+secondData.length];
		while(i<=m&&j<=n) {
			if(firstData[i]<secondData[j]) {
				mergedElements[k]=firstData[i];
				i++;
				k++;
			} else if(firstData[i]>secondData[j]) {
				mergedElements[k]=secondData[j];
				j++;
				k++;
			} else {
				mergedElements[k] = firstData[i];
				i++;
				j++;
				k++;
			}
		}
		while(i<=m) {
			mergedElements[k]=firstData[i];
			i++;
		}
		while(j<=n) {
			mergedElements[k] = secondData[j];
			j++;
		}
		return mergedElements;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MergeTwoSortedArraysWithDifferentSizes 
			mergeTwoSortedArraysWithDifferentSizes =
				new MergeTwoSortedArraysWithDifferentSizes();
		
		//n=3 m+n=7 makes  m=4
		int[] firstData = new int[]{1,5,8};
		int[] secondData = new int[]{4,6,7,10};
		int n = 3;
		int m = 2;
		int[] mergedArrays =
				mergeTwoSortedArraysWithDifferentSizes.
				mergeSortedArrays(firstData, secondData,m,n);
		
		System.out.println(" The merged final Array is "
				+ Arrays.toString(mergedArrays));
	}

}
