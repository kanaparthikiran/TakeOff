/**
 * 
 */
package com.datastructures.array;

/**
 * @author kkanaparthi
 * 
 * This class is used to find the number that is present in an array
 * for odd number of times.
 * 
 * It uses the XOR logic, as XOR for a number with the same number will 
 * become 0, the last remaining element is the Odd number of times occurring
 * element
 *
 */
public class NumberWithOddOcuuranceCount {

	/**
	 * 
	 * @return
	 */
	private int findNumberWithOddOccurances(int [] array) {
		int xorOfAllElements = 0;
		if(array!=null && array.length>0) {
			for( int element : array) {
				xorOfAllElements ^=element;
			}
		}
		return xorOfAllElements;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumberWithOddOcuuranceCount numberWithOddOcuuranceCount = new
				NumberWithOddOcuuranceCount();
		int [] array = new int[]{1,1,2,2,3,3,2,2,5,5,3,6,6,4,4};
		int result = 
				numberWithOddOcuuranceCount.findNumberWithOddOccurances(array);
		System.out.println(" The Odd number of times Occuring element is "+result);
	}

}
