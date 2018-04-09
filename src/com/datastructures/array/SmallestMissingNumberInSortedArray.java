/**
 * 
 */
package com.datastructures.array;

/**
 * @author kkanaparthi
 * 
 * This class finds the smallest missing number 
 * from a sorted Array.
 * 
 * It uses binary search to search for the missing element
 * Initially the start element is looked at, if that
 * is not equal to 0, then start Element is missing.
 * 
 * The compare with the middle Element, if the Middle element
 * is at the correct index(which is middle index) implies that 
 * the previous elements are not missing, and the missing element 
 * would be on the right side
 *  
 */
public class SmallestMissingNumberInSortedArray {
	
	/**
	 * This method gets the smallest missing number from 
	 * the Array
	 * 
	 * @param elements
	 * @return
	 */
	private int getSmallestMissingNumber(int[] elements,int start,int end) {
		int smallesMissingElement = -1;
		if(elements!=null && elements.length>0) {
			int mid  =  start+((end-start)/2);
			if(start<=end) {
				if(elements[start]!=start) {
					return start;
				}
				if(elements[mid]==mid) {
					return getSmallestMissingNumber(elements, mid+1, end);
				} else {
					return getSmallestMissingNumber(elements, start, mid-1);
				}
			}
		}
		return smallesMissingElement;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmallestMissingNumberInSortedArray smallesMissingNumber = 
				new SmallestMissingNumberInSortedArray();
		
		int [] elements = new int[]{0,1,2,3,4,5,7,8,9,10};
		
		int smallestMissingNumber = 
				smallesMissingNumber.getSmallestMissingNumber(elements,0,elements.length);
		System.out.println(" The Smallest missing Number is "+ smallestMissingNumber);
		
	}

}
