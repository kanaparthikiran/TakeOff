/**
 * 
 */
package com.test.array;

/**
 * @author kkanaparthi
 * 
 * This class finds the missing number from an array
 * It uses two approaches 
 * 
 * 1)Using sum of first n numbers which is n(n+1)/2, and 
 * subtract each of the array elements from the sum, which
 * gives the missing number.
 * 
 * 
 * 2) using XOR, Which finds the XOR of all numbers in the 
 *  given array, and also the XOR of first n numbers
 *  the XOR for these two calculations will give the missing number
 *  
 */
public class FindMissingNumberInArray {

	/**
	 * 
	 * @param array
	 * @return
	 */
	private int missingNumberFormula(int array[],int n) {
		int sumOfNNumbers = n*(n+1)/2;
		if(array!=null && array.length>0) {
			for(int elem : array) {
				sumOfNNumbers -= elem;
			}
		}
		System.out.println(" The missng number from the list is "+sumOfNNumbers);
		return sumOfNNumbers;
	}
	
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	private int missingNumberUsingXOR(int array[],int n) {
		int result = 0;
		int arrayElemsXOR = 0;

		int firstNNumbersXOR = 0;
		
		if(array!=null && array.length>0) {
			for(int elem:array) {
				arrayElemsXOR ^=elem;
			}
		}
		
		for(int i=1;i<=n;i++) {
			firstNNumbersXOR ^=i;
		}
		result = arrayElemsXOR^firstNNumbersXOR;
		
		return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindMissingNumberInArray findMissingNumberInArray = new FindMissingNumberInArray();
		int input[] = new int[]{1,2,4,6,7,8,9,10};
		int n = 10; 
		int missingNumberFormula = findMissingNumberInArray.missingNumberFormula(input,n);
		System.out.println(" Missing Number Using Formula is "+ missingNumberFormula);
		
		int missingNumberXor = findMissingNumberInArray.missingNumberUsingXOR(input,n);

		System.out.println(" Missing Number Using XOR is "+ missingNumberXor);

	}

}
