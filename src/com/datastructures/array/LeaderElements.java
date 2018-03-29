/**
 * 
 */
package com.datastructures.array;

import java.util.Arrays;

/**
 * @author kkanaparthi
 * 
 * This class is used to find the Leader Elements in an Array
 * Leader Element in an Array is such that all the elements to 
 * the right of it are less than the element, and the right most 
 * element is the Leader by default
 *
 */
public class LeaderElements {

	/**
	 * This method returns the Leader Elements from 
	 * the given array
	 * 
	 * @param input
	 * @return
	 */
	private int[] getLeaderElements(int input[]) {
		int[] leadersArray =  null;
		int j = 1;
		int currentMaximum = Integer.MIN_VALUE;
		if(input!=null && input.length>0) {
			leadersArray = new int[input.length];
			Arrays.fill(leadersArray, -1);
			int rightMostElement = input[input.length-1];
			leadersArray[0] = rightMostElement;

			currentMaximum = rightMostElement;
			for(int i=input.length-2;i>=0;i--) {
				if(input[i]>currentMaximum) {
					leadersArray[j] = input[i];
					currentMaximum = input[i];
					j++;
				}
			}
		}
		return leadersArray;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LeaderElements leaderElements = new LeaderElements();
		int[] elements = new int[]{2,3,5,6,11,8,10,1,3};
		int[] resultArray = leaderElements.getLeaderElements(elements);
		if(resultArray!=null && resultArray.length>0) {
			for(int elem : resultArray) {
				System.out.print(" "+elem);
			}
		}
	}

}