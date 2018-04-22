/**
 * 
 */
package com.datastructures.core;

/**
 * @author Kiran Kanaparthi
 *
 */
public class LowestCommonMultiple {

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private int findLCM(int a,int b) {
		int lcm = 0;
		lcm = (a>b)?a:b;
		while(true) {
			if(lcm%a==0 && lcm%b==0) {
				break;
			}
			lcm++;
			System.out.println(" lcm at each step "+ lcm);
		}
		return lcm;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LowestCommonMultiple lowestCommonMultiple =
				new LowestCommonMultiple();
		int lcmOfNumbers = 
				lowestCommonMultiple.findLCM(3, 5);
		System.out.println(" The LCM Of Numbers is "+ lcmOfNumbers);
	}

}
