/**
 * 
 */
package com.datastructures.core;

/**
 * @author kkanaparthi
 *
 */
public class ArmstrongNumber {

	/**
	 * 
	 */
	public ArmstrongNumber() {
	}

	private static boolean isArmstrongNumber(int number) {
		System.out.println("Initially number  "+number);
			int orginal = number;
			int result =  0;
			
			while(number>0) {
				
				int remainder = number%10;
				System.out.println("remainder is  "+remainder);
				result = result + (remainder*remainder*remainder);
				number = number/10;
			}
			
			System.out.println("result  is "+result+" number  "+number);
			
			if(orginal==result) {
				return true;
			}
			
			return false;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean isArmstrongResult  = isArmstrongNumber(154);
		System.out.println("isArmStrong Result is  "+isArmstrongResult);
		
	}

}
