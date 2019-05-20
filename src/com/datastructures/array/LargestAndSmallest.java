/**
 * 
 */
package com.datastructures.array;

import java.util.Arrays;

/**
 * @author kkanaparthi
 * 
 * This class finds the Largest and Smallest numbers from the 
 * given Array.
 * 
 * To implement this in O(n) time we create two temporary variables
 * and store some array[0] value in them. Next start iterating through the 
 * Array, if any element is found greater than  default Max, make the element
 * as the Max, If any element is found less than the default Min, make the
 * element as the Min. 
 * 
 * After Iterating through the Array, the Min, and Max will have the 
 * Minimum and Maximum elements from the Array. 
 *
 */
public class LargestAndSmallest {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LargestAndSmallest largestAndSmallest = new LargestAndSmallest();
//		int[] result = largestAndSmallest.
//				findLargestAndSmallest(new int[]{2,5,6,1,7,10,-1});

		Arrays.stream(getLargestSecond(new int[]{2,5,6,1,7,10,-1})).forEach(System.out::println);
	}

	
	private static int[] getLargestSecond(int[] data) {
		int[] results = new int[2];
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		if(data!=null && data.length>0) {
			for(int element : data) {
				if(element>largest) {
					secondLargest = largest;
					largest = element;
				} else if(element>secondLargest && element<largest) {
					secondLargest = element;
				}
			}
		}
		results[0] = largest;
		results[1] = secondLargest;
		return results;
	}
	/**
	 * 
	 * @return
	 */
	//2,5,6,1,7,10
	private int[] findLargestAndSmallest(int input[]) {
		int[] resultArray = new int[2];
		int largest=input[0];
		int smallest=input[0];
		if(input!=null && input.length>0) {
			for(int element : input) {
				if(element>largest) {
					largest  = element;
				} else if(element<smallest) {
					smallest = element;
				}
			}
		}
		resultArray[0] = largest;
		resultArray[1] = smallest;
		return resultArray;
		
	}
}
