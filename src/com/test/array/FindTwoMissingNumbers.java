/**
 * 
 */
package com.test.array;

/**
 * @author kkanaparthi
 * 
 * This class finds two missing numbers from an Array
 * 
 * It uses the XOR approach to find the results
 * and uses the three step approach
 * 
 * First will do the XOR to find the missing number(which could be 
 * the sum of the two numbers, says 3 and 5 are missing from the Array,
 * We get 8, as the Array is sorted 8 can not be the sum of 4 and 4.
 * So 8 has to be the sum of one number less than 4(half of it) and 
 * one number more than it
 * 
 */
public class FindTwoMissingNumbers {

	/**
	 * This method finds the missing two numbers from the Array
	 * 
	 * @param input
	 * @param n
	 * @return
	 */
	private int[] missingTwoNumbers(int[] input,int n) {
		int result [] = new int[2];
		int XOROfAllNElements = 0;
		int XOROfAArrayElements = 0;
		int sumOfMissingNumbers = 0;
		
		//Sum of All Array Elements
		if(input!=null && input.length>0) {
			for(int element : input ) {
				XOROfAArrayElements ^=element;
			}
		}
		//Sum of First N Numbers
		for(int i=1;i<=n;i++) {
			XOROfAllNElements ^=i;
		}
		
		//Sum of Missing Numbers
		sumOfMissingNumbers = XOROfAArrayElements^XOROfAllNElements;
		
		int middle = sumOfMissingNumbers/2;
		System.out.println(" middle "+ middle+"  sumOfMissingNumbers "
							+sumOfMissingNumbers);
		
		int middleLessXOR = 0;
		
		for(int i=1;i<=middle;i++) {
			middleLessXOR ^=i;
		}
		int XOROfArrayElementsUpToMiddle = 0;
		
		for(int i=0;i<=n-1;i++) {
			if(input[i]<=middle) {
				XOROfArrayElementsUpToMiddle^=input[i];
			} else {
				break;
			}
		}
		
		result[0] = middleLessXOR^XOROfArrayElementsUpToMiddle;
		
		System.out.println("  middleLessXOR "+middleLessXOR
				+"  XOROfArrayElementsUpToMiddle "+XOROfArrayElementsUpToMiddle
				+" result[0] "+result[0]);
		
		int middleMoreXOR = 0;
		for(int i=middle+1;i<=n;i++) {
			middleMoreXOR ^=i;
		}
		int XOROfAllElementsAfterMiddle = 0;
		for(int i=0;i<input.length;i++) {
			if(input[i]>middle) {
				XOROfAllElementsAfterMiddle^=input[i];
			}
		}
		result[1] = middleMoreXOR^XOROfAllElementsAfterMiddle;
		
		System.out.println("  middleMoreXOR "+middleMoreXOR
				+"  XOROfAllElementsAfterMiddle "+XOROfAllElementsAfterMiddle);
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindTwoMissingNumbers findTwoMissingNumbers = new FindTwoMissingNumbers();
		int[] inputArray = new int[]{1,2,4,6,7,8,9,10};
		int n = 10;
		int [] resultArray  = findTwoMissingNumbers.missingTwoNumbers(inputArray, n);
		
		System.out.println(" The missing numbers from the Array are as follows ");
		if(resultArray!=null && resultArray.length>0) {
			for(int i : resultArray) {
				System.out.print("  "+i);
			}
		}
	}

}
