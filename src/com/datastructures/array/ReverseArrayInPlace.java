/**
 * 
 */
package com.datastructures.array;

import java.util.Arrays;

/**
 * @author kkanaparthi
 * This class is used to reverse an array InPlace
 * To copy We just need to flip the elements from the beginning
 * with the elements at the end, until the size reaches the
 * middle 
 */
public class ReverseArrayInPlace {


	private int[] reverseArray(int a[])  {
		System.out.println(" Total Memory Available "+
				Runtime.getRuntime().freeMemory());
	    int aa[] = new int[Integer.MAX_VALUE];

		if(a==null || a.length==0) {
			return a;
		} else {
			for(int i=0;i<a.length/2;i++) {
				int temp = a[i];
				a[i] = a[a.length-1-i];
				a[a.length-1-i] = temp;
			}
		}
		return a;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseArrayInPlace reverseArrayInPlace = new ReverseArrayInPlace();
		int[] input = new int[]{1,2,4,6,7,8,3,9};
		int [] clonedArray = input.clone();

		int[] reverseArray = reverseArrayInPlace.reverseArray(input);

		if(reverseArray!=null && reverseArray.length>0) {
			System.out.println(Arrays.toString(input));
		}
		
		if(clonedArray!=null && clonedArray.length>0) {
			System.out.println(Arrays.toString(clonedArray));
		}
	}
	
	

}
