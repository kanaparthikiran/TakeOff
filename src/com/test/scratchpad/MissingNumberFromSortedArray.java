/**
 * 
 */
package com.test.scratchpad;

/**
 * @author Kiran Kanaparthi
 *
 */
public class MissingNumberFromSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MissingNumberFromSortedArray missingNumberFromSortedArray =
				new MissingNumberFromSortedArray();
		int[] numbers = {1,2,4,5,6,7};
		int missingNumbers =
				missingNumberFromSortedArray.findMissingNumber(numbers,7);
		System.out.println("  missingNumbers  "+missingNumbers);
	}
	
	
	/**
	 * 
	 * @param elements
	 * @return
	 */
	private int findMissingNumber(int elements[],int length) {
		int missingNumber = 0;
		if(elements!=null && elements.length>0) {
			
			int sumXORAll = 0;
			for(int i=1;i<=length;i++) {
				sumXORAll ^=i;
			}
			int sumXORArray = 0;
			for(int element : elements) {
				sumXORArray ^=element;
			}
			System.out.println("sumXORArray "+sumXORArray+"  sumXORAll "+sumXORAll);
			missingNumber = sumXORAll^sumXORArray;
		}
		return missingNumber;
	}

}
