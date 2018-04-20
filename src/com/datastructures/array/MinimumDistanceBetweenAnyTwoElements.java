/**
 * 
 */
package com.datastructures.array;

import java.util.Arrays;

/**
 * @author Kiran
 *
 */
public class MinimumDistanceBetweenAnyTwoElements {

	/**
	 * This method finds the minimum difference
	 * between any two numbers in an array
	 * @return
	 */
	private int findMinimumDifferenceBruteForce(int elements[]) {
		int minimumDistance = Integer.MAX_VALUE;
		if(elements!=null && elements.length>0) {
			for(int i=0;i<elements.length;i++) {
				for(int j=i+1;j<elements.length;j++) {
					if((Math.abs(elements[i]-elements[j]))<minimumDistance) {
						minimumDistance = Math.abs(elements[i]-elements[j]);	
					}
				}
			}
		}
		return minimumDistance;
	}
	
	private int findMinimumDistanceOptimum(int[] elements) {
		int minDistance = Integer.MAX_VALUE;
		if(elements!=null && elements.length>0) {
			Arrays.sort(elements);
			for(int i=0;i<elements.length-1;i++) {
				if(Math.abs(elements[i]-elements[i+1])<minDistance) {
					minDistance = Math.abs(elements[i]-elements[i+1]);
				}
			}
		}
		return minDistance;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MinimumDistanceBetweenAnyTwoElements minDistanceBetweenElements =
				new MinimumDistanceBetweenAnyTwoElements();
		int[] elements = new int[] {1,13,7,20,25,29};
		int minDistance = minDistanceBetweenElements.findMinimumDifferenceBruteForce(elements);
		System.out.println(" min Distance "+minDistance);
		
		int minDistanceOptimum =
				minDistanceBetweenElements.findMinimumDistanceOptimum(elements);
		System.out.println(" Minimum distance optimum "+minDistanceOptimum);
	}

}
