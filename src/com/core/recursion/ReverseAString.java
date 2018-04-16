/**
 * 
 */
package com.core.recursion;

import java.util.Arrays;

/**
 * @author kkanaparthi
 *
 *	This class is used to reverse a String Recursively
 *
 */
public class ReverseAString {

	/**
	 * 
	 * @param input
	 * @return
	 */
	private String reverseString(String input) {
		String reversedString = null;
		if(input!=null) {
			char[] charArray = input.toCharArray();
			for(int i=0;i<charArray.length/2;i++) {
				char temp = charArray[i];
				charArray[i] = charArray[charArray.length-1-i];
				charArray[charArray.length-1-i] = temp;
			}
			reversedString =
					Arrays.toString(charArray);
		}
		return reversedString;
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private String reverseStringRecursive(String input) {
		String reversedString = null;
		if(input!=null) {
			if(input.length()==0) {
				return input;
			} else {
			    return reverseStringRecursive
			    		(input.substring(1)) + input.charAt(0);
			}
		}
		return reversedString;
		
	}
	
	/**
	 * 
	 * @param n
	 */
	private int printSumOfNNumbers(int n) {
		if(n<=1) {
			return 1;
		} else {
			return n+printSumOfNNumbers(n-1);
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseAString reverseAString = new ReverseAString();
		String input ="AAA";
		String result = 
				reverseAString.reverseStringRecursive(input);
		System.out.println(" The Response String is "
				+ result);
		int sumOfNNumbers = reverseAString.printSumOfNNumbers(10);
		System.out.println(" The sum of n numbers is "+ sumOfNNumbers);
	}
	
	

}
