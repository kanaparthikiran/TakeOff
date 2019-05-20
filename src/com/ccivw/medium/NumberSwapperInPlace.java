/**
 * 
 */
package com.ccivw.medium;

/**
 * @author kkanaparthi
 *
 */
public class NumberSwapperInPlace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		System.out.println(" Before Swap a "+a+" b "+b);
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("After Swap a "+a+" b "+b);
		
	}


}
