/**
 * 
 */
package com.core.recursion;

/**
 * @author kkanaparthi
 * 
 * This class finds the Greatest 
 * Common Divisor for the given 2 
 * numbers
 *
 */
public class GreatestCommonDivisor {

	private int findGreatestCommonDivisor(int a, int b) {
		if(b!=0) {
			return findGreatestCommonDivisor(b, a%b);
		} else {
			return a;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GreatestCommonDivisor greatestCommonDivisor =
				new GreatestCommonDivisor();
		int a =150, b=25, gcd = 1;
		gcd = greatestCommonDivisor.findGreatestCommonDivisor(a,b);
		System.out.println(" The Greatest Common Divisor is "+gcd);
	}

}
