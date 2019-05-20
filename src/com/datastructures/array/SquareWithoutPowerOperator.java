/**
 * 
 */
package com.datastructures.array;

/**
 * @author kkanaparthi
 *
 */
public class SquareWithoutPowerOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" Square of the number is "+ square(10));

	}

	private static int square(int num)
	{
		int result = 0;
		for(int i=0;i<num;i++) {
			result+=num;
		}
		return result;
	}
}
