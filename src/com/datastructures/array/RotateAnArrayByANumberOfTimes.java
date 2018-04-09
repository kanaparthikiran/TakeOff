/**
 * 
 */
package com.datastructures.array;

import java.util.Arrays;

/**
 * @author kkanaparthi
 * 
 * This Class Rotates an Array by the Given Number 
 * of times.
 * 
 *
 */
public class RotateAnArrayByANumberOfTimes {


	/**
	 * This method rotates an array by a 
	 * number of times
	 * 
	 * @return
	 */
	private int[] rotateArrayByTimes(int a[], int positions) {
		for(int p=0;p<positions;p++) {
			int temp = a[0];
			for(int i=0;i<a.length-1;i++) {
				a[i] = a[i+1];
			}
			a[a.length-1] = temp;
			System.out.println(" Array After each rotation ");
			System.out.println(Arrays.toString(a));
		}
		return a;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RotateAnArrayByANumberOfTimes rotateAnArrayByANumberOfTimes =
				new RotateAnArrayByANumberOfTimes();
		int input[] = new int[]{1,2,3,4,5}; 
		int positions = 4;
		
		int [] rotatedArray = 
				rotateAnArrayByANumberOfTimes.rotateArrayByTimes(input,positions);
		System.out.println("\n\n The Rorated Array Elements "
				+ Arrays.toString(rotatedArray));
	}

}
