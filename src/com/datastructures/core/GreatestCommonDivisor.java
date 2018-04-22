/**
 * 
 */
package com.datastructures.core;

/**
 * @author Kiran Kanaparthi
 *
 */
public class GreatestCommonDivisor {

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private int findGcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return findGcd(b,a%b);
 	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GreatestCommonDivisor greatestCommonDivisor =
				new GreatestCommonDivisor();
		int gcdOfNumbers = 
				greatestCommonDivisor.findGcd(10, 15);
		System.out.println(" The GCD of the Numbers is "+ gcdOfNumbers);
	}

}
