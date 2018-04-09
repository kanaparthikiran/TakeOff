/**
 * 
 */
package com.datastructures.array;

import java.util.Arrays;

/**
 * @author kkanaparthi
 * 
 * This class gets the smallest and second smallest
 * elements from the given Array.
 *  It starts 
 *
 */
public class SmallestAndSecondSmallestElements {


	/**
	 * This method gets the smallest and second smallest
	 * elements from the Array
	 * 
	 * @param input
	 * @return
	 */
	private int[] getTwoSmallestNumbers(int[] input) {
		int[] result = null;
		if(input!=null && input.length>0) {
			result = new int[2];
			int smallest = Integer.MAX_VALUE;
			int secondSmallest = Integer.MAX_VALUE;
			for(int i=0;i<input.length;i++) {
				if(input[i]<smallest) {
					secondSmallest = smallest;
					smallest = input[i];
				} else if(input[i]<secondSmallest)  {
					secondSmallest = input[i];
				}
			}
			result[1] = secondSmallest;
			result[0] = smallest;
		}
		return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmallestAndSecondSmallestElements smallestAndSecondSmallest =
				new SmallestAndSecondSmallestElements();
		int[] elements = new int[]{1,4,5,2,7,8,19,2};
		int result[] = smallestAndSecondSmallest.getTwoSmallestNumbers(elements);
		System.out.println(" The Smallest and Second Smallest Numbers are "+
				Arrays.toString(result));
	}

}
