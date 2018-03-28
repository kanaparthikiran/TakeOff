/**
 * 
 */
package com.datastructures.core;

/**
 * @author kkanaparthi
 * 
 * This class reverses an integer
 * It used the Division and Modulo division
 * At each step the modulo division is being 
 * used to get the modulus, and decimal form
 * is used to multiply the variable by 10 for the remainder
 * in each step
 * 
 *
 */
public class ReverseAnInteger {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseAnInteger reverseAnInteger = new ReverseAnInteger();
		System.out.println(" The Integer Max is "+ Integer.MAX_VALUE);
		int reverse = reverseAnInteger.reverseInteger(-10);
		System.out.println(" The reverse of the Input Integer is "+ reverse);
	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	private int reverseInteger(int input) {
		int output = 0;
		boolean negativeValue = false;
		if(input<0) {
			input = 0-input;
			negativeValue = true;
		}
		while(input!=0) {
            if( output*10 >= Integer.MAX_VALUE || 
            		output*10 <= Integer.MIN_VALUE) {
                return 0;
            }
			if(output*10<=Integer.MAX_VALUE) {
				output = output*10+input%10;
				input = input/10;
				System.out.println(" input "+input+" output "+output);
			} else {
				return 0;
			}
		}
		if(negativeValue) {
			output = 0-output;
		}
		return output;
	}

	   
}
