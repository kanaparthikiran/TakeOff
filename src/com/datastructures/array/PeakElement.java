/**
 * 
 */
package com.datastructures.array;

/**
 * @author kkanaparthi
 * 
 * This class is used to find the Peak Element of an
 * Array.
 * 
 * An Array can contain multiple Peak Elements, 
 * We need return one of the Peak Elements.
 * 
 * We use Binary Search to find the Peak Element, Will 
 * start with middle element, if it has the lest side and 
 * right side elements less than to it, then that is the Peak
 * Element.
 * 
 * If the Left side element is greater than the element, the 
 * Peak will be on the left side of the Middle element
 * 
 * If the Right side element is greater than the element,
 * the Peak will be on the right side of the Middle element
 *
 */
public class PeakElement {

	/**
	 * 
	 * @param input
	 * @param low
	 * @param high
	 * @return
	 */
	private int findPeakElement(int input[],int low,int high) {
		int middle = (low+high)/2;
		int peakElement = -1;
		if(middle==0 || input[middle]>=input[middle-1] &&
				middle==input.length-1 || input[middle]>=input[middle+1]) {
			return input[middle];
		} else if(middle>0 && input[middle]<input[middle-1])  {
			peakElement = findPeakElement(input, low, middle-1);
		} else {
			peakElement = findPeakElement(input, middle+1, high);
		} 
		return peakElement;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PeakElement peakElement = new PeakElement();
		int[] input = new int[]{1,2,3,4,5,25,6,8};
		int peak = peakElement.findPeakElement(input, 0, input.length-1);
		System.out.println(" The Peak Element of the Array is "+ peak);
	}

}
