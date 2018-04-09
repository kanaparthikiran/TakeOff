/**
 * 
 */
package com.datastructures.array;

import java.util.Arrays;

/**
 * @author kkanaparthi
 * 
 * This class performs the reversal of the 
 * Array Rotation
 * 
 * It uses the same approach using backing up of the
 * elements, and shifting to reverse the array rotation 
 * effect. 
 * 
 */
public class ReverseArrayRotation {


	/**
	 * This method reverses the Array Rotation 
	 * 
	 * @param elements
	 * @return
	 */
	private int[] reverseArrayRotation(int [] elements) {
		if(elements!=null && elements.length>0) {
			int temp = elements[elements.length-1];
			for(int i=elements.length-1;i>0;i--) {
				 elements[i] = elements[i-1];
			}
			elements[0] = temp;
		}
		return elements;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseArrayRotation reverseArrayRotation = 
				new ReverseArrayRotation();
		int [] rotatedElements = new int[]{2,3,4,5,1};
		int[] reversedRotation =  reverseArrayRotation.
				reverseArrayRotation(rotatedElements);
		System.out.println(" Reversal after Array Rotation are "+
				Arrays.toString(reversedRotation));
	}

}
