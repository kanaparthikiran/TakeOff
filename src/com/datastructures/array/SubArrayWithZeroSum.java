/**
 * 
 */
package com.datastructures.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kkanaparthi
 * 
 * This class finds if there is a SubArray with 
 * Zero sum
 * 
 * It uses the technique to find If the Sum of all the previous 
 * elements up to itself is either zero, or sum for all the
 * elements in the Array
 *  
 * 
 */
public class SubArrayWithZeroSum {


	/**
	 * This method finds out the sum of all the elements 
	 * up to itself, if the sum ever becomes 0 or equal to 
	 * the previous sum, then that implies that the subArray 
	 * is present with Zero Sum
	 * 
	 * @return
	 */
	private boolean isSubArrayPresentWithZeroSum(int elements[]) {
		boolean isSubArrayPresentWithZeroSum = false;
		Set<Integer> setWithSum = new HashSet<>();
		int sum = 0;
		if(elements!=null && elements.length>0) {
			for(int i=0;i<elements.length;i++) {
				sum +=elements[i];
				if(sum==0||setWithSum.contains(sum)) {
					return true;
				}
				setWithSum.add(elements[i]);
			}
		}
		return isSubArrayPresentWithZeroSum;
	}
	
	
	/**
	 * 
	 * @param elements
	 * @return
	 */
	private int firstRepeatingElement(int[] elements) {
		int firstRepeatingElement  = -1;
		if(elements!=null && elements.length>0) {
			Set<Integer> numbersSet = new HashSet<>();
			for(int i=elements.length-1;i>=0;i--) {
				if(numbersSet.contains(elements[i])) {
					firstRepeatingElement = elements[i];
				}
				numbersSet.add(elements[i]);
			}
		}
		return firstRepeatingElement;
	}
	
	
	/**
	 * 
	 * @param elements
	 * @return
	 */
	private int lastRepeatingElement(int[] elements) {
		int lastRepeatingElement  = -1;
		if(elements!=null && elements.length>0) {
			Set<Integer> numbersSet = new HashSet<>();
			for(int i=0;i<elements.length;i++) {
				if(numbersSet.contains(elements[i])) {
					lastRepeatingElement = elements[i];
				}
				numbersSet.add(elements[i]);
			}
		}
		return lastRepeatingElement;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SubArrayWithZeroSum subArrayWithZeroSum =
				new SubArrayWithZeroSum();
		int [] elements = new int[]{1,2,3,1,2,5,-4,6};
		boolean isSubArrayWithZeroSum = 
				subArrayWithZeroSum.isSubArrayPresentWithZeroSum(elements);
		System.out.println(" There is a SubArray with Zero Sum "+ isSubArrayWithZeroSum);
		int firstRepeatingElement = 
				subArrayWithZeroSum.firstRepeatingElement(elements);
		System.out.println(" First Repeating Element "+ firstRepeatingElement);

		int lastRepeatingElement = 
				subArrayWithZeroSum.lastRepeatingElement(elements);
		System.out.println(" Last Repeating Element "+ lastRepeatingElement);
	}

}
